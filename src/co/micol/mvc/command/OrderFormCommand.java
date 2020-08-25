package co.micol.mvc.command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.mvc.Command;

public class OrderFormCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		// TODO 주문서 폼을 호출.
		return "jsp/orderForm.jsp";
	}

}
