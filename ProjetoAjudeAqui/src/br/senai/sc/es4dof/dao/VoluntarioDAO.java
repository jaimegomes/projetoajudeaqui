package br.senai.sc.es4dof.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.senai.sc.ajudeaqui.abstracts.Entidade;
import br.senai.sc.ajudeaqui.abstracts.GenericDAO;
import br.senai.sc.ajudeaqui.conexao.Conexao;
import br.senai.sc.es4dof.model.Usuario;
import br.senai.sc.es4dof.model.Voluntario;

public class VoluntarioDAO extends GenericDAO {

	private Connection con = null;
	private Voluntario voluntario = null;
	private UsuarioDAO usuDAO = null;
	private Usuario usuario = null;

	@Override
	public void salvar(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "INSERT INTO voluntario (nome, sexo, cpf, dataNasc, estadoCivil, endereco, complemento, telefone, celular, email, informacoesComplementares, idUsuario) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
		try {

			voluntario = (Voluntario) entidade;

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, voluntario.getNome());
			pstmt.setString(2, voluntario.getSexo());
			pstmt.setString(3, voluntario.getCpf());
			pstmt.setDate(4, new java.sql.Date(voluntario.getDataNascimento().getTime()));
			pstmt.setString(5, voluntario.getEstadoCivil());
			pstmt.setString(6, voluntario.getEndereco());
			pstmt.setString(7, voluntario.getComplemento());
			pstmt.setString(8, voluntario.getTelefone());
			pstmt.setString(9, voluntario.getCelular());
			pstmt.setString(10, voluntario.getEmail());
			pstmt.setString(11, voluntario.getInformacoesComplementares());
			pstmt.setInt(12, voluntario.getUsuario().getId());

			pstmt.execute();
			con.commit();
			pstmt.close();

		} catch (SQLException se) {
			System.out.println("[VoluntarioDAO] - Erro ao salvar voluntário.\n" + se.getMessage());
			con.rollback();

		} finally {
			con.close();
		}

	}

	@Override
	public void excluir(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "DELETE FROM voluntario WHERE id=?";
		try {

			voluntario = (Voluntario) entidade;

			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, voluntario.getId());

			pstm.execute();
			con.commit();
			pstm.close();

		} catch (SQLException e) {
			con.rollback();
			System.out.println("[VoluntarioDAO] - Erro ao excluir voluntário.\n" + e.getMessage());
		} finally {
			con.close();
		}

	}

	@Override
	public void editar(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "UPDATE voluntario SET nome = ?, sexo = ?, cpf = ?, dataNasc = ?, estadoCivil = ?, endereco = ?, complemento = ?, telefone = ?, celular = ?, email = ?, informacoesComplementares = ?, idUsuario = ?";
		try {

			voluntario = (Voluntario) entidade;

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, voluntario.getNome());
			pstmt.setString(2, voluntario.getSexo());
			pstmt.setString(3, voluntario.getCpf());
			pstmt.setDate(4, new java.sql.Date(voluntario.getDataNascimento().getTime()));
			pstmt.setString(5, voluntario.getEstadoCivil());
			pstmt.setString(6, voluntario.getEndereco());
			pstmt.setString(7, voluntario.getComplemento());
			pstmt.setString(8, voluntario.getTelefone());
			pstmt.setString(9, voluntario.getCelular());
			pstmt.setString(10, voluntario.getEmail());
			pstmt.setString(11, voluntario.getInformacoesComplementares());
			pstmt.setInt(12, voluntario.getUsuario().getId());

			pstmt.execute();
			con.commit();
			pstmt.close();

		} catch (SQLException e) {
			con.rollback();
			System.out.println("[VoluntarioDAO] - Erro ao editar voluntário.\n" + e.getMessage());
		} finally {
			con.close();
		}

	}

	@Override
	public List<Entidade> listar() throws Exception {

		con = Conexao.getConnection();

		List<Entidade> listaVoluntarios = new ArrayList<Entidade>();
		String sql = "SELECT * FROM voluntario";
		try {

			PreparedStatement pstm = con.prepareStatement(sql);

			ResultSet result = pstm.executeQuery();

			while (result.next()) {

				try {
					usuDAO = new UsuarioDAO();
					usuario = (Usuario) usuDAO.getPorId(result.getInt("idUsuario"));

					voluntario = new Voluntario(result.getInt("id"), result.getString("nome"),
							result.getString("telefone"), result.getString("cpf"), result.getString("endereco"),
							result.getString("email"), result.getDate("dataNasc"), usuario, result.getString("sexo"),
							result.getString("estadoCivil"), result.getString("complemento"),
							result.getString("celular"), result.getString("informacoesComplementares"));
					listaVoluntarios.add(voluntario);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

			pstm.close();

		} catch (SQLException e) {
			con.rollback();
			System.out.println("[VoluntarioDAO] - Erro ao listar voluntarios.\n" + e.getMessage());

		} finally {
			con.close();
		}
		return listaVoluntarios;

	}

	@Override
	public Entidade getPorId(int id) throws Exception {

		con = Conexao.getConnection();

		String sql = "SELECT v.id, v.nome, v.telefone, v.cpf, v.endereco, v.email, v.dataNasc, v.idUsuario, v.sexo, v.estadoCivil, v.complemento, v.celular, v.informacoesComplementares FROM voluntario v WHERE id=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);

			ResultSet result = pstmt.executeQuery();

			while (result.next()) {

				usuDAO = new UsuarioDAO();
				usuario = (Usuario) usuDAO.getPorId(result.getInt("idUsuario"));

				voluntario = new Voluntario(result.getInt("id"), result.getString("nome"), result.getString("telefone"),
						result.getString("cpf"), result.getString("endereco"), result.getString("email"),
						result.getDate("dataNasc"), usuario, result.getString("sexo"), result.getString("estadoCivil"),
						result.getString("complemento"), result.getString("celular"),
						result.getString("informacoesComplementares"));
			}
			result.close();
			pstmt.close();

		} catch (SQLException se) {
			System.out.println("[VoluntarioDAO] - Erro ao pegar voluntario por ID.\n" + se.getMessage());
		} finally {
			con.close();
		}

		return voluntario;
	}

}
