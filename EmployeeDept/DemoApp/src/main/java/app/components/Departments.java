package app.components;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Departments {
    private int deptNo;

    private String dname;

    private String location;

    public int getDeptNo() {
        return deptNo;
    }

    public String getDname() {
        return dname;
    }

    public String getLocation() {
        return location;
    }

    public Departments(ResultSet rs) throws SQLException{
        deptNo = rs.getInt("DEPTNO");
        dname = rs.getString("DNAME");
        location = rs.getString("LOC");
    }


}
