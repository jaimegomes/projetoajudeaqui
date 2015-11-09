package br.senai.sc.es4dof.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.senai.sc.ajudeaqui.abstracts.Entidade;
import br.senai.sc.ajudeaqui.abstracts.GenericDAO;
import br.senai.sc.ajudeaqui.conexao.Conexao;
import br.senai.sc.es4dof.model.Usuario;

public class UsuarioDAO extends GenericDAO {

	private Connection con = null;
	private Usuario usuario = null;

	@Override
	public void salvar(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "INSERT INTO usuario (login, senha, perfil) VALUES (?,?,?)";
		try {

			usuario = (Usuario) entidade;

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, usuario.getLogin());
			pstmt.setString(2, usuario.getSenha());
			pstmt.setString(3, usuario.getPerfil());

			pstmt.execute();
			con.commit();
			pstmt.close();

		} catch (SQLException se) {
			System.out.println("[UsuarioDAO] - Erro ao salvar Cliente.\n"
					+ se.getMessage());
			con.rollback();

		} finally {
			con.close();
		}
	}

	@Override
	public void excluir(Entidade entidade) throws Exception {

	}

	@Override
	public void editar(Entidade entidade) throws Exception {

	}

	@Override
	public List<Entidade> listar() throws Exception {
		return null;
	}

	@Override
	public Entidade getPorId(int id) throws Exception {
		con = Conexao.getConnection();

		String sql = "SELECT u.id, u.login, u.senha, u.perfil FROM usuario u WHERE id=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);

			ResultSet result = pstmt.executeQuery();

			while (result.next()) {
				usuario = new Usuario(result.getInt("id"),
						result.getString("login"), result.getString("senha"),
						result.getString("perfil"));
			}
			result.close();
			pstmt.close();

		} catch (SQLException se) {
			System.out.println("[UsuarioDAO] - Erro ao pegar Usuário por ID.\n"
					+ se.getMessage());
		} finally {
			con.close();
		}

		return usuario;
	}

	public Entidade getPorLogin(String login) throws Exception {
		con = Conexao.getConnection();

		String sql = "SELECT u.id, u.login, u.senha, u.perfil FROM usuario u WHERE id=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, login);

			ResultSet result = pstmt.executeQuery();

			while (result.next()) {
				usuario = new Usuario(result.getInt("id"),
						result.getString("login"), result.getString("senha"),
						result.getString("perfil"));
			}
			result.close();
			pstmt.close();

		} catch (SQLException se) {
			System.out
					.println("[UsuarioDAO] - Erro ao pegar Usuário por Login.\n"
							+ se.getMessage());
		} finally {
			con.close();
		}

		return usuario;
	}

}
