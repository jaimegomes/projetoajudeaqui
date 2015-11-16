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
import br.senai.sc.ajudeaqui.model.FuncaoVoluntario;

public class FuncaoVoluntarioDAO extends GenericDAO {

	private Connection con = null;
	private FuncaoVoluntario funcaoVoluntario = null;

	@Override
	public void salvar(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "INSERT INTO funcaoVoluntario (idFuncao, idVoluntario) VALUES (?,?)";
		try {

			funcaoVoluntario = (FuncaoVoluntario) entidade;

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, funcaoVoluntario.getIdFuncao());
			pstmt.setInt(2, funcaoVoluntario.getIdVoluntario());

			pstmt.execute();
			con.commit();
			pstmt.close();

		} catch (SQLException se) {
			System.out
					.println("[FuncaoVoluntarioDAO] - Erro ao salvar FuncaoVoluntario.\n"
							+ se.getMessage());
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
			System.out
					.println("[FuncaoVoluntarioDAO] - Erro ao excluir FuncaoVoluntario.\n"
							+ e.getMessage());
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
			pstmt.setInt(1, funcaoVoluntario.getIdFuncao());
			pstmt.setInt(2, funcaoVoluntario.getIdVoluntario());
			pstmt.setInt(3, funcaoVoluntario.getId());

			pstmt.execute();
			con.commit();
			pstmt.close();

		} catch (SQLException e) {
			con.rollback();
			System.out
					.println("[FuncaoVoluntarioDAO] - Erro ao editar FuncaoVoluntario.\n"
							+ e.getMessage());
		} finally {
			con.close();
		}

	}

	@Override
	public List<Entidade> listar() throws Exception {

		con = Conexao.getConnection();

		List<Entidade> listaFuncaoVoluntario = new ArrayList<Entidade>();
		String sql = "SELECT fv.id, fv.idFuncao, fv.idVoluntario FROM funcaoVoluntario fv";
		try {

			PreparedStatement pstm = con.prepareStatement(sql);

			ResultSet result = pstm.executeQuery();

			while (result.next()) {

				try {

					funcaoVoluntario = new FuncaoVoluntario(
							result.getInt("id"), result.getInt("idFuncao"),
							result.getInt("idVoluntario"));

					listaFuncaoVoluntario.add(funcaoVoluntario);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

			pstm.close();

		} catch (SQLException e) {
			con.rollback();
			System.out
					.println("[FuncaoVoluntarioDAO] - Erro ao listar FuncaoVoluntario.\n"
							+ e.getMessage());

		} finally {
			con.close();
		}
		return listaFuncaoVoluntario;

	}

	@Override
	public Entidade getPorId(int id) throws Exception {
		con = Conexao.getConnection();

		String sql = "SELECT fv.id, fv.idFuncao, fv.idVoluntario FROM funcaoVoluntario fv WHERE id=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);

			ResultSet result = pstmt.executeQuery();

			while (result.next()) {

				funcaoVoluntario = new FuncaoVoluntario(result.getInt("id"),
						result.getInt("idFuncao"),
						result.getInt("idVoluntario"));
			}
			result.close();
			pstmt.close();

		} catch (SQLException se) {
			System.out
					.println("[FuncaoVoluntarioDAO] - Erro ao pegar FuncaoVoluntario por ID.\n"
							+ se.getMessage());
		} finally {
			con.close();
		}

		return funcaoVoluntario;
	}

}