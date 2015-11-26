package br.senai.sc.ajudeaqui.controller;

import java.util.List;

import br.senai.sc.ajudeaqui.abstracts.Entidade;
import br.senai.sc.ajudeaqui.dao.HorarioVoluntarioDAO;
import br.senai.sc.ajudeaqui.interfaces.IController;
import br.senai.sc.ajudeaqui.model.HorarioVoluntario;

/**
 * Classe de controle da entidade HorarioVoluntario
 * 
 * @author Jaime Gomes
 *
 */
public class HorarioVoluntarioController implements IController {

	private HorarioVoluntarioDAO dao;

	@Override
	public void salvar(Entidade entidade) throws Exception {

		dao = new HorarioVoluntarioDAO();
		dao.salvar(entidade);

	}

	@Override
	public void excluir(Entidade entidade) throws Exception {

		dao = new HorarioVoluntarioDAO();
		dao.excluir(entidade);

	}

	@Override
	public void editar(Entidade entidade) throws Exception {

		dao = new HorarioVoluntarioDAO();
		dao.editar(entidade);

	}

	@Override
	public List<Entidade> listar() throws Exception {

		dao = new HorarioVoluntarioDAO();
		return dao.listar();
	}

	@Override
	public Entidade getPorId(int id) throws Exception {

		dao = new HorarioVoluntarioDAO();
		return dao.getPorId(id);
	}

	/**
	 * Método que retorna um HorarioVoluntario de acordo com o id do horario e o
	 * id do voluntário passados como parâmetro.
	 * 
	 * @param idHorario
	 * @param idVoluntario
	 * @return
	 * @throws Exception
	 */
	public HorarioVoluntario getPorIdHorarioVoluntario(int idHorario,
			int idVoluntario) throws Exception {

		dao = new HorarioVoluntarioDAO();
		return dao.getPorIdHorarioVoluntario(idHorario, idVoluntario);
	}

	/**
	 * Método que retorna uma lista de HorarioVoluntario de acordo com o id do
	 * voluntário passado como parâmetro.
	 * 
	 * @param idVoluntario
	 * @return
	 * @throws Exception
	 */
	public List<Entidade> getListPorIdVoluntario(int idVoluntario)
			throws Exception {

		dao = new HorarioVoluntarioDAO();
		return dao.getListPorIdVoluntario(idVoluntario);
	}

}
