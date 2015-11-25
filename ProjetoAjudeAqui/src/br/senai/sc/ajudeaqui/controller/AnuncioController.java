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
			throw new Exception("Anuncio n�o pode ser nulo.");

		if (anuncio.getTitulo().trim().equals(""))
			throw new Exception("O t�tulo do anuncio n�o pode ser nulo.");

		if (anuncio.getDescricao().trim().equals(""))
			throw new Exception("A descri��o do anuncio n�o pode ser nulo.");

		if (anuncio.getQtdVagas() <= 0)
			throw new Exception(
					"A quantidade de vagas deve ser maior que zero.");

		if (anuncio.getFuncao() == null)
			throw new Exception("Voc� deve selecionar um tipo de servi�o.");

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
			throw new Exception("Anuncio n�o pode ser nulo.");

		if (anuncio.getTitulo().trim().equals(""))
			throw new Exception("O t�tulo do anuncio n�o pode ser nulo.");

		if (anuncio.getDescricao().trim().equals(""))
			throw new Exception("A descri��o do anuncio n�o pode ser nulo.");

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
	 * M�todo que retorna uma lista de Anuncios de acordo com o id da
	 * institui��o passado como par�metro
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
	 * M�todo que retorna uma lista de anuncios de acordo com o sql passado como
	 * par�metro, utilizado no filtro.
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
	 * M�todo que retorna uma lista de anuncios com status em aberto.
	 * 
	 * @return
	 * @throws Exception
	 */
	public List<Entidade> getAbertos() throws Exception {

		dao = new AnuncioDAO();
		return dao.getAbertos();
	}

	/**
	 * M�todo que retorna uma lista de anuncios de acordo com o titulo e o id da
	 * institui��o passados como par�metro.
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
