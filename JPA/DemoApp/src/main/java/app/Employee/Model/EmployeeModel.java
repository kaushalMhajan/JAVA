package app.Employee.Model;
import app.Employee.Data.DepartmentEntity;
import app.Employee.Data.EmployeeEntity;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EmployeeModel {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("app.Employee.Data");

    public static Iterable<Employees> getEmployees() throws Throwable {
        try (var em = emf.createEntityManager()) {
            var query = em.createQuery("SELECT e FROM EmployeeEntity e WHERE e.salary > 1000", EmployeeEntity.class);
            return query.getResultStream()
                    .map(Employees::fromDEmployees)
                    .toList();
        }
    }

    public static Iterable<Departments> getDepartments() throws Throwable {
        try (var dep = emf.createEntityManager()) {
            var query = dep.createQuery("SELECT d FROM DepartmentEntity d", DepartmentEntity.class);
            return query.getResultStream()
                    .map(Departments::fromDepartments)
                    .toList();
        }
    }

    public static int generateId(String type) throws Throwable {
        try (var count = emf.createEntityManager()) {
            var tx = count.getTransaction();
            tx.begin();
            try {
                if(type.equals("dept")){
                    var query1 = count.createQuery("UPDATE CounterEntity c SET c.currentvalue=c.currentvalue + 1 WHERE c.tb_name = 'dept'");
                    var query2 = count.createQuery("SELECT c.currentvalue*c.seedvalue FROM CounterEntity c WHERE c.tb_name = 'dept'", Integer.class);
                    query1.executeUpdate();
                    var deptid = query2.getSingleResult();
                    tx.commit();
                    return deptid;
                }else{
                    var query1 = count.createQuery("UPDATE CounterEntity c SET c.currentvalue=c.currentvalue + 1 WHERE c.tb_name = 'empjpa'");
                    var query2 = count.createQuery("SELECT c.currentvalue+c.seedvalue FROM CounterEntity c WHERE c.tb_name = 'empjpa'", Integer.class);
                    query1.executeUpdate();
                    var empid = query2.getSingleResult();
                    tx.commit();
                    return empid;
                }
            } catch (Exception e) {
                if (tx.isActive()) {
                    tx.rollback();
                }
                System.out.println("Error : " + e.getMessage());
            }
        }
        return 0;
    }

    public static boolean addDepartment(String dname, String location) throws Throwable {
        double deptid = (double)generateId("dept");
        try (var dept = emf.createEntityManager()) {
            var department = dept.find(DepartmentEntity.class, deptid);
            if (department == null) {
                department = new DepartmentEntity();
                department.setId(deptid);;
            }
            department.setDeptname(dname);
            department.setLocation(location);
            var tx = dept.getTransaction();
            tx.begin();
            dept.persist(department);
            tx.commit();
            return true;
        }
    }

    public static boolean addEmployee(String ename, double salary, int deptno) throws Throwable {
        int empid = generateId("emp");
        try (var emp = emf.createEntityManager()) {
            var employee = emp.find(EmployeeEntity.class, empid);
            if (employee == null) {
                employee = new EmployeeEntity();
                employee.setId((int) empid);
            }
            employee.setEname(ename);
            employee.setSalary(salary);
            employee.setDeptno(deptno);

            var tx = emp.getTransaction();
            tx.begin();
            emp.persist(employee);
            tx.commit();
            return true;
        }
    }

}
