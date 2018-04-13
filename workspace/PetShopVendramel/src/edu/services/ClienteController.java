package edu.services;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.model.cliente.Cliente;
import edu.persistence.cliente.ClienteDAO;
import edu.persistence.cliente.ClienteDAOImpl;

@WebServlet("/ClienteController")
public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ClienteController() {
        super();
    }

	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String txtId = request.getParameter("txtId");
		String txtNome = request.getParameter("txtNome");
		String txtCpf = request.getParameter("txtCpf");
		String txtEnd = request.getParameter("txtEnd");
		String txtTel = request.getParameter("txtTel");
		String txtEmail = request.getParameter("txtEmail");
		
		String txtCmd = request.getParameter("txtCmd");
		
		ClienteDAO cDAO = new ClienteDAOImpl();
		
		LinkedList<Cliente> listaCliente = (LinkedList<Cliente>) getServletContext().getAttribute("LISTA_CLIENTE");
		
		if (listaCliente == null) {
			listaCliente = new LinkedList<>();
			getServletContext().setAttribute("LISTA_CLIENTE", listaCliente);
		}
		
		String message = null;
		
		message = String.format("Foi cadastrado o cliente %s\n", toString());
	}

}
