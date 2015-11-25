package br.senai.sc.ajudeaqui.controller;

import java.util.List;

import br.senai.sc.ajudeaqui.abstracts.Entidade;
import br.senai.sc.ajudeaqui.dao.AnuncioDAO;
import br.senai.sc.ajudeaqui.interfaces.IController;
import br.senai.sc.ajudeaqui.model.Anuncio;

/**
 * Classe de controle da entidade Anuncio
 * 
 * @author Jaime Gomes
 *
 */
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
			throw new Exception(
					"A quantidade de vagas deve ser maior que zero.");

		if (anuncio.getFuncao() == null)
			throw new Exception("Você deve selecionar um tipo de serviço.");

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
			throw new Exception(
					"A quantidade de vagas deve ser maior que zero.");

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

	/**
	 * Método que retorna uma lista de Anuncios de acordo com o id da
	 * instituição passado como parâmetro
	 * 
	 * @param idInstituicao
	 * @return
	 * @throws Exception
	 */
	public List<Entidade> getPorIdInstituicao(int idInstituicao)
			throws Exception {

		dao = new AnuncioDAO();
		return dao.getPorIdInstituicao(idInstituicao);
	}

	/**
	 * Método que retorna uma lista de anuncios de acordo com o sql passado como
	 * parâmetro, utilizado no filtro.
	 * 
	 * @param sql
	 * @return
	 * @throws Exception
	 */
	public List<Entidade> pesquisarAnuncio(String sql) throws Exception {

		dao = new AnuncioDAO();
		return dao.pesquisarAnuncio(sql);

	}

	/**
	 * Método que retorna uma lista de anuncios com status em aberto.
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Entidade> getAbertos() throws Exception {

		dao = new AnuncioDAO();
		return dao.getAbertos();
	}

	/**
	 * Método que retorna uma lista de anuncios de acordo com o titulo e o id da
	 * instituição passados como parâmetro.
	 * 
	 * @param titulo
	 * @param idInstituicao
	 * @return
	 * @throws Exception
	 */
	public List<Entidade> getPorTituloEIdInstituicao(String titulo,
			int idInstituicao) throws Exception {

		dao = new AnuncioDAO();
		return dao.getPorTituloEIdInstituicao(titulo, idInstituicao);
	}

}
