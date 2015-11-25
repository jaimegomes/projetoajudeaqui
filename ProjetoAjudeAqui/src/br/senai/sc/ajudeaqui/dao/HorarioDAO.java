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
import br.senai.sc.ajudeaqui.model.Horario;


/**
 * Classe DAO da entidade Horario
 * @author Jaime Gomes
 *
 */
public class HorarioDAO extends GenericDAO {

	private Connection con = null;
	private Horario horario = null;

	@Override
	public void salvar(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "INSERT INTO horario (horario) VALUES (?)";
		try {

			horario = (Horario) entidade;

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, horario.getHorario());

			pstmt.execute();
			con.commit();
			pstmt.close();

		} catch (SQLException se) {
			System.out.println("[HorarioDAO] - Erro ao salvar Horario.\n" + se.getMessage());
			con.rollback();

		} finally {
			con.close();
		}

	}

	@Override
	public void excluir(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "DELETE FROM horario WHERE id=?";
		try {

			horario = (Horario) entidade;

			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, horario.getId());

			pstm.execute();
			con.commit();
			pstm.close();

		} catch (SQLException e) {
			con.rollback();
			System.out.println("[HorarioDAO] - Erro ao excluir Horario.\n" + e.getMessage());
		} finally {
			con.close();
		}

	}

	@Override
	public void editar(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "UPDATE horario SET horario = ? WHERE id = ?";
		try {

			horario = (Horario) entidade;

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, horario.getHorario());
			pstmt.setInt(2, horario.getId());

			pstmt.execute();
			con.commit();
			pstmt.close();

		} catch (SQLException e) {
			con.rollback();
			System.out.println("[HorarioDAO] - Erro ao editar Horario.\n" + e.getMessage());
		} finally {
			con.close();
		}

	}

	@Override
	public List<Entidade> listar() throws Exception {

		con = Conexao.getConnection();

		List<Entidade> listaHorario = new ArrayList<Entidade>();
		String sql = "SELECT h.id, h.horario FROM horario h";
		try {

			PreparedStatement pstm = con.prepareStatement(sql);

			ResultSet result = pstm.executeQuery();

			while (result.next()) {

				try {

					horario = new Horario(result.getInt("id"), result.getString("horario"));

					listaHorario.add(horario);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

			pstm.close();

		} catch (SQLException e) {
			con.rollback();
			System.out.println("[HorarioDAO] - Erro ao listar Horario.\n" + e.getMessage());

		} finally {
			con.close();
		}
		return listaHorario;

	}

	@Override
	public Entidade getPorId(int id) throws Exception {
		con = Conexao.getConnection();

		String sql = "SELECT h.id, h.horario FROM horario h WHERE id=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);

			ResultSet result = pstmt.executeQuery();

			while (result.next()) {

				horario = new Horario(result.getInt("id"), result.getString("horario"));
			}
			result.close();
			pstmt.close();

		} catch (SQLException se) {
			System.out.println("[HorarioDAO] - Erro ao pegar Horario por ID.\n" + se.getMessage());
		} finally {
			con.close();
		}

		return horario;
	}

	/**
	 * Método que retorna um Horario de acordo com o nome do horario passado
	 * como parâmetro.
	 * 
	 * @param horario
	 * @return
	 * @throws Exception
	 */
	public Entidade getPoHorario(String hor) throws SQLException {

		con = Conexao.getConnection();

		String sql = "SELECT h.id, h.horario FROM horario h WHERE horario=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, hor);

			ResultSet result = pstmt.executeQuery();

			while (result.next()) {

				horario = new Horario(result.getInt("id"), result.getString("horario"));
			}
			result.close();
			pstmt.close();

		} catch (SQLException se) {
			System.out.println("[HorarioDAO] - Erro ao pegar Horario por horario.\n" + se.getMessage());
		} finally {
			con.close();
		}

		return horario;
	}

}
