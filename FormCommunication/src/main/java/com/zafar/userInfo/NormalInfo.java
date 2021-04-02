package com.zafar.userInfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class NormalInfo
{
	@RequestMapping("ht")
	public String  check(HttpServletRequest request,HttpServletResponse response) throws IOException
	
	{
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("<h1> this is zafar imam i,m java devloper</h1>");
		System.out.println("this is normal servlet program ");
		return "display.jsp";
		
	}
}