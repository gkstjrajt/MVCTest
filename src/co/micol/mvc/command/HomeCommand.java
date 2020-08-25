package co.micol.mvc.command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.mvc.Command;

public class HomeCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		// TODO 실행할 명령어 기술.
		return "jsp/home.jsp";	// 초기 인덱스 페이지를 보여주는 부분
	}

}
