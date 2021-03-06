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
import br.senai.sc.ajudeaqui.model.Usuario;
import br.senai.sc.ajudeaqui.model.Voluntario;

/**
 * Classe DAO da entidade Voluntario
 * @author Jaime Gomes
 *
 */
public class VoluntarioDAO extends GenericDAO {

	private Connection con = null;
	private Voluntario voluntario = null;
	private Usuario usuario = null;
	private UsuarioDAO usuarioDAO = null;

	@Override
	public void salvar(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "INSERT INTO voluntario (nome, sexo, cpf, dataNasc, estadoCivil, endereco, complemento, telefone, celular, email, informacoesComplementares, idUsuario) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
		try {

			voluntario = (Voluntario) entidade;

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, voluntario.getNome());
			pstmt.setString(2, voluntario.getSexo());
			pstmt.setString(3, voluntario.getCpf());

			if (voluntario.getDataNascimento() != null)
				pstmt.setDate(4, new java.sql.Date(voluntario.getDataNascimento().getTime()));

			else
				pstmt.setNull(4, java.sql.Types.DATE);

			pstmt.setString(5, voluntario.getEstadoCivil());
			pstmt.setString(6, voluntario.getEndereco());
			pstmt.setString(7, voluntario.getComplemento());
			pstmt.setString(8, voluntario.getTelefone());
			pstmt.setString(9, voluntario.getCelular());
			pstmt.setString(10, voluntario.getEmail());
			pstmt.setString(11, voluntario.getInformacoesComplementares());
			pstmt.setInt(12, voluntario.getUsuario().getId());

			pstmt.execute();
			con.commit();
			pstmt.close();

		} catch (SQLException se) {
			System.out.println("[VoluntarioDAO] - Erro ao salvar volunt�rio.\n" + se.getMessage());
			con.rollback();

		} finally {
			con.close();
		}

	}

	@Override
	public void excluir(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "DELETE FROM voluntario WHERE id=?";
		try {

			voluntario = (Voluntario) entidade;

			PreparedStatement pstm = con.prepareStatement(sql);
			pstm.setInt(1, voluntario.getId());

			pstm.execute();
			con.commit();
			pstm.close();

		} catch (SQLException e) {
			con.rollback();
			System.out.println("[VoluntarioDAO] - Erro ao excluir volunt�rio.\n" + e.getMessage());
		} finally {
			con.close();
		}

	}

	@Override
	public void editar(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "UPDATE voluntario SET nome = ?, sexo = ?, cpf = ?, dataNasc = ?, estadoCivil = ?, endereco = ?, complemento = ?, telefone = ?, celular = ?, email = ?, informacoesComplementares = ?, idUsuario = ? WHERE id = ?";
		try {

			voluntario = (Voluntario) entidade;

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, voluntario.getNome());
			pstmt.setString(2, voluntario.getSexo());
			pstmt.setString(3, voluntario.getCpf());

			if (voluntario.getDataNascimento() != null)
				pstmt.setDate(4, new java.sql.Date(voluntario.getDataNascimento().getTime()));

			else
				pstmt.setNull(4, java.sql.Types.DATE);

			pstmt.setString(5, voluntario.getEstadoCivil());
			pstmt.setString(6, voluntario.getEndereco());
			pstmt.setString(7, voluntario.getComplemento());
			pstmt.setString(8, voluntario.getTelefone());
			pstmt.setString(9, voluntario.getCelular());
			pstmt.setString(10, voluntario.getEmail());
			pstmt.setString(11, voluntario.getInformacoesComplementares());
			pstmt.setInt(12, voluntario.getUsuario().getId());
			pstmt.setInt(13, voluntario.getId());

			pstmt.execute();
			con.commit();
			pstmt.close();

		} catch (SQLException e) {
			con.rollback();
			System.out.println("[VoluntarioDAO] - Erro ao editar volunt�rio.\n" + e.getMessage());
		} finally {
			con.close();
		}

	}

	@Override
	public List<Entidade> listar() throws Exception {

		con = Conexao.getConnection();
		usuarioDAO = new UsuarioDAO();

		List<Entidade> listaVoluntarios = new ArrayList<Entidade>();
		String sql = "SELECT v.id, v.nome, v.telefone, v.cpf, v.endereco, v.email, v.dataNasc, v.idUsuario, v.sexo, v.estadoCivil, v.complemento, v.celular, v.informacoesComplementares FROM voluntario v";
		try {

			PreparedStatement pstm = con.prepareStatement(sql);

			ResultSet result = pstm.executeQuery();

			while (result.next()) {

				try {
					usuario = (Usuario) usuarioDAO.getPorId(result.getInt("idUsuario"));

					voluntario = new Voluntario(result.getInt("id"), result.getString("nome"),
							result.getString("telefone"), result.getString("cpf"), result.getString("endereco"),
							result.getString("email"), result.getDate("dataNasc"), usuario, result.getString("sexo"),
							result.getString("estadoCivil"), result.getString("complemento"),
							result.getString("celular"), result.getString("informacoesComplementares"));

					listaVoluntarios.add(voluntario);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

			pstm.close();

		} catch (SQLException e) {
			con.rollback();
			System.out.println("[VoluntarioDAO] - Erro ao listar voluntarios.\n" + e.getMessage());

		} finally {
			con.close();
		}
		return listaVoluntarios;

	}

	@Override
	public Entidade getPorId(int id) throws Exception {

		con = Conexao.getConnection();
		usuarioDAO = new UsuarioDAO();

		String sql = "SELECT v.id, v.nome, v.telefone, v.cpf, v.endereco, v.email, v.dataNasc, v.idUsuario, v.sexo, v.estadoCivil, v.complemento, v.celular, v.informacoesComplementares FROM voluntario v WHERE id=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);

			ResultSet result = pstmt.executeQuery();

			while (result.next()) {

				usuario = (Usuario) usuarioDAO.getPorId(result.getInt("idUsuario"));

				voluntario = new Voluntario(result.getInt("id"), result.getString("nome"), result.getString("telefone"),
						result.getString("cpf"), result.getString("endereco"), result.getString("email"),
						result.getDate("dataNasc"), usuario, result.getString("sexo"), result.getString("estadoCivil"),
						result.getString("complemento"), result.getString("celular"),
						result.getString("informacoesComplementares"));
			}
			result.close();
			pstmt.close();

		} catch (SQLException se) {
			System.out.println("[VoluntarioDAO] - Erro ao pegar voluntario por ID.\n" + se.getMessage());
		} finally {
			con.close();
		}

		return voluntario;
	}

	/**
	 * M�todo que retorna um Volunt�rio de acordo com o id do usu�rio passado
	 * como par�metro.
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Entidade getPorIdUsuario(int id) throws Exception {

		con = Conexao.getConnection();
		usuarioDAO = new UsuarioDAO();

		String sql = "SELECT v.id, v.nome, v.telefone, v.cpf, v.endereco, v.email, v.dataNasc, v.idUsuario, v.sexo, v.estadoCivil, v.complemento, v.celular, v.informacoesComplementares FROM voluntario v WHERE idUsuario=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);

			ResultSet result = pstmt.executeQuery();

			while (result.next()) {

				usuario = (Usuario) usuarioDAO.getPorId(result.getInt("idUsuario"));

				voluntario = new Voluntario(result.getInt("id"), result.getString("nome"), result.getString("telefone"),
						result.getString("cpf"), result.getString("endereco"), result.getString("email"),
						result.getDate("dataNasc"), usuario, result.getString("sexo"), result.getString("estadoCivil"),
						result.getString("complemento"), result.getString("celular"),
						result.getString("informacoesComplementares"));
			}
			result.close();
			pstmt.close();

		} catch (SQLException se) {
			System.out.println("[VoluntarioDAO] - Erro ao pegar voluntario por ID.\n" + se.getMessage());
		} finally {
			con.close();
		}

		return voluntario;
	}

	/**
	 * M�todo que retorna uma lista de Volunt�rios de acordo com o sql passado
	 * como par�metro.
	 * 
	 * @param sql
	 * @return
	 * @throws Exception
	 */
	public List<Entidade> pesquisarVoluntario(String sql) throws Exception {
		con = Conexao.getConnection();

		List<Entidade> listVoluntarios = new ArrayList<Entidade>();

		PreparedStatement pstmt = null;
		try {

			pstmt = con.prepareStatement(sql.toString());

			ResultSet result = pstmt.executeQuery();

			while (result.next()) {

				voluntario = new Voluntario(result.getInt("id"), result.getString("nome"), result.getString("telefone"),
						result.getString("cpf"), result.getString("endereco"), result.getString("email"),
						result.getDate("dataNasc"), usuario, result.getString("sexo"), result.getString("estadoCivil"),
						result.getString("complemento"), result.getString("celular"),
						result.getString("informacoesComplementares"));

				listVoluntarios.add(voluntario);
			}
			result.close();
			pstmt.close();

		} catch (SQLException se) {
			System.out.println("[VoluntarioDAO] - Erro ao pesquisar volunt�rio.\n" + se.getMessage());
		} finally {
			con.close();
		}

		return listVoluntarios;
	}

}
