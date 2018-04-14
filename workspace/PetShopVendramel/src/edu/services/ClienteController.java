package edu.services;

import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedHashSet;
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
		
		String txtCmd = request.getParameter("cmd");
		
		ClienteDAO cDao = new ClienteDAOImpl();
		
		LinkedHashSet<Cliente> listaCliente = (LinkedHashSet<Cliente>) getServletContext().getAttribute("LISTA_CLIENTE");
		
		if (listaCliente == null) {
			listaCliente = new LinkedHashSet<>();
			getServletContext().setAttribute("LISTA_CLIENTE", listaCliente);
		}
		
		String message = null;
		
		if ("adicionar".equals(txtCmd)) {
			Cliente c = new Cliente();

			c.setNome(txtNome);
			c.setCpf(txtCpf);
			c.setEndereco(txtEnd);
			c.setTelefone(txtTel);
			try {
				cDao.adicionarCliente(c);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			message = String.format("Foi cadastrado o cliente %s\n", c.toString());

		} else if ("pesquisar".equals(txtCmd)) {
			try {
				listaCliente = cDao.consultarCliente(txtNome);
				request.getSession().setAttribute("LISTA_CLIENTE", listaCliente);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else if ("atualizar".equals(txtCmd)) {
			Cliente c = new Cliente();

			c.setNome(txtNome);
			c.setCpf(txtCpf);
			c.setEndereco(txtEnd);
			c.setTelefone(txtTel);
			try {
				cDao.atualizarCliente(c);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			message = String.format("Foi atualizado o cliente %s\n", c.toString());
			
		}
		
		

		request.getSession().setAttribute("MESSAGE", message);

		response.sendRedirect("./cliente.jsp");
		
	}

}
