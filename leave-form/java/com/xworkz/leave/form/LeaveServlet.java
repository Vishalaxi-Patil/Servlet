package com.xworkz.leave.form;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.leave.dao.LeaveDAO;
import com.xworkz.leave.dao.LeaveDAOImpl;
import com.xworkz.leave.entity.LeaveEntity;
import com.xworkz.leave.service.LeaveService;
import com.xworkz.leave.service.LeaveServiceImpl;


public class LeaveServlet extends HttpServlet{
	private LeaveService<LeaveEntity> service;

	public LeaveServlet() {
	System.out.println("created "+this.getClass().getSimpleName());
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		LeaveDAO dao=new LeaveDAOImpl();
		service=new LeaveServiceImpl(dao);
	}
	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String reqForName=req.getParameter("name");
		String reqForEmail=req.getParameter("email");
		String reqForLeaves=req.getParameter("leaves");
		int leave=Integer.parseInt(reqForLeaves);
		String reqForReason=req.getParameter("reason");
		String reqForStart=req.getParameter("start");
		String about=req.getParameter("about");
		System.out.println(reqForName);
		System.out.println(reqForEmail);
		System.out.println(reqForLeaves);
		System.out.println(reqForReason);
		System.out.println(reqForStart);
		System.out.println(about);
		
		resp.setContentType("text/html");
		PrintWriter writer=resp.getWriter();
		writer.println("<html>");
		writer.println("<body>");
		LeaveEntity entity=new LeaveEntity();
		entity.setName(reqForName);
		entity.setEmail(reqForEmail);
		entity.setNoOfLeaves(leave);
		entity.setDate(reqForStart);
		entity.setReason(reqForReason);
		writer.println("<h3>");
		LeaveService<LeaveEntity> rep=service;
		
		   boolean valid=rep.validateAndSave(entity);
			if(valid) {
				writer.println("<h1>");
				writer.println("leave form submited");
				writer.println("</h1>");
				System.out.println("data saved");
				writer.println("leave for "+reqForName);
			}else {
				writer.println("<h1>");
				writer.println("leave form not submited");
				writer.println("</h1>");
				System.out.println("data is not saved");
			}
		
	    writer.println("</h3>");
		writer.println("</body>");
		writer.println("</html>");
		
		
		
		
		//LeaveDAO dao=new LeaveDAOImpl();
		//dao.save(entity);
		
	
	}
	
	
	
}
