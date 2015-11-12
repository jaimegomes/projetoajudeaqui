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
import br.senai.sc.es4dof.model.Funcao;

/**
 * 
 * @author Jaime Gomes
 *
 */
public class FuncaoDAO extends GenericDAO {

	private Connection con = null;
	private Funcao funcao = null;

	@Override
	public void salvar(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "INSERT INTO funcao (funcao) VALUES (?)";
		try {

			funcao = (Funcao) entidade;

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, funcao.getFuncao());

			pstmt.execute();
			con.commit();
			pstmt.close();

		} catch (SQLException se) {
			System.out.println("[FuncaoDAO] - Erro ao salvar funcao.\n" + se.getMessage());
			con.rollback();

		} finally {
			con.close();
		}

	}

	@Override
	public void excluir(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "DELETE FROM funcao WHERE id=?";
		try {

			funcao = (Funcao) entidade;

			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, funcao.getId());

			pstm.execute();
			con.commit();
			pstm.close();

		} catch (SQLException e) {
			con.rollback();
			System.out.println("[FuncaoDAO] - Erro ao excluir funcao.\n" + e.getMessage());
		} finally {
			con.close();
		}

	}

	@Override
	public void editar(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "UPDATE funcao SET funcao = ? WHERE id = ?";
		try {

			funcao = (Funcao) entidade;

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, funcao.getFuncao());
			pstmt.setInt(2, funcao.getId());

			pstmt.execute();
			con.commit();
			pstmt.close();

		} catch (SQLException e) {
			con.rollback();
			System.out.println("[FuncaoDAO] - Erro ao editar funcao.\n" + e.getMessage());
		} finally {
			con.close();
		}

	}

	@Override
	public List<Entidade> listar() throws Exception {

		con = Conexao.getConnection();

		List<Entidade> listaFuncoes = new ArrayList<Entidade>();
		String sql = "SELECT * FROM funcao";
		try {

			PreparedStatement pstm = con.prepareStatement(sql);

			ResultSet result = pstm.executeQuery();

			while (result.next()) {

				try {

					funcao = new Funcao(result.getInt("id"), result.getString("funcao"));

					listaFuncoes.add(funcao);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

			pstm.close();

		} catch (SQLException e) {
			con.rollback();
			System.out.println("[FuncaoDAO] - Erro ao listar funcaos.\n" + e.getMessage());

		} finally {
			con.close();
		}
		return listaFuncoes;

	}

	@Override
	public Entidade getPorId(int id) throws Exception {
		con = Conexao.getConnection();

		String sql = "SELECT f.id, f.funcao FROM funcao f WHERE id=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);

			ResultSet result = pstmt.executeQuery();

			while (result.next()) {

				funcao = new Funcao(result.getInt("id"), result.getString("funcao"));
			}
			result.close();
			pstmt.close();

		} catch (SQLException se) {
			System.out.println("[FuncaoDAO] - Erro ao pegar funcao por ID.\n" + se.getMessage());
		} finally {
			con.close();
		}

		return funcao;
	}

}
