package app.Employee.Model;
import app.Employee.Data.DepartmentEntity;

public record Departments(double deptId,String deptname,String location,long employees) {
     public static Departments fromDepartments(DepartmentEntity entity){
        var noofEmployees = entity.getEmployees().stream().count();
        return new Departments(entity.getId(), entity.getDeptname(),entity.getLocation(),noofEmployees);
    }
}
