package com.xworkz.kannada.matrimony;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Matrimony extends HttpServlet{
	
	public Matrimony() {
	System.out.println("created "+this.getClass().getSimpleName());
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("invoked doGet Method");
		String requestForFirstName=req.getParameter("firstname");
		String reqForLastName=req.getParameter("lastname");
		String reqForEmail=req.getParameter("email");
		String reqForPassword=req.getParameter("password");
		String reqForConfirmPassword=req.getParameter("confirmpassword");
		System.out.println(requestForFirstName);
		System.out.println(reqForLastName);
		System.out.println(reqForEmail);
		System.out.println(reqForPassword);
		System.out.println(reqForConfirmPassword);
		
		//super.doGet(req, resp);
		resp.setContentType("text/html");
		
		PrintWriter writer=resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<b>");
		writer.println("Registration Successful for "+requestForFirstName+" "+reqForLastName);
		writer.println("</b>");
		writer.println("</body>");
		writer.println("</html>");
		writer.flush();

}
}
