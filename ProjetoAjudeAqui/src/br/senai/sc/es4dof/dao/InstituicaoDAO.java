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
import br.senai.sc.es4dof.model.Instituicao;
import br.senai.sc.es4dof.model.Usuario;

public class InstituicaoDAO extends GenericDAO {

	private Connection con = null;
	private Instituicao instituicao = null;
	private UsuarioDAO usuDAO = null;
	private Usuario usuario = null;

	@Override
	public void salvar(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "INSERT INTO instituicao (razaoSocial, nome, email, telefone, endereco, cnpj, site, responsavel, observacoes, idUsuario) VALUES (?,?,?,?,?,?,?,?,?,?)";
		try {

			instituicao = (Instituicao) entidade;

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, instituicao.getRazaoSocial());
			pstmt.setString(2, instituicao.getNome());
			pstmt.setString(3, instituicao.getEmail());
			pstmt.setString(4, instituicao.getTelefone());
			pstmt.setString(5, instituicao.getEndereco());
			pstmt.setString(6, instituicao.getCnpj());
			pstmt.setString(7, instituicao.getSite());
			pstmt.setString(8, instituicao.getResponsavel());
			pstmt.setString(9, instituicao.getObservacoes());
			pstmt.setInt(10, instituicao.getUsuario().getId());

			pstmt.execute();
			con.commit();
			pstmt.close();

		} catch (SQLException se) {
			System.out
					.println("[InstituicaoDAO] - Erro ao salvar instituição.\n"
							+ se.getMessage());
			con.rollback();

		} finally {
			con.close();
		}

	}

	@Override
	public void excluir(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "DELETE FROM instituicao WHERE id=?";
		try {

			instituicao = (Instituicao) entidade;

			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, instituicao.getId());

			pstm.execute();
			con.commit();
			pstm.close();

		} catch (SQLException e) {
			con.rollback();
			System.out
					.println("[InstituicaoDAO] - Erro ao excluir instituição.\n"
							+ e.getMessage());
		} finally {
			con.close();
		}

	}

	@Override
	public void editar(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "UPDATE instituicao SET razaoSocial = ?, nome = ?, email = ?, telefone = ?, endereco = ?, cnpj = ?, site = ?, responsavel = ?, observacoes = ?, idUsuario = ? WHERE id = ?";
		try {

			instituicao = (Instituicao) entidade;

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, instituicao.getRazaoSocial());
			pstmt.setString(2, instituicao.getNome());
			pstmt.setString(3, instituicao.getEmail());
			pstmt.setString(4, instituicao.getTelefone());
			pstmt.setString(5, instituicao.getEndereco());
			pstmt.setString(6, instituicao.getCnpj());
			pstmt.setString(7, instituicao.getSite());
			pstmt.setString(8, instituicao.getResponsavel());
			pstmt.setString(9, instituicao.getObservacoes());
			pstmt.setInt(10, instituicao.getUsuario().getId());
			pstmt.setInt(11, instituicao.getId());

			pstmt.execute();
			con.commit();
			pstmt.close();

		} catch (SQLException e) {
			con.rollback();
			System.out
					.println("[InstituicaoDAO] - Erro ao editar instituição.\n"
							+ e.getMessage());
		} finally {
			con.close();
		}

	}

	@Override
	public List<Entidade> listar() throws Exception {

		con = Conexao.getConnection();
		usuDAO = new UsuarioDAO();

		List<Entidade> listainstituicaos = new ArrayList<Entidade>();
		String sql = "SELECT i.id, i.razaoSocial, i.nome, i.email, i.telefone, i.endereco, i.cnpj, i.site, i.responsavel, i.observacoes, i.idUsuario FROM instituicao i";
		try {

			PreparedStatement pstm = con.prepareStatement(sql);

			ResultSet result = pstm.executeQuery();

			while (result.next()) {

				try {

					usuario = (Usuario) usuDAO.getPorId(result
							.getInt("idUsuario"));

					instituicao = new Instituicao(result.getInt("id"),
							result.getString("razaoSocial"),
							result.getString("cnpj"), result.getString("nome"),
							result.getString("email"),
							result.getString("telefone"),
							result.getString("endereco"),
							result.getString("site"),
							result.getString("responsavel"),
							result.getString("observacoes"), usuario);

					listainstituicaos.add(instituicao);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

			pstm.close();

		} catch (SQLException e) {
			con.rollback();
			System.out
					.println("[InstituicaoDAO] - Erro ao listar instituicões.\n"
							+ e.getMessage());

		} finally {
			con.close();
		}
		return listainstituicaos;

	}

	@Override
	public Entidade getPorId(int id) throws Exception {

		con = Conexao.getConnection();
		usuDAO = new UsuarioDAO();

		String sql = "SELECT i.id, i.razaoSocial, i.nome, i.email, i.telefone, i.endereco, i.cnpj, i.site, i.responsavel, i.observacoes, i.idUsuario FROM instituicao i WHERE id=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);

			ResultSet result = pstmt.executeQuery();

			while (result.next()) {

				usuario = (Usuario) usuDAO.getPorId(result.getInt("idUsuario"));


				instituicao = new Instituicao(result.getInt("id"),
						result.getString("razaoSocial"),
						result.getString("cnpj"), result.getString("nome"),
						result.getString("email"),
						result.getString("telefone"),
						result.getString("endereco"),
						result.getString("site"),
						result.getString("responsavel"),
						result.getString("observacoes"), usuario);
			}
			result.close();
			pstmt.close();

		} catch (SQLException se) {
			System.out
					.println("[InstituicaoDAO] - Erro ao pegar instituicao por ID.\n"
							+ se.getMessage());
		} finally {
			con.close();
		}

		return instituicao;
	}

	/**
	 * Método que retorna a instituição de acordo com o id do usuário passado
	 * como parâmetro.
	 * 
	 * @param idUsuario
	 * @return instituicao
	 * @throws Exception
	 */
	public Entidade getPorIdUsuario(int idUsuario) throws Exception {
		con = Conexao.getConnection();

		String sql = "SELECT i.id, i.razaoSocial, i.nome, i.email, i.telefone, i.endereco, i.cnpj, i.site, i.responsavel, i.observacoes, i.idUsuario FROM instituicao i WHERE idUsuario=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idUsuario);

			ResultSet result = pstmt.executeQuery();

			while (result.next()) {

				usuDAO = new UsuarioDAO();
				usuario = (Usuario) usuDAO.getPorId(result.getInt("idUsuario"));

				instituicao = new Instituicao(result.getInt("id"),
						result.getString("razaoSocial"),
						result.getString("nome"), result.getString("email"),
						result.getString("telefone"),
						result.getString("endereco"), result.getString("cnpj"),
						result.getString("site"),
						result.getString("responsavel"),
						result.getString("observacoes"), usuario);
			}
			result.close();
			pstmt.close();

		} catch (SQLException se) {
			System.out
					.println("[InstituicaoDAO] - Erro ao pegar instituicao por ID do usuario.\n"
							+ se.getMessage());
		} finally {
			con.close();
		}

		return instituicao;
	}

}
