package br.senai.sc.ajudeaqui.controller;

import java.util.List;

import br.senai.sc.ajudeaqui.abstracts.Entidade;
import br.senai.sc.ajudeaqui.dao.VoluntarioAnuncioDAO;
import br.senai.sc.ajudeaqui.interfaces.IController;

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

	public List<Entidade> getPorIdAnuncio(int idAnuncio) throws Exception {
	
		dao = new VoluntarioAnuncioDAO();
		return dao.getPorIdAnuncio(idAnuncio);
		
	}
	
	public List<Entidade> getPorIdVoluntario(int idVoluntario) throws Exception {
		
		dao = new VoluntarioAnuncioDAO();
		return dao.getPorIdVoluntario(idVoluntario);
		
	}
	
public List<Entidade> getPorIdVoluntarioIdAnuncio(int idVoluntario, int idAnuncio) throws Exception {
		
		dao = new VoluntarioAnuncioDAO();
		return dao.getPorIdVoluntarioIdAnuncio(idVoluntario, idAnuncio);
		
	}

}
