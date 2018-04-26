package edu.persistence.cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import edu.model.cliente.Cliente;
import edu.util.DBUtil;

public class ClienteDAOImpl implements ClienteDAO {

	private Connection con;

	@Override
	public void adicionarCliente(Cliente c) {
		try {
			con = DBUtil.getInstance().getConnection();
			String sql = "INSERT INTO cliente(id, nome, cpf, endereco, telefone) " + "VALUES (?, ?, ?, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setInt(1, proximoId());
			ps.setString(2, c.getNome());
			ps.setString(3, c.getCpf());
			ps.setString(4, c.getEndereco());
			ps.setString(5, c.getTelefone());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace(System.err);
		}
	}

	@Override
	public LinkedList<Cliente> consultarCliente(String txtNome) {
		LinkedList<Cliente> lista = new LinkedList<>();
		try {
			con = DBUtil.getInstance().getConnection();
			String sql = "SELECT * FROM cliente WHERE nome like ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, "%" + txtNome + "%");
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Cliente c = new Cliente();

				c.setNome(rs.getString("nome"));
				c.setCpf(rs.getString("cpf"));
				c.setEndereco(rs.getString("endereco"));
				c.setTelefone(rs.getString("telefone"));
				c.setEmail(rs.getString("email"));

				lista.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace(System.err);
		}

		return lista;
	}

	@Override
	public void atualizarCliente(Cliente c) {
		try {
			con = DBUtil.getInstance().getConnection();
			String sql = "UPDATE cliente SET nome = ?, " + "endereco = ?, " + "telefone = ?, "
					+ "email = ? WHERE cpf = ?";
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, c.getNome());
			ps.setString(2, c.getEndereco());
			ps.setString(3, c.getTelefone());
			ps.setString(4, c.getEmail());
			ps.setString(5, c.getCpf());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace(System.err);
		}
	}

	@Override
	public void inativarCliente(String txtNome) {
		// TODO Auto-generated method stub

	}

	public int proximoId() {
		try {
			con = DBUtil.getInstance().getConnection();
			String sql = "SELECT MAX(id) + 1 AS proximo_id FROM cliente";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				return rs.getInt("proximo_id");
			} else {
				return 1;
			}
		} catch (SQLException e) {
			e.printStackTrace(System.err);
		}

		return -1;
	}
}
