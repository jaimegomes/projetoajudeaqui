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
import br.senai.sc.ajudeaqui.model.VoluntarioAnuncio;

public class VoluntarioAnuncioDAO extends GenericDAO {

	private Connection con = null;
	private VoluntarioAnuncio voluntarioAnuncio = null;

	@Override
	public void salvar(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "INSERT INTO voluntarioAnuncio (idVoluntario, idAnuncio) VALUES (?,?)";
		try {

			voluntarioAnuncio = (VoluntarioAnuncio) entidade;

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, voluntarioAnuncio.getIdVoluntario());
			pstmt.setInt(2, voluntarioAnuncio.getIdAnuncio());

			pstmt.execute();
			con.commit();
			pstmt.close();

		} catch (SQLException se) {
			System.out
					.println("[VoluntarioAnuncioDAO] - Erro ao salvar VoluntarioAnuncio.\n"
							+ se.getMessage());
			con.rollback();

		} finally {
			con.close();
		}

	}

	@Override
	public void excluir(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "DELETE FROM VoluntarioAnuncio WHERE id=?";
		try {

			voluntarioAnuncio = (VoluntarioAnuncio) entidade;

			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, voluntarioAnuncio.getId());

			pstm.execute();
			con.commit();
			pstm.close();

		} catch (SQLException e) {
			con.rollback();
			System.out
					.println("[VoluntarioAnuncioDAO] - Erro ao excluir VoluntarioAnuncio.\n"
							+ e.getMessage());
		} finally {
			con.close();
		}

	}

	@Override
	public void editar(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "UPDATE voluntarioAnuncio SET idAnuncio = ?, idVoluntario = ? WHERE id = ?";
		try {

			voluntarioAnuncio = (VoluntarioAnuncio) entidade;

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, voluntarioAnuncio.getIdAnuncio());
			pstmt.setInt(2, voluntarioAnuncio.getIdVoluntario());
			pstmt.setInt(3, voluntarioAnuncio.getId());

			pstmt.execute();
			con.commit();
			pstmt.close();

		} catch (SQLException e) {
			con.rollback();
			System.out
					.println("[VoluntarioAnuncioDAO] - Erro ao editar VoluntarioAnuncio.\n"
							+ e.getMessage());
		} finally {
			con.close();
		}

	}

	@Override
	public List<Entidade> listar() throws Exception {

		con = Conexao.getConnection();

		List<Entidade> listaVoluntarioAnuncio = new ArrayList<Entidade>();
		String sql = "SELECT va.id, va.idVoluntario, va.idAnuncio FROM voluntarioAnuncio va";
		try {

			PreparedStatement pstm = con.prepareStatement(sql);

			ResultSet result = pstm.executeQuery();

			while (result.next()) {

				try {

					voluntarioAnuncio = new VoluntarioAnuncio(
							result.getInt("id"), result.getInt("idVoluntario"),
							result.getInt("idAnuncio"));

					listaVoluntarioAnuncio.add(voluntarioAnuncio);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

			pstm.close();

		} catch (SQLException e) {
			con.rollback();
			System.out
					.println("[VoluntarioAnuncioDAO] - Erro ao listar VoluntarioAnuncio.\n"
							+ e.getMessage());

		} finally {
			con.close();
		}
		return listaVoluntarioAnuncio;

	}

	@Override
	public Entidade getPorId(int id) throws Exception {
		con = Conexao.getConnection();

		String sql = "SELECT va.id, va.idAnuncio, va.idVoluntario FROM voluntarioAnuncio va WHERE id=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);

			ResultSet result = pstmt.executeQuery();

			while (result.next()) {

				voluntarioAnuncio = new VoluntarioAnuncio(result.getInt("id"),
						result.getInt("idVoluntario"),
						result.getInt("idAnuncio"));
			}
			result.close();
			pstmt.close();

		} catch (SQLException se) {
			System.out
					.println("[VoluntarioAnuncioDAO] - Erro ao pegar VoluntarioAnuncio por ID.\n"
							+ se.getMessage());
		} finally {
			con.close();
		}

		return voluntarioAnuncio;
	}

}
