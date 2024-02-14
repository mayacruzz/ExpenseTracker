package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ExpenseTracker;

/**
 * Servlet implementation class getExpenseServlet
 */
@WebServlet("/getExpenseServlet")
public class getExpenseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getExpenseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    int rent = Integer.parseInt(request.getParameter("rent"));
	    int groceries = Integer.parseInt(request.getParameter("groceries"));
	    int gas = Integer.parseInt(request.getParameter("gas"));
	    int entertainment = Integer.parseInt(request.getParameter("entertainment"));
	    int other = Integer.parseInt(request.getParameter("other"));

	    int totalExpenses = rent + groceries + gas + entertainment + other;

	    ExpenseTracker expenseTracker = new ExpenseTracker(rent, groceries, gas, entertainment, other);

	    request.setAttribute("expenseTracker", expenseTracker);
	    request.setAttribute("totalExpenses", totalExpenses);

	    request.getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
