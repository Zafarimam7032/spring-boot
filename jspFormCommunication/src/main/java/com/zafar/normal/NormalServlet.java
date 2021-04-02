package com.zafar.normal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NormalServlet {
	@RequestMapping(method = RequestMethod.GET, path = "/dis")
	public String display() {
		System.out.println("this is diplay method for Normalservlet");
		return "-------------this is display method";
	}

	//@PostMapping(path = "/form")
	public void form(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String name = request.getParameter("user");
		String pass = request.getParameter("pass");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<h1>User name:" + name + "</h1>");
		pw.println("<h1>Passwpord:" + pass + "</h1>");

	}
//@PostMapping(path="/form")
	public void sessionForm(String user, String pass, HttpServletRequest session, HttpServletResponse response)
			throws IOException {
//		user = (String) session.getAttribute("user");
//	 pass = (String) session.getAttribute("pass");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<h1>User name:" + user + "</h1>");//directly we can get data from form page it name attribute and parameter variable  is matching in method then it will work 
		pw.println("<h1>Passwpord:" + pass + "</h1>");

	}
	@PostMapping(path="/form")
public void changeAbleVariable(@RequestParam("user") String name,@RequestParam("pass") String password,HttpServletResponse response) throws IOException
{
	response.setContentType("text/html");
	PrintWriter pw = response.getWriter();
	pw.println("<h1>User name:" + name + "</h1>");
	pw.println("<h1>Passwpord:" + password + "</h1>");

	
}

}
