package co.micol.mvc.command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.mvc.Command;

public class LoginCheckCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		// TODO 로그인 체크하는 자바클래스
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		int a = Integer.parseInt(request.getParameter("pwd"));
		String viewPage = null;
		
		if(id.equals("home") && pwd.equals("1234")) {
			request.setAttribute("id", id);
			request.setAttribute("pwd", pwd);
			viewPage = "jsp/loginOk.jsp";
		} else {
			request.setAttribute("msg", "로그인에 실패했습니다.");
			viewPage = "jsp/loginFail.jsp";
		}
		
		return viewPage;
	}

}
