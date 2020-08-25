package co.micol.mvc.command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.mvc.Command;

public class LoginFormCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		// TODO 로그인 페이지를 호출하는 메소드
		return "jsp/loginForm.jsp";
	}

}
