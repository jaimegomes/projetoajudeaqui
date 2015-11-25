package br.senai.sc.ajudeaqui.controller;

import java.util.List;

import br.senai.sc.ajudeaqui.abstracts.Entidade;
import br.senai.sc.ajudeaqui.dao.VoluntarioAnuncioDAO;
import br.senai.sc.ajudeaqui.interfaces.IController;

/**
 * Classe de controle da entidade VoluntarioAnuncio
 * 
 * @author Jaime Gomes
 *
 */
public class VoluntarioAnuncioController implements IController {

	private VoluntarioAnuncioDAO dao;

	@Override
	public void salvar(Entidade entidade) throws Exception {

		dao = new VoluntarioAnuncioDAO();
		dao.salvar(entidade);

	}

	@Override
	public void excluir(Entidade entidade) throws Exception {

		dao = new VoluntarioAnuncioDAO();
		dao.excluir(entidade);
	}

	@Override
	public void editar(Entidade entidade) throws Exception {

		dao = new VoluntarioAnuncioDAO();
		dao.editar(entidade);

	}

	@Override
	public List<Entidade> listar() throws Exception {

		dao = new VoluntarioAnuncioDAO();
		return dao.listar();
	}

	@Override
	public Entidade getPorId(int id) throws Exception {

		dao = new VoluntarioAnuncioDAO();
		return dao.getPorId(id);
	}

	/**
	 * Método que retorna uma entidade VoluntarioAnuncio de acordo com o id do
	 * anuncio passados como parâmetro..
	 * 
	 * @param idAnuncio
	 * @return
	 * @throws Exception
	 */
	public List<Entidade> getPorIdAnuncio(int idAnuncio) throws Exception {

		dao = new VoluntarioAnuncioDAO();
		return dao.getPorIdAnuncio(idAnuncio);

	}

	/**
	 * Método que retorna uma entidade VoluntarioAnuncio de acordo com o id do
	 * voluntario passados como parâmetro..
	 * 
	 * @param idVoluntario
	 * @return
	 * @throws Exception
	 */
	public List<Entidade> getPorIdVoluntario(int idVoluntario) throws Exception {

		dao = new VoluntarioAnuncioDAO();
		return dao.getPorIdVoluntario(idVoluntario);

	}

	/**
	 * Método que retorna uma entidade VoluntarioAnuncio de acordo com o id do
	 * anuncio e o id do voluntario passados como parâmetro.
	 * 
	 * @param idVoluntario
	 * @param idAnuncio
	 * @return
	 * @throws Exception
	 */
	public List<Entidade> getPorIdVoluntarioIdAnuncio(int idVoluntario,
			int idAnuncio) throws Exception {

		dao = new VoluntarioAnuncioDAO();
		return dao.getPorIdVoluntarioIdAnuncio(idVoluntario, idAnuncio);

	}

}
