package br.senai.sc.ajudeaqui.controller;

import java.util.List;

import br.senai.sc.ajudeaqui.abstracts.Entidade;
import br.senai.sc.ajudeaqui.dao.FuncaoVoluntarioDAO;
import br.senai.sc.ajudeaqui.interfaces.IController;

/**
 * Classe de controle da entidade FuncaoVoluntario
 * 
 * @author Jaime Gomes
 *
 */
public class FuncaoVoluntarioController implements IController {

	private FuncaoVoluntarioDAO dao;

	@Override
	public void salvar(Entidade entidade) throws Exception {

		dao = new FuncaoVoluntarioDAO();
		dao.salvar(entidade);

	}

	@Override
	public void excluir(Entidade entidade) throws Exception {

		dao = new FuncaoVoluntarioDAO();
		dao.excluir(entidade);

	}

	@Override
	public void editar(Entidade entidade) throws Exception {

		dao = new FuncaoVoluntarioDAO();
		dao.editar(entidade);

	}

	@Override
	public List<Entidade> listar() throws Exception {

		dao = new FuncaoVoluntarioDAO();
		return dao.listar();
	}

	@Override
	public Entidade getPorId(int id) throws Exception {

		dao = new FuncaoVoluntarioDAO();
		return dao.getPorId(id);
	}

	/**
	 * Método que verifica a existência de uma FuncaoVoluntario no banco de
	 * dados de acordo com o id da função e id do voluntário passados como
	 * parâmetros.
	 * 
	 * @param idFuncao
	 * @param idVoluntario
	 * @return
	 * @throws Exception
	 */
	public boolean getPorIdFuncaoVoluntario(int idFuncao, int idVoluntario)
			throws Exception {

		dao = new FuncaoVoluntarioDAO();
		return dao.getPorIdFuncaoVoluntario(idFuncao, idVoluntario);
	}

	/**
	 * Método que retorna uma lista de FuncaoVoluntario de acordo com o id do
	 * voluntário passado como parâmetro.
	 * 
	 * @param idVoluntario
	 * @return
	 * @throws Exception
	 */
	public List<Entidade> getListPorIdVoluntario(int idVoluntario)
			throws Exception {

		dao = new FuncaoVoluntarioDAO();
		return dao.getListPorIdVoluntario(idVoluntario);
	}

}
