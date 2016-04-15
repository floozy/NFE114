package controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Start
 */
//@WebServlet("/accueil")

public class CtrStart extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 180503254876481698L;
	      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CtrStart() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		/* Affichage de la page d'envoi de fichiers */
		
		
	}
	
	public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		String email = request.getParameter("inputEmail");
		String passwd = request.getParameter("inputPassword");
		
		
		RequestDispatcher dispatcher;
		
		
		if(("daniel.vielle@gmail.com".equalsIgnoreCase(email))&&("vielle".equalsIgnoreCase(passwd))){	
			
		dispatcher= request.getRequestDispatcher("accueil.jsp");
		}else{
			dispatcher= request.getRequestDispatcher("/index.jsp");
		}
		dispatcher.forward(request, response);
	}

}
