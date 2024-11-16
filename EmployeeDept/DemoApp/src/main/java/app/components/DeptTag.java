package app.components;

import java.io.IOException;
import java.sql.SQLException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class DeptTag extends SimpleTagSupport{
    private String departments;

    public void setDepartments(String departments) {
        this.departments = departments;
    }

    @Override
    public void doTag() throws JspException, IOException {
        var context = super.getJspContext();
        var body = super.getJspBody();
        try(var con = EmpDBConnect.connect()){
            var statement = con.prepareStatement("select deptno, dname, loc from dept");
            var rs = statement.executeQuery();
            while (rs.next()) {
                var Department = new Departments(rs);
                context.setAttribute(departments, Department);
                body.invoke(null);
            }
            statement.close();
            rs.close();
        } catch (SQLException e) {
            throw new RuntimeException();
        }
    }
}
