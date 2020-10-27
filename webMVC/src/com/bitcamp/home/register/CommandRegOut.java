package com.bitcamp.home.register;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bitcamp.home.CommandService;

public class CommandRegOut implements CommandService {

	@Override
	public String executeCommand(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		RegisterVO vo = new RegisterVO();
		HttpSession session = req.getSession();
		vo.setUserid((String)session.getAttribute("logId"));
		req.setAttribute("regVO", vo);
		
		
		return "/register/regOut.jsp";
	}

}
