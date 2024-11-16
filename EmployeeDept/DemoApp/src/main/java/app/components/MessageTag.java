package app.components;

import java.io.IOException;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.tagext.SimpleTagSupport;

public class MessageTag extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        var context = super.getJspContext();
        context.getOut().print("Ready for Jsp");
    }
    
}