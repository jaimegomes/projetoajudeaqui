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
import br.senai.sc.es4dof.model.HorarioVoluntario;

public class HorarioVoluntarioDAO extends GenericDAO {

	private Connection con = null;
	private HorarioVoluntario horarioVoluntario = null;

	@Override
	public void salvar(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "INSERT INTO horarioVoluntario (idHorario, idVoluntario) VALUES (?,?)";
		try {

			horarioVoluntario = (HorarioVoluntario) entidade;

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, horarioVoluntario.getIdHorario());
			pstmt.setInt(2, horarioVoluntario.getIdVoluntario());

			pstmt.execute();
			con.commit();
			pstmt.close();

		} catch (SQLException se) {
			System.out
					.println("[HorarioVoluntarioDAO] - Erro ao salvar HorarioVoluntario.\n"
							+ se.getMessage());
			con.rollback();

		} finally {
			con.close();
		}

	}

	@Override
	public void excluir(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "DELETE FROM horarioVoluntario WHERE id=?";
		try {

			horarioVoluntario = (HorarioVoluntario) entidade;

			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, horarioVoluntario.getId());

			pstm.execute();
			con.commit();
			pstm.close();

		} catch (SQLException e) {
			con.rollback();
			System.out
					.println("[HorarioVoluntarioDAO] - Erro ao excluir HorarioVoluntario.\n"
							+ e.getMessage());
		} finally {
			con.close();
		}

	}

	@Override
	public void editar(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "UPDATE horarioVoluntario SET idHorario = ?, idVoluntario = ? WHERE id = ?";
		try {

			horarioVoluntario = (HorarioVoluntario) entidade;

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, horarioVoluntario.getIdHorario());
			pstmt.setInt(2, horarioVoluntario.getIdVoluntario());
			pstmt.setInt(3, horarioVoluntario.getId());

			pstmt.execute();
			con.commit();
			pstmt.close();

		} catch (SQLException e) {
			con.rollback();
			System.out
					.println("[HorarioVoluntarioDAO] - Erro ao editar HorarioVoluntario.\n"
							+ e.getMessage());
		} finally {
			con.close();
		}

	}

	@Override
	public List<Entidade> listar() throws Exception {

		con = Conexao.getConnection();

		List<Entidade> listaHorarioVoluntario = new ArrayList<Entidade>();
		String sql = "SELECT hv.id, hv.idHorario, hv.idVoluntario FROM horarioVoluntario hv";
		try {

			PreparedStatement pstm = con.prepareStatement(sql);

			ResultSet result = pstm.executeQuery();

			while (result.next()) {

				try {

					horarioVoluntario = new HorarioVoluntario(
							result.getInt("id"), result.getInt("idHorario"),
							result.getInt("idVoluntario"));

					listaHorarioVoluntario.add(horarioVoluntario);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

			pstm.close();

		} catch (SQLException e) {
			con.rollback();
			System.out
					.println("[HorarioVoluntarioDAO] - Erro ao listar HorarioVoluntario.\n"
							+ e.getMessage());

		} finally {
			con.close();
		}
		return listaHorarioVoluntario;

	}

	@Override
	public Entidade getPorId(int id) throws Exception {
		con = Conexao.getConnection();

		String sql = "SELECT hv.id, hv.idHorario, hv.idVoluntario FROM horarioVoluntario hv WHERE id=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);

			ResultSet result = pstmt.executeQuery();

			while (result.next()) {

				horarioVoluntario = new HorarioVoluntario(result.getInt("id"),
						result.getInt("idHorario"),
						result.getInt("idVoluntario"));
			}
			result.close();
			pstmt.close();

		} catch (SQLException se) {
			System.out
					.println("[HorarioVoluntarioDAO] - Erro ao pegar HorarioVoluntario por ID.\n"
							+ se.getMessage());
		} finally {
			con.close();
		}

		return horarioVoluntario;
	}

}
