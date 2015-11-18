package br.senai.sc.ajudeaqui.controller;

import java.util.List;

import br.senai.sc.ajudeaqui.abstracts.Entidade;
import br.senai.sc.ajudeaqui.dao.HorarioDAO;
import br.senai.sc.ajudeaqui.interfaces.IController;

public class HorarioController implements IController {

	private HorarioDAO dao;

	@Override
	public void salvar(Entidade entidade) throws Exception {

		dao = new HorarioDAO();
		dao.salvar(entidade);
	}

	@Override
	public void excluir(Entidade entidade) throws Exception {

		dao = new HorarioDAO();
		dao.excluir(entidade);
	}

	@Override
	public void editar(Entidade entidade) throws Exception {

		dao = new HorarioDAO();
		dao.editar(entidade);
	}

	@Override
	public List<Entidade> listar() throws Exception {

		dao = new HorarioDAO();
		return dao.listar();
	}

	@Override
	public Entidade getPorId(int id) throws Exception {

		dao = new HorarioDAO();
		return dao.getPorId(id);
	}

	public Entidade getPorHorario(String horario) throws Exception {

		dao = new HorarioDAO();
		return dao.getPoHorario(horario);
	}

}
