package com.zafar.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.zafar.pojo.StudentPojo;
@Controller
public class FormController {
	@GetMapping(path = "/student")
	public void data(StudentPojo std,HttpServletResponse response) throws IOException
	{
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		pw.println("<h1> Student_id:"+std.getId()+"<h1>");
		pw.println("<h1>Studnet_Name"+std.getName()+"<h1>");
		pw.println("<h1>Studnet_City:"+std.getCity()+"<h1>");
		pw.println("<h1>Deparment:"+std.getDept()+"<h1>");
	}

}
