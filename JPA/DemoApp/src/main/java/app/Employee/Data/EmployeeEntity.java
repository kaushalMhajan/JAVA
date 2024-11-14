package app.Employee.Data;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "empjpa")
public class EmployeeEntity {

    @Id
    @Column(name = "empno")
    private int Id;

    @Basic
    @Column
    private String ename;

    @Column
    private double salary;

    @Column
    private int deptno;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEname() {
        return ename;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }
}
