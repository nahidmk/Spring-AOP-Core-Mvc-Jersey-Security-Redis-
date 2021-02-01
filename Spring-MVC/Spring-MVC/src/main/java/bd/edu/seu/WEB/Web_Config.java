package bd.edu.seu.WEB;

import bd.edu.seu.Controller.HelloController;
import bd.edu.seu.Servlet.Dispatcher_Servlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Web_Config extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {Dispatcher_Servlet.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0] ;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
