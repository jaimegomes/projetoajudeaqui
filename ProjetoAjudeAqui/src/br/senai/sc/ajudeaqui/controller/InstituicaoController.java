package br.senai.sc.ajudeaqui.controller;

import java.util.List;

import br.senai.sc.ajudeaqui.abstracts.Entidade;
import br.senai.sc.ajudeaqui.dao.InstituicaoDAO;
import br.senai.sc.ajudeaqui.interfaces.IController;
import br.senai.sc.ajudeaqui.model.Usuario;

/**
 * Classe de controle da entidade Instituição
 * 
 * @author Jaime Gomes
 *
 */
public class InstituicaoController implements IController {

	private InstituicaoDAO dao;

	@Override
	public void salvar(Entidade entidade) throws Exception {

		dao = new InstituicaoDAO();
		dao.salvar(entidade);

	}

	@Override
	public void excluir(Entidade entidade) throws Exception {

		dao = new InstituicaoDAO();
		dao.excluir(entidade);
	}

	@Override
	public void editar(Entidade entidade) throws Exception {

		dao = new InstituicaoDAO();
		dao.editar(entidade);
	}

	@Override
	public List<Entidade> listar() throws Exception {

		dao = new InstituicaoDAO();
		return dao.listar();
	}

	@Override
	public Entidade getPorId(int id) throws Exception {
		dao = new InstituicaoDAO();
		return dao.getPorId(id);
	}

	/**
	 * Método que retorna uma Instituição de acordo com o id do usuário passado
	 * como parâmetro.
	 * 
	 * @param idUsuario
	 * @return
	 * @throws Exception
	 */
	public Entidade getPorIdUsuario(int idUsuario) throws Exception {
		dao = new InstituicaoDAO();
		return dao.getPorIdUsuario(idUsuario);
	}

	/**
	 * Método que retorna uma Instituição de acordo com o nome da instituição e
	 * usuário passados como parâmetro
	 * 
	 * @param nome
	 * @param usuario
	 * @return
	 * @throws Exception
	 */
	public Entidade getPorNome(String nome, Usuario usuario) throws Exception {
		dao = new InstituicaoDAO();
		return dao.getPorNome(nome, usuario);
	}

}
