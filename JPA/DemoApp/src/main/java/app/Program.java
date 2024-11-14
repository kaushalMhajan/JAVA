package app;

import app.Employee.Data.DepartmentEntity;
import app.Employee.Model.EmployeeModel;

public class Program {

    public static void main(String[] args) throws Throwable {

        // if (args.length == 0) {
        //     var dept = EmployeeModel.getDepartments();
        //     for (var departments : dept) {
        //         System.out.printf("%.0f %s %s %d\n", departments.deptId(), departments.deptname(),
        //                 departments.location(), departments.employees());
        //     }
        // } else {
        //     String name = args[0];
        //     String location = args[1];
        //     var dept = EmployeeModel.addDepartment(name, location);
        //     if (dept)
        //         System.out.println("Department added successfully");
        // }

        if (args.length == 0) {
        var emp = EmployeeModel.getEmployees();
        for (var employees : emp) {
        System.out.printf("%d %s %.0f %d \n", employees.eId(), employees.ename(),
        employees.salary(),
        employees.deptno());
        }
        } else {
        String name = args[0];
        double salary = Double.parseDouble(args[1]);
        int deptno = Integer.parseInt(args[2]);
        var emp = EmployeeModel.addEmployee(name, salary, deptno);
        if (emp)
        System.out.println("Employee added successfully");
        }

    }
}
