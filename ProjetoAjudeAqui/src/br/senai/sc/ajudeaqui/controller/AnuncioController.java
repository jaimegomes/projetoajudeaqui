package br.senai.sc.ajudeaqui.controller;

import java.util.List;

import br.senai.sc.ajudeaqui.abstracts.Entidade;
import br.senai.sc.ajudeaqui.dao.AnuncioDAO;
import br.senai.sc.ajudeaqui.interfaces.IController;
import br.senai.sc.ajudeaqui.model.Anuncio;

public class AnuncioController implements IController {

	Anuncio anuncio;
	AnuncioDAO dao;

	@Override
	public void salvar(Entidade entidade) throws Exception {

		anuncio = (Anuncio) entidade;
		dao = new AnuncioDAO();

		if (anuncio.equals(null))
			throw new Exception("Anuncio não pode ser nulo.");

		if (anuncio.getTitulo().trim().equals(""))
			throw new Exception("O título do anuncio não pode ser nulo.");

		if (anuncio.getDescricao().trim().equals(""))
			throw new Exception("A descrição do anuncio não pode ser nulo.");

		if (anuncio.getQtdVagas() <= 0)
			throw new Exception("A quantidade de vagas deve ser maior que zero.");

		dao.salvar(anuncio);
	}

	@Override
	public void excluir(Entidade entidade) throws Exception {

		dao = new AnuncioDAO();
		dao.excluir(entidade);

	}

	@Override
	public void editar(Entidade entidade) throws Exception {

		anuncio = (Anuncio) entidade;
		dao = new AnuncioDAO();

		if (anuncio.equals(null))
			throw new Exception("Anuncio não pode ser nulo.");

		if (anuncio.getTitulo().trim().equals(""))
			throw new Exception("O título do anuncio não pode ser nulo.");

		if (anuncio.getDescricao().trim().equals(""))
			throw new Exception("A descrição do anuncio não pode ser nulo.");

		if (anuncio.getQtdVagas() <= 0)
			throw new Exception("A quantidade de vagas deve ser maior que zero.");

		dao.editar(anuncio);

	}

	@Override
	public List<Entidade> listar() throws Exception {

		dao = new AnuncioDAO();
		return dao.listar();
	}

	@Override
	public Entidade getPorId(int id) throws Exception {

		dao = new AnuncioDAO();
		return dao.getPorId(id);
	}

	public List<Entidade> getPorIdInstituicao(int idInstituicao) throws Exception {

		dao = new AnuncioDAO();
		return dao.getPorIdInstituicao(idInstituicao);
	}

	public List<Entidade> pesquisarAnuncio(String sql) throws Exception {

		dao = new AnuncioDAO();
		return dao.pesquisarAnuncio(sql);

	}

}
