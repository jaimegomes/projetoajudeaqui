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
import br.senai.sc.ajudeaqui.model.HorarioVoluntario;
import br.senai.sc.ajudeaqui.model.Voluntario;

/**
 * Classe DAO da entidade HorarioVoluntario
 * 
 * @author Jaime Gomes
 *
 */
public class HorarioVoluntarioDAO extends GenericDAO {

	private Connection con = null;
	private HorarioVoluntario voluntarioHorario = null;
	private HorarioDAO horarioDAO = null;
	private VoluntarioDAO voluntarioDAO = null;

	@Override
	public void salvar(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "INSERT INTO voluntarioHorario (idHorario, idVoluntario) VALUES (?,?)";
		try {

			voluntarioHorario = (HorarioVoluntario) entidade;

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, voluntarioHorario.getHorario().getId());
			pstmt.setInt(2, voluntarioHorario.getVoluntario().getId());

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

		String sql = "DELETE FROM voluntarioHorario WHERE id=?";
		try {

			voluntarioHorario = (HorarioVoluntario) entidade;

			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, voluntarioHorario.getId());

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

		String sql = "UPDATE voluntarioHorario SET idHorario = ?, idVoluntario = ? WHERE id = ?";
		try {

			voluntarioHorario = (HorarioVoluntario) entidade;

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, voluntarioHorario.getHorario().getId());
			pstmt.setInt(2, voluntarioHorario.getVoluntario().getId());
			pstmt.setInt(3, voluntarioHorario.getId());

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
		horarioDAO = new HorarioDAO();
		voluntarioDAO = new VoluntarioDAO();

		List<Entidade> listaHorarioVoluntario = new ArrayList<Entidade>();
		String sql = "SELECT hv.id, hv.idHorario, hv.idVoluntario FROM voluntarioHorario hv";
		try {

			PreparedStatement pstm = con.prepareStatement(sql);

			ResultSet result = pstm.executeQuery();

			while (result.next()) {

				try {

					Horario horario = (Horario) horarioDAO.getPorId(result
							.getInt("idHorario"));
					Voluntario voluntario = (Voluntario) voluntarioDAO
							.getPorId(result.getInt("idVoluntario"));
					voluntarioHorario = new HorarioVoluntario(
							result.getInt("id"), horario, voluntario);

					listaHorarioVoluntario.add(voluntarioHorario);

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
		horarioDAO = new HorarioDAO();
		voluntarioDAO = new VoluntarioDAO();

		String sql = "SELECT hv.id, hv.idHorario, hv.idVoluntario FROM voluntarioHorario hv WHERE id=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);

			ResultSet result = pstmt.executeQuery();

			while (result.next()) {

				Horario horario = (Horario) horarioDAO.getPorId(result
						.getInt("idHorario"));
				Voluntario voluntario = (Voluntario) voluntarioDAO
						.getPorId(result.getInt("idVoluntario"));
				voluntarioHorario = new HorarioVoluntario(result.getInt("id"),
						horario, voluntario);
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

		return voluntarioHorario;
	}

	/**
	 * M�todo que retorna um HorarioVoluntario de acordo com o id do horario e o
	 * id do volunt�rio passados como par�metro.
	 * 
	 * @param idHorario
	 * @param idVoluntario
	 * @return
	 * @throws Exception
	 */
	public HorarioVoluntario getPorIdHorarioVoluntario(int idHorario,
			int idVoluntario) throws Exception {
		con = Conexao.getConnection();
		horarioDAO = new HorarioDAO();
		voluntarioDAO = new VoluntarioDAO();

		String sql = "SELECT hv.id, hv.idHorario, hv.idVoluntario FROM voluntarioHorario hv WHERE idVoluntario=? AND idHorario=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idVoluntario);
			pstmt.setInt(2, idHorario);

			ResultSet result = pstmt.executeQuery();

			while (result.next()) {

				Horario horario = (Horario) horarioDAO.getPorId(result
						.getInt("idHorario"));
				Voluntario voluntario = (Voluntario) voluntarioDAO
						.getPorId(result.getInt("idVoluntario"));
				voluntarioHorario = new HorarioVoluntario(result.getInt("id"),
						horario, voluntario);
			}
			result.close();
			pstmt.close();

		} catch (SQLException se) {
			System.out
					.println("[HorarioVoluntarioDAO] - Erro ao pegar HorarioVoluntario por ID do Volunt�rio e ID do hor�rio.\n"
							+ se.getMessage());
		} finally {
			con.close();
		}

		return voluntarioHorario;
	}

	/**
	 * M�todo que retorna uma lista de HorarioVoluntario de acordo com o id do
	 * volunt�rio passado como par�metro.
	 * 
	 * @param idVoluntario
	 * @return
	 * @throws Exception
	 */
	public List<Entidade> getListPorIdVoluntario(int idVoluntario)
			throws Exception {
		con = Conexao.getConnection();

		List<Entidade> list = new ArrayList<>();
		horarioDAO = new HorarioDAO();
		voluntarioDAO = new VoluntarioDAO();

		String sql = "SELECT hv.id, hv.idHorario, hv.idVoluntario FROM voluntarioHorario hv WHERE idVoluntario=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, idVoluntario);

			ResultSet result = pstmt.executeQuery();

			while (result.next()) {

				Horario horario = (Horario) horarioDAO.getPorId(result
						.getInt("idHorario"));
				Voluntario voluntario = (Voluntario) voluntarioDAO
						.getPorId(result.getInt("idVoluntario"));

				voluntarioHorario = new HorarioVoluntario(result.getInt("id"),
						horario, voluntario);

				list.add(voluntarioHorario);
			}
			result.close();
			pstmt.close();

		} catch (SQLException se) {
			System.out
					.println("[HorarioVoluntarioDAO] - Erro ao pegarHorarioVoluntario por ID do volunt�rio.\n"
							+ se.getMessage());
		} finally {
			con.close();
		}

		return list;
	}

}
