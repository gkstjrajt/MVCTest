package co.micol.mvc.command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.mvc.Command;

public class OrderResultCommand implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		// TODO 주문처리 후 계산서 만들기
		String product = request.getParameter("product");
		int orderNum = Integer.parseInt(request.getParameter("orderNum"));
		int price = Integer.parseInt(request.getParameter("price"));
		
		int account = price * orderNum;
		float vat = (float) (account * 0.1);
		int sum = (int) (account + vat);
		
		request.setAttribute("product", product);
		request.setAttribute("orderNum",orderNum);
		request.setAttribute("price", price);
		request.setAttribute("vat", vat);
		request.setAttribute("sum", sum);
		return "jsp/orderResult.jsp";
	}

}
