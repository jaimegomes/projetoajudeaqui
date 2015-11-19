package br.senai.sc.ajudeaqui.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.senai.sc.ajudeaqui.abstracts.Entidade;
import br.senai.sc.ajudeaqui.abstracts.GenericDAO;
import br.senai.sc.ajudeaqui.conexao.Conexao;
import br.senai.sc.ajudeaqui.model.Anuncio;
import br.senai.sc.ajudeaqui.model.Funcao;
import br.senai.sc.ajudeaqui.model.Instituicao;

public class AnuncioDAO extends GenericDAO {

	private Connection con = null;
	private Anuncio anuncio = null;
	private FuncaoDAO funDAO = null;
	private Funcao funcao = null;
	private InstituicaoDAO instDAO = null;
	private Instituicao instituicao = null;

	@Override
	public void salvar(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "INSERT INTO anuncio (titulo, descricao, qtdVagas, dataPublicacao, idFuncao, status, idInstituicao) VALUES (?,?,?,?,?,?,?)";
		try {

			anuncio = (Anuncio) entidade;

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, anuncio.getTitulo());
			pstmt.setString(2, anuncio.getDescricao());
			pstmt.setInt(3, anuncio.getQtdVagas());
			pstmt.setDate(4, new java.sql.Date(anuncio.getDataPublicacao()
					.getTime()));
			pstmt.setInt(5, anuncio.getFuncao().getId());
			pstmt.setString(6, anuncio.getStatus());
			pstmt.setInt(7, anuncio.getInstituicao().getId());

			pstmt.execute();
			con.commit();
			pstmt.close();

		} catch (SQLException se) {
			System.out.println("[AnuncioDAO] - Erro ao salvar anuncio.\n"
					+ se.getMessage());
			con.rollback();

		} finally {
			con.close();
		}

	}

	@Override
	public void excluir(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "DELETE FROM anuncio WHERE id=?";
		try {

			anuncio = (Anuncio) entidade;

			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, anuncio.getId());

			pstm.execute();
			con.commit();
			pstm.close();

		} catch (SQLException e) {
			con.rollback();
			System.out.println("[AnuncioDAO] - Erro ao excluir anuncio.\n"
					+ e.getMessage());
		} finally {
			con.close();
		}

	}

	@Override
	public void editar(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "UPDATE anuncio SET titulo = ?, descricao = ?, qtdVagas = ?, dataPublicacao = ?, idFuncao = ?, status = ?, idInstituicao = ? WHERE id = ?";
		try {

			anuncio = (Anuncio) entidade;

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, anuncio.getTitulo());
			pstmt.setString(2, anuncio.getDescricao());
			pstmt.setInt(3, anuncio.getQtdVagas());
			pstmt.setDate(4, new java.sql.Date(anuncio.getDataPublicacao()
					.getTime()));
			pstmt.setInt(5, anuncio.getFuncao().getId());
			pstmt.setString(6, anuncio.getStatus());
			pstmt.setInt(7, anuncio.getInstituicao().getId());
			pstmt.setInt(8, anuncio.getId());

			pstmt.execute();
			con.commit();
			pstmt.close();

		} catch (SQLException e) {
			con.rollback();
			System.out.println("[AnuncioDAO] - Erro ao editar anuncio.\n"
					+ e.getMessage());
		} finally {
			con.close();
		}

	}

	@Override
	public List<Entidade> listar() throws Exception {

		con = Conexao.getConnection();

		List<Entidade> listaAnuncios = new ArrayList<Entidade>();
		String sql = "SELECT a.id, a.titulo, a.descricao, a.qtdVagas, a.dataPublicacao, a.idFuncao, a.status, a.idInstituicao FROM anuncio a";
		try {

			PreparedStatement pstm = con.prepareStatement(sql);

			ResultSet result = pstm.executeQuery();

			while (result.next()) {

				try {
					funDAO = new FuncaoDAO();
					funcao = (Funcao) funDAO
							.getPorId(result.getInt("idFuncao"));

					instDAO = new InstituicaoDAO();
					instituicao = (Instituicao) instDAO.getPorId(result
							.getInt("idInstituicao"));

					anuncio = new Anuncio(result.getInt("id"),
							result.getString("titulo"),
							result.getString("descricao"),
							result.getInt("qtdVagas"),
							result.getDate("dataPublicacao"), funcao,
							result.getString("status"), instituicao);

					listaAnuncios.add(anuncio);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

			pstm.close();

		} catch (SQLException e) {
			con.rollback();
			System.out.println("[AnuncioDAO] - Erro ao listar anuncios.\n"
					+ e.getMessage());

		} finally {
			con.close();
		}
		return listaAnuncios;

	}

	@Override
	public Entidade getPorId(int id) throws Exception {

		con = Conexao.getConnection();

		String sql = "SELECT a.id, a.titulo, a.descricao, a.qtdVagas, a.dataPublicacao, a.idFuncao, a.status, a.idInstituicao FROM anuncio a WHERE id=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);

			ResultSet result = pstmt.executeQuery();

			while (result.next()) {

				funDAO = new FuncaoDAO();
				funcao = (Funcao) funDAO.getPorId(result.getInt("idFuncao"));

				instDAO = new InstituicaoDAO();
				instituicao = (Instituicao) instDAO.getPorId(result
						.getInt("idInstituicao"));

				anuncio = new Anuncio(result.getInt("id"),
						result.getString("titulo"),
						result.getString("descricao"),
						result.getInt("qtdVagas"),
						result.getDate("dataPublicacao"), funcao,
						result.getString("status"), instituicao);
			}
			result.close();
			pstmt.close();

		} catch (SQLException se) {
			System.out.println("[AnuncioDAO] - Erro ao pegar anuncio por ID.\n"
					+ se.getMessage());
		} finally {
			con.close();
		}

		return anuncio;
	}

	/**
	 * Método que retorna a anuncio de acordo com o id do usuário passado como
	 * parâmetro.
	 * 
	 * @param idUsuario
	 * @return anuncio
	 * @throws Exception
	 */
	public Entidade getPorIdInstituicao(int idInstituicao) throws Exception {
		con = Conexao.getConnection();

		String sql = "SELECT a.id, a.titulo, a.descricao, a.qtdVagas, a.dataPublicacao, a.idFuncao, a.status, a.idInstituicao FROM anuncio a WHERE idInstituicao=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idInstituicao);

			ResultSet result = pstmt.executeQuery();

			while (result.next()) {

				funDAO = new FuncaoDAO();
				funcao = (Funcao) funDAO.getPorId(result.getInt("idFuncao"));

				instDAO = new InstituicaoDAO();
				instituicao = (Instituicao) instDAO.getPorId(result
						.getInt("idInstituicao"));

				anuncio = new Anuncio(result.getInt("id"),
						result.getString("titulo"),
						result.getString("descricao"),
						result.getInt("qtdVagas"),
						result.getDate("dataPublicacao"), funcao,
						result.getString("status"), instituicao);
			}
			result.close();
			pstmt.close();

		} catch (SQLException se) {
			System.out
					.println("[AnuncioDAO] - Erro ao pegar anuncio por ID da instituição.\n"
							+ se.getMessage());
		} finally {
			con.close();
		}

		return anuncio;
	}

	public List<Entidade> pesquisarAnuncio(String sql) throws Exception {
		con = Conexao.getConnection();

		List<Entidade> listAnuncios = new ArrayList<Entidade>();

		PreparedStatement pstmt = null;
		try {

			pstmt = con.prepareStatement(sql.toString());

			ResultSet result = pstmt.executeQuery();

			while (result.next()) {

				anuncio = new Anuncio(result.getInt("id"),
						result.getString("titulo"),
						result.getString("descricao"),
						result.getInt("qtdVagas"),
						result.getDate("dataPublicacao"), funcao,
						result.getString("status"), instituicao);

				listAnuncios.add(anuncio);
			}
			result.close();
			pstmt.close();

		} catch (SQLException se) {
			System.out
					.println("[AnuncioDAO] - Erro ao pesquisar anuncio.\n"
							+ se.getMessage());
		} finally {
			con.close();
		}

		return listAnuncios;
	}

}
