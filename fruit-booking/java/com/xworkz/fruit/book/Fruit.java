package com.xworkz.fruit.book;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Fruit extends HttpServlet{
	
	public Fruit() {
	System.out.println("created "+this.getClass().getSimpleName());
	}
	
   @Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Overrided doGet");
	String reqForName=req.getParameter("name");
	String reqForQuantity=req.getParameter("quantity");
	String reqForDeliver=req.getParameter("deliver");
	String reqForGift=req.getParameter("gift");
	String reqForOccasion=req.getParameter("occasion");
	System.out.println(reqForName);
	System.out.println(reqForQuantity);
	System.out.println(reqForDeliver);
	System.out.println(reqForGift);
	System.out.println(reqForOccasion);
	//super.doGet(req, resp);
	
	resp.setContentType("text/html");
	PrintWriter writer=resp.getWriter();
	writer.println("<html>");
	writer.println("<body>");
	writer.println("<h1>");
	writer.println("Fruit Booking");
	writer.println("</h1>");
	writer.println("<b>");
	writer.println("Fruit Booking is Successful for "+reqForName);
	writer.println("</b>");
	writer.println("</body>");
	writer.println("</html>");
	writer.flush();
}

}
