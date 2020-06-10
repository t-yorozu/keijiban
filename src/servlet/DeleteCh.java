package servlet;


import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Ch;
import dao.DeleteDao;

/**
 * Servlet implementation class ResultServlet
 */
@WebServlet("/DeleteCh")
public class DeleteCh extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCh() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//formに入力された検索キー(パラメータ)を取得
				request.setCharacterEncoding("UTF-8");
				String ID = request.getParameter("id");
				//データベースから値を取得
				Ch result = DeleteDao.DeleteCh(ID);

				//取得した値をリクエストスコープへ保存
				request.setAttribute("list", result);
					//結果画面へフォワード
				response.sendRedirect("/java_kadai/AllCh");
					//String view = "/WEB-INF/view/Ch.jsp";
					//RequestDispatcher dispatcher = request.getRequestDispatcher(view);
					//dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
