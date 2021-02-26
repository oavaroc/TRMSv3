package com.trms.delegates;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.trms.models.Employee;
import com.trms.services.EmployeeService;
import com.trms.services.EmployeeServiceImpl;

/*
 * Endpoints:
 *  /user/login - (POST) log in a user
 *  			- (DELETE) log out a user
 *  /user - (POST) register a user
 * 	/user/:id - (GET) get user by id
 *            - (PUT) update a user
 *            - (DELETE) deletes a user
 */
public class LoginDelegate implements FrontControllerDelegate{
	private EmployeeService es = new EmployeeServiceImpl();
	private ObjectMapper om = new ObjectMapper();
	@Override
	public void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = (String) req.getAttribute("path");
		
		if (path == null || path.equals("")) {
			if ("POST".equals(req.getMethod())) {
				Employee e = (Employee) om.readValue(req.getInputStream(),Employee.class);
				
			}
		}else if (path.contains("login")) {
			if ("POST".equals(req.getMethod()))
				logIn(req, resp);
			else if ("DELETE".equals(req.getMethod()))
				req.getSession().invalidate();
			else
				resp.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
		} else {
			//userWithId(req, resp, Integer.valueOf(path));
		}
	}
	private void logIn(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String username = req.getParameter("user");
		String password = req.getParameter("pass");
		
//		Employee p = es.getPersonByUsername(username);
//		if (p != null) {
//			if (p.getPassword().equals(password)) {
//				req.getSession().setAttribute("person", p);
//				resp.getWriter().write(om.writeValueAsString(p));
//			} else {
//				resp.sendError(404, "Incorrect password.");
//			}
//		} else {
//			resp.sendError(404, "No user found with that username.");
//		}
		resp.getWriter().write(om.writeValueAsString(username));
	}
//	private void userWithId(HttpServletRequest req, HttpServletResponse resp, Integer id) throws IOException {
//		switch (req.getMethod()) {
//			case "GET":
//				Employee p = es.getPersonById(id);
//				if (p != null) {
//					resp.getWriter().write(om.writeValueAsString(p));
//				} else {
//					resp.sendError(404, "Person not found.");
//				}
//				break;
//			case "PUT":
//				String password = req.getParameter("pass");
//				Employee person = (Employee) req.getSession().getAttribute("employee");
//				if (person != null) {
//					person.setPassword(password);
//					es.updatePerson(person);
//				} else
//					resp.sendError(HttpServletResponse.SC_UNAUTHORIZED);
//				break;
//			case "DELETE":
//				Employee user = om.readValue(req.getInputStream(), Employee.class);
//				es.deletePerson(user);
//				break;
//			default:
//				resp.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
//				break;
//		}
//	}
}
