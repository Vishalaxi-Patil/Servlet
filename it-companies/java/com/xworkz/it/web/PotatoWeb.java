package com.xworkz.it.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PotatoWeb extends HttpServlet{
	
	public PotatoWeb() {
		System.out.println("created "+this.getClass().getSimpleName());
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("invoked doGet Method");
		String requestForColor=req.getParameter("color");
		String reqForPrice=req.getParameter("price");
		System.out.println(requestForColor);
		System.out.println(reqForPrice);
		//super.doGet(req, resp);
		resp.setContentType("text/html");
		
		PrintWriter writer=resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		writer.println("<h1>");
		writer.println("This is writer method");
		writer.println("</h1>");
		writer.println("</br>");
		writer.println("<b>");
		writer.println("Potato "+requestForColor+" data is success and price is "+reqForPrice);
		writer.println("</b>");
		writer.println("</body>");
		writer.println("</html>");
		writer.flush();
		
	}

}
