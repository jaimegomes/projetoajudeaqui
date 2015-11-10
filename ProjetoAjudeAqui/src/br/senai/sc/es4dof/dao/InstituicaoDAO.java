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

		String sql = "INSERT INTO instituicao (razaoSocial, nome, email, telefone, endereco, cnpj, site, responsavel, observacoes, idUsuario) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
		try {

			instituicao = (Instituicao) entidade;

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, instituicao.getNome());
			pstmt.setString(2, instituicao.getSexo());
			pstmt.setString(3, instituicao.getCpf());
			pstmt.setDate(4, new java.sql.Date(instituicao.getDataNascimento().getTime()));
			pstmt.setString(5, instituicao.getEstadoCivil());
			pstmt.setString(6, instituicao.getEndereco());
			pstmt.setString(7, instituicao.getComplemento());
			pstmt.setString(8, instituicao.getTelefone());
			pstmt.setString(9, instituicao.getCelular());
			pstmt.setString(10, instituicao.getEmail());
			pstmt.setString(11, instituicao.getInformacoesComplementares());
			pstmt.setInt(12, instituicao.getUsuario().getId());

			pstmt.execute();
			con.commit();
			pstmt.close();

		} catch (SQLException se) {
			System.out.println("[instituicaoDAO] - Erro ao salvar voluntário.\n" + se.getMessage());
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
			System.out.println("[instituicaoDAO] - Erro ao excluir voluntário.\n" + e.getMessage());
		} finally {
			con.close();
		}

	}

	@Override
	public void editar(Entidade entidade) throws Exception {

		con = Conexao.getConnection();

		String sql = "UPDATE instituicao SET nome = ?, sexo = ?, cpf = ?, dataNasc = ?, estadoCivil = ?, endereco = ?, complemento = ?, telefone = ?, celular = ?, email = ?, informacoesComplementares = ?, idUsuario = ?";
		try {

			instituicao = (Instituicao) entidade;

			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setString(1, instituicao.getNome());
			pstmt.setString(2, instituicao.getSexo());
			pstmt.setString(3, instituicao.getCpf());
			pstmt.setDate(4, new java.sql.Date(instituicao.getDataNascimento().getTime()));
			pstmt.setString(5, instituicao.getEstadoCivil());
			pstmt.setString(6, instituicao.getEndereco());
			pstmt.setString(7, instituicao.getComplemento());
			pstmt.setString(8, instituicao.getTelefone());
			pstmt.setString(9, instituicao.getCelular());
			pstmt.setString(10, instituicao.getEmail());
			pstmt.setString(11, instituicao.getInformacoesComplementares());
			pstmt.setInt(12, instituicao.getUsuario().getId());

			pstmt.execute();
			con.commit();
			pstmt.close();

		} catch (SQLException e) {
			con.rollback();
			System.out.println("[instituicaoDAO] - Erro ao editar voluntário.\n" + e.getMessage());
		} finally {
			con.close();
		}

	}

	@Override
	public List<Entidade> listar() throws Exception {

		con = Conexao.getConnection();

		List<Entidade> listainstituicaos = new ArrayList<Entidade>();
		String sql = "SELECT * FROM instituicao";
		try {

			PreparedStatement pstm = con.prepareStatement(sql);

			ResultSet result = pstm.executeQuery();

			while (result.next()) {

				try {
					usuDAO = new UsuarioDAO();
					usuario = (Usuario) usuDAO.getPorId(result.getInt("idUsuario"));

					instituicao = new Instituicao(result.getInt("id"), result.getString("nome"),
							result.getString("telefone"), result.getString("cpf"), result.getString("endereco"),
							result.getString("email"), result.getDate("dataNasc"), usuario, result.getString("sexo"),
							result.getString("estadoCivil"), result.getString("complemento"),
							result.getString("celular"), result.getString("informacoesComplementares"));
					listainstituicaos.add(instituicao);

				} catch (Exception e) {
					e.printStackTrace();
				}

			}

			pstm.close();

		} catch (SQLException e) {
			con.rollback();
			System.out.println("[instituicaoDAO] - Erro ao listar instituicaos.\n" + e.getMessage());

		} finally {
			con.close();
		}
		return listainstituicaos;

	}

	@Override
	public Entidade getPorId(int id) throws Exception {

		con = Conexao.getConnection();

		String sql = "SELECT v.id, v.nome, v.telefone, v.cpf, v.endereco, v.email, v.dataNasc, v.idUsuario, v.sexo, v.estadoCivil, v.complemento, v.celular, v.informacoesComplementares FROM instituicao v WHERE id=?";
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);

			ResultSet result = pstmt.executeQuery();

			while (result.next()) {

				usuDAO = new UsuarioDAO();
				usuario = (Usuario) usuDAO.getPorId(result.getInt("idUsuario"));

				instituicao = new Instituicao(result.getInt("id"), result.getString("nome"),
						result.getString("telefone"), result.getString("cpf"), result.getString("endereco"),
						result.getString("email"), result.getDate("dataNasc"), usuario, result.getString("sexo"),
						result.getString("estadoCivil"), result.getString("complemento"), result.getString("celular"),
						result.getString("informacoesComplementares"));
			}
			result.close();
			pstmt.close();

		} catch (SQLException se) {
			System.out.println("[instituicaoDAO] - Erro ao pegar instituicao por ID.\n" + se.getMessage());
		} finally {
			con.close();
		}

		return instituicao;
	}

}
