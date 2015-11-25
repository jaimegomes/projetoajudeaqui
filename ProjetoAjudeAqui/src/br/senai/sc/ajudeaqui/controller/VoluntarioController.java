package br.senai.sc.ajudeaqui.controller;

import java.util.List;

import br.senai.sc.ajudeaqui.abstracts.Entidade;
import br.senai.sc.ajudeaqui.dao.VoluntarioDAO;
import br.senai.sc.ajudeaqui.interfaces.IController;

public class VoluntarioController implements IController {

	private VoluntarioDAO volDAO;

	@Override
	public void salvar(Entidade entidade) throws Exception {

		volDAO = new VoluntarioDAO();
		volDAO.salvar(entidade);

	}

	@Override
	public void excluir(Entidade entidade) throws Exception {

		volDAO = new VoluntarioDAO();
		volDAO.excluir(entidade);
	}

	@Override
	public void editar(Entidade entidade) throws Exception {

		volDAO = new VoluntarioDAO();
		volDAO.editar(entidade);
	}

	@Override
	public List<Entidade> listar() throws Exception {

		volDAO = new VoluntarioDAO();
		return volDAO.listar();
	}

	@Override
	public Entidade getPorId(int id) throws Exception {

		volDAO = new VoluntarioDAO();
		return volDAO.getPorId(id);
	}

	/**
	 * Método que retorna um Voluntário de acordo com o id do usuário passado
	 * como parâmetro.
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public Entidade getPorIdUsuario(int id) throws Exception {

		volDAO = new VoluntarioDAO();
		return volDAO.getPorIdUsuario(id);
	}

	/**
	 * Método que retorna uma lista de Voluntários de acordo com o sql passado
	 * como parâmetro.
	 * 
	 * @param sql
	 * @return
	 * @throws Exception
	 */
	public List<Entidade> pesquisarVoluntario(String sql) throws Exception {

		volDAO = new VoluntarioDAO();
		return volDAO.pesquisarVoluntario(sql);

	}

}
