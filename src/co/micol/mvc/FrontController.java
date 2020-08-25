package co.micol.mvc;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.mvc.command.HomeCommand;
import co.micol.mvc.command.LoginCheckCommand;
import co.micol.mvc.command.LoginFormCommand;
import co.micol.mvc.command.MyCommand;
import co.micol.mvc.command.OrderFormCommand;
import co.micol.mvc.command.OrderResultCommand;

//@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private HashMap<String, Command> map;
	
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void init(ServletConfig config) throws ServletException {
		// TODO 여기가 명령어를 분석하는 맵을 생성
		map = new HashMap<String, Command>();
		// 이런 형태로 호출명과 실행 명령어를 담아둔다.
		
		map.put("/my.do", new MyCommand());		// 인덱스 페이지 호출
		map.put("/home.do", new HomeCommand());	// 나의 이름 페이지 호출
		map.put("/loginForm.do", new LoginFormCommand());	// 로그인 페이지 호출
		map.put("/loginCheck.do", new LoginCheckCommand()); // 로그인체크 페이지 호출
		map.put("/order.do", new OrderFormCommand());	// 주문서 페이지 호출
		map.put("/orderResult.do", new OrderResultCommand());	// 주문처리, 계산서
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO 요청을 처리하는 부분 기술
		request.setCharacterEncoding("UTF-8");	// 한글깨짐 방지
		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String commandPath = uri.substring(contextPath.length());
		
		Command command = map.get(commandPath);	// 필요한 command 객체를 찾아옴
		String viewPage = command.exec(request, response);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}
