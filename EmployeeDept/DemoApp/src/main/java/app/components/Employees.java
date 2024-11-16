package app.components;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Employees {

    private int empId;

    private String ename;

    private String job;
    
    private Date hireDate;
    
    private int sal;
    
    private int deptNo;

    public Employees(ResultSet rs) throws SQLException{
        empId = rs.getInt("EMPNO");
        ename = rs.getString("ENAME");
        job = rs.getString("JOB");
        hireDate = rs.getDate("HIREDATE");
        sal = rs.getInt("SAL");
        deptNo = rs.getInt("DEPTNO");
    }

    public int getEmpId() {
        return empId;
    }

    public String getEname() {
        return ename;
    }

    public String getJob() {
        return job;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public int getSal() {
        return sal;
    }

    public int getDeptNo() {
        return deptNo;
    }


    
}
