package edu.services;

import java.io.IOException;
import java.util.LinkedHashSet;

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
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String txtNome = request.getParameter("txtNome");
		String txtCpf = request.getParameter("txtCpf");
		String txtEnd = request.getParameter("txtEnd");
		String txtTel = request.getParameter("txtTel");
		String txtEmail = request.getParameter("txtEmail");

		String cmd = request.getParameter("cmd");

		ClienteDAO cDao = new ClienteDAOImpl();

		LinkedHashSet<Cliente> listaCliente = (LinkedHashSet<Cliente>) getServletContext()
				.getAttribute("LISTA_CLIENTE");

		if (listaCliente == null) {
			listaCliente = new LinkedHashSet<>();
			getServletContext().setAttribute("LISTA_CLIENTE", listaCliente);
		}

		String message = null;

		if ("adicionar".equals(cmd)) {
			Cliente c = new Cliente();

			c.setNome(txtNome);
			c.setCpf(txtCpf);
			c.setEndereco(txtEnd);
			c.setTelefone(txtTel);
			c.setEmail(txtEmail);
			
			cDao.adicionarCliente(c);

			message = String.format("Foi cadastrado o cliente %s\n", c.toString());

		} else if ("pesquisar".equals(cmd)) {
			listaCliente = cDao.consultarCliente(txtNome);
			request.getSession().setAttribute("LISTA_CLIENTE", listaCliente);

		} else if ("atualizar".equals(cmd)) {
			Cliente c = new Cliente();

			c.setNome(txtNome);
			c.setCpf(txtCpf);
			c.setEndereco(txtEnd);
			c.setTelefone(txtTel);
			
			cDao.atualizarCliente(c);
			
			message = String.format("Foi atualizado o cliente %s\n", c.toString());

		} else if ("voltar".contains(cmd)) {
			response.sendRedirect("./index.jsp");
		}

		request.getSession().setAttribute("MESSAGE", message);

		response.sendRedirect("./cliente.jsp");

	}

}
