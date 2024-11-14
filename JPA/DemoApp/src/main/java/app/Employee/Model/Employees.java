package app.Employee.Model;
import app.Employee.Data.EmployeeEntity;

public record Employees(int eId,String ename,double salary,int deptno) {
    public static Employees fromDEmployees(EmployeeEntity entity){
        return new Employees(entity.getId(), entity.getEname(), entity.getSalary(),entity.getDeptno());
    }
}
