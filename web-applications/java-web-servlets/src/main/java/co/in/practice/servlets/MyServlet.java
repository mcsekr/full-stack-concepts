package co.in.practice.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;



public class MyServlet implements Servlet {

	 private ServletConfig config = null;

	    @Override
	    public void init(ServletConfig config) throws ServletException {
	        this.config = config;
	        System.out.println("iniside init method : " + config.getServletName());

	    }

	    @Override
	    public ServletConfig getServletConfig() {
	        return this.config;
	    }

	    @Override
	    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	        System.out.println("inside service method");
	        res.setContentType("text/html");

	        PrintWriter out = res.getWriter();
	        out.print("<html><body>");
	        out.print("<b> Servlet Interface Example</b>");
	        out.print("</body></html>");
	        
	        
	    }

	    @Override
	    public String getServletInfo() {
	        return "Demonstrated implementaton of Servlet interface";
	    }

	    @Override
	    public void destroy() {
	        System.out.println("inside destroy method");
	    }

}
