package com.trms.delegates;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

	@Override
	public void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
