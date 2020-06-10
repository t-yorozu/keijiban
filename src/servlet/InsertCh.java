package servlet;



import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Ch;
import dao.InsertDao;

/**
 * Servlet implementation class TopServlet
 */
//①最初にアクセスされるURL
@WebServlet("/InsertCh")
public class InsertCh extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertCh() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        String str = sdf.format(timestamp);

		int id = 0;
		String name = request.getParameter("textName");
		String main = request.getParameter("textMain");
		String mail = request.getParameter("textMail");
		String time = str;
		Ch s = new Ch(id,name,main,mail,time);
		Ch result = InsertDao.Ch(s);


		//取得した値をリクエストスコープへ保存
		request.setAttribute("list", result);
		//String view = "/WEB-INF/view/index.jsp";
		//インサートサーブレットからURL:TopPageへリダイレクトする
		 response.sendRedirect("/java_kadai/StartCh");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
