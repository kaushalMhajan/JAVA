package app.components;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class EmpTag extends SimpleTagSupport {

    private String employees;

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    @Override
    public void doTag() throws JspException, IOException {
        var context = super.getJspContext();
        var body = super.getJspBody();
        try(var con = EmpDBConnect.connect()){
            var stmt = con.prepareStatement("select empno, ename, job, hiredate,sal,deptno from Emp");
            var rs = stmt.executeQuery();
            while(rs.next()){
                var Employee = new Employees(rs);
                context.setAttribute(employees, Employee);
                body.invoke(null);
            }
            stmt.close();
            rs.close();
        }catch(SQLException e){
            throw new RuntimeException();
        }
    }

}
