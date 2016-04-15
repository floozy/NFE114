package controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.User;

/**
 * Servlet implementation class CtrIndex
 */
//WebServlet("/CtrIndex")
public class CtrIndex extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String VUE = "/WebContent/index.jsp";
	
    /**
	     * @see HttpServlet#HttpServlet()
	     */
    public CtrIndex() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		traitement(request,response);
		System.out.println("method dopost");
		
	}
protected void traitement(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
	
	String email = request.getParameter("email");
	String passwd = request.getParameter("passwd");
	System.out.println("method traitement" + email +" "+passwd);
	
	//if( ("daniel.vielle@gmail.com".equalsIgnoreCase(email) ) && ("vielle".equalsIgnoreCase(passwd) ) ) {	
	if( (email.equals("daniel.vielle@gmail.com") ) && (passwd.equals("vielle") ) ) {
		
		getServletContext().
		getRequestDispatcher("/accueil.jsp").
		forward(request, response);
		
		
	}
	
	else{
		
		
		getServletContext().
		getRequestDispatcher("/index.jsp").
		forward(request, response);
		
		System.out.println("bad passwd");
	}
	
	
}
}
