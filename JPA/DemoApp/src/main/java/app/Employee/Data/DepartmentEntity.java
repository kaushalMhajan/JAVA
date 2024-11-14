package app.Employee.Data;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "dept")
public class DepartmentEntity {
    @Id
    @Column(name = "deptno")
    private double Id;

    @Column(name = "dname")
    private String deptname;

    @Column(name = "loc")
    private String location;

    @OneToMany
    @JoinColumn(name = "deptno")
    private List<EmployeeEntity> employees = new ArrayList<>();

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setEmployees(List<EmployeeEntity> employees) {
        this.employees = employees;
    }

    public List<EmployeeEntity> getEmployees() {
        return employees;
    }

    public void setId(double id) {
        Id = id;
    }

    public double getId() {
        return Id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

}
