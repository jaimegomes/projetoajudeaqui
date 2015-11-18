package br.senai.sc.ajudeaqui.controller;

import java.util.List;

import br.senai.sc.ajudeaqui.abstracts.Entidade;
import br.senai.sc.ajudeaqui.dao.FuncaoDAO;
import br.senai.sc.ajudeaqui.interfaces.IController;

public class FuncaoController implements IController {

	private FuncaoDAO dao;

	@Override
	public void salvar(Entidade entidade) throws Exception {

		dao = new FuncaoDAO();
		dao.salvar(entidade);

	}

	@Override
	public void excluir(Entidade entidade) throws Exception {

		dao = new FuncaoDAO();
		dao.excluir(entidade);

	}

	@Override
	public void editar(Entidade entidade) throws Exception {

		dao = new FuncaoDAO();
		dao.editar(entidade);

	}

	@Override
	public List<Entidade> listar() throws Exception {

		dao = new FuncaoDAO();
		return dao.listar();
	}

	@Override
	public Entidade getPorId(int id) throws Exception {

		dao = new FuncaoDAO();
		return dao.getPorId(id);
	}

	public Entidade getPorFuncao(String funcao) throws Exception {

		dao = new FuncaoDAO();
		return dao.getPorFuncao(funcao);
	}

}
