package br.senai.sc.ajudeaqui.controller;

import java.util.List;

import br.senai.sc.ajudeaqui.abstracts.Entidade;
import br.senai.sc.ajudeaqui.dao.InstituicaoDAO;
import br.senai.sc.ajudeaqui.interfaces.IController;
import br.senai.sc.ajudeaqui.model.Usuario;

/**
 * Classe de controle da entidade Institui��o
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
	 * M�todo que retorna uma Institui��o de acordo com o id do usu�rio passado
	 * como par�metro.
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
	 * M�todo que retorna uma Institui��o de acordo com o nome da institui��o e
	 * usu�rio passados como par�metro
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
