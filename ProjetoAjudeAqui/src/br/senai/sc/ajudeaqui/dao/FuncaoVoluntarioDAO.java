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
import br.senai.sc.ajudeaqui.controller.FuncaoController;
import br.senai.sc.ajudeaqui.model.Funcao;
import br.senai.sc.ajudeaqui.model.FuncaoVoluntario;
import br.senai.sc.ajudeaqui.model.Voluntario;

public class FuncaoVoluntarioDAO extends GenericDAO {

	private Connection con = null;
	private FuncaoVoluntario funcaoVoluntario;
	private FuncaoController funcaoDAO;
	private VoluntarioDAO voluntarioDAO;

	@Override
	public void salvar(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "INSERT INTO funcaoVoluntario (idFuncao, idVoluntario) VALUES (?,?)";
		try {

			funcaoVoluntario = (FuncaoVoluntario) entidade;

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, funcaoVoluntario.getFuncao().getId());
			pstmt.setInt(2, funcaoVoluntario.getVoluntario().getId());

			pstmt.execute();
			con.commit();
			pstmt.close();

		} catch (SQLException se) {
			System.out.println("[FuncaoVoluntarioDAO] - Erro ao salvar FuncaoVoluntario.\n" + se.getMessage());
			con.rollback();

		} finally {
			con.close();
		}

	}

	@Override
	public void excluir(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "DELETE FROM FuncaoVoluntario WHERE id=?";
		try {

			funcaoVoluntario = (FuncaoVoluntario) entidade;

			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, funcaoVoluntario.getId());

			pstm.execute();
			con.commit();
			pstm.close();

		} catch (SQLException e) {
			con.rollback();
			System.out.println("[FuncaoVoluntarioDAO] - Erro ao excluir FuncaoVoluntario.\n" + e.getMessage());
		} finally {
			con.close();
		}

	}

	@Override
	public void editar(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "UPDATE funcaoVoluntario SET idFuncao = ?, idVoluntario = ? WHERE id = ?";
		try {

			funcaoVoluntario = (FuncaoVoluntario) entidade;

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, funcaoVoluntario.getFuncao().getId());
			pstmt.setInt(2, funcaoVoluntario.getVoluntario().getId());
			pstmt.setInt(3, funcaoVoluntario.getId());

			pstmt.execute();
			con.commit();
			pstmt.close();

		} catch (SQLException e) {
			con.rollback();
			System.out.println("[FuncaoVoluntarioDAO] - Erro ao editar FuncaoVoluntario.\n" + e.getMessage());
		} finally {
			con.close();
		}

	}

	@Override
	public List<Entidade> listar() throws Exception {

		con = Conexao.getConnection();
		funcaoDAO = new FuncaoController();
		voluntarioDAO = new VoluntarioDAO();
		List<Entidade> listaFuncaoVoluntario = new ArrayList<Entidade>();

		String sql = "SELECT fv.id, fv.idFuncao, fv.idVoluntario FROM funcaoVoluntario fv";
		try {

			PreparedStatement pstm = con.prepareStatement(sql);

			ResultSet result = pstm.executeQuery();

			while (result.next()) {

				try {

					Funcao funcao = (Funcao) funcaoDAO.getPorId(result.getInt("idFuncao"));
					Voluntario voluntario = (Voluntario) voluntarioDAO.getPorId(result.getInt("idVoluntario"));

					funcaoVoluntario = new FuncaoVoluntario(result.getInt("id"), funcao, voluntario);

					listaFuncaoVoluntario.add(funcaoVoluntario);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

			pstm.close();

		} catch (SQLException e) {
			con.rollback();
			System.out.println("[FuncaoVoluntarioDAO] - Erro ao listar FuncaoVoluntario.\n" + e.getMessage());

		} finally {
			con.close();
		}
		return listaFuncaoVoluntario;

	}

	@Override
	public Entidade getPorId(int id) throws Exception {

		con = Conexao.getConnection();
		funcaoDAO = new FuncaoController();
		voluntarioDAO = new VoluntarioDAO();

		String sql = "SELECT fv.id, fv.idFuncao, fv.idVoluntario FROM funcaoVoluntario fv WHERE id=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);

			ResultSet result = pstmt.executeQuery();

			while (result.next()) {

				Funcao funcao = (Funcao) funcaoDAO.getPorId(result.getInt("idFuncao"));
				Voluntario voluntario = (Voluntario) voluntarioDAO.getPorId(result.getInt("idVoluntario"));

				funcaoVoluntario = new FuncaoVoluntario(result.getInt("id"), funcao, voluntario);
			}
			result.close();
			pstmt.close();

		} catch (SQLException se) {
			System.out.println("[FuncaoVoluntarioDAO] - Erro ao pegar FuncaoVoluntario por ID.\n" + se.getMessage());
		} finally {
			con.close();
		}

		return funcaoVoluntario;
	}

	public boolean getPorIdFuncaoVoluntario(int idFuncao, int idVoluntario) throws SQLException {
		con = Conexao.getConnection();

		String sql = "SELECT fv.id, fv.idFuncao, fv.idVoluntario FROM funcaoVoluntario fv WHERE idFuncao=? AND idVoluntario=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idFuncao);
			pstmt.setInt(2, idVoluntario);

			ResultSet result = pstmt.executeQuery();

			while (result.next()) {

				return true;
			}
			result.close();
			pstmt.close();

		} catch (SQLException se) {
			System.out.println(
					"[FuncaoVoluntarioDAO] - Erro ao pegar FuncaoVoluntario por ID da função e do voluntário.\n"
							+ se.getMessage());
		} finally {
			con.close();
		}

		return false;
	}

	public List<Entidade> getListPorIdVoluntario(int idVoluntario) throws Exception {
		con = Conexao.getConnection();

		List<Entidade> list = new ArrayList<>();
		funcaoDAO = new FuncaoController();
		voluntarioDAO = new VoluntarioDAO();

		String sql = "SELECT fv.id, fv.idFuncao, fv.idVoluntario FROM funcaoVoluntario fv WHERE idVoluntario=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idVoluntario);

			ResultSet result = pstmt.executeQuery();

			while (result.next()) {

				Funcao funcao = (Funcao) funcaoDAO.getPorId(result.getInt("idFuncao"));
				Voluntario voluntario = (Voluntario) voluntarioDAO.getPorId(result.getInt("idVoluntario"));

				funcaoVoluntario = new FuncaoVoluntario(result.getInt("id"), funcao, voluntario);

				list.add(funcaoVoluntario);
			}
			result.close();
			pstmt.close();

		} catch (SQLException se) {
			System.out.println(
					"[FuncaoVoluntarioDAO] - Erro ao pegar lista de FuncaoVoluntario por ID do voluntário.\n"
							+ se.getMessage());
		} finally {
			con.close();
		}

		return list;
	}

}
