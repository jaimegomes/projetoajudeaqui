package br.senai.sc.ajudeaqui.controller;

import java.util.List;

import br.senai.sc.ajudeaqui.abstracts.Entidade;
import br.senai.sc.ajudeaqui.dao.UsuarioDAO;
import br.senai.sc.ajudeaqui.interfaces.IController;
import br.senai.sc.ajudeaqui.model.Usuario;


/**
 * Classe de controle da entidade Usuario
 * 
 * @author Jaime Gomes
 *
 */
public class UsuarioController implements IController {

	private UsuarioDAO dao;
	private Usuario usuario;

	@Override
	public void salvar(Entidade entidade) throws Exception {

		dao = new UsuarioDAO();
		usuario = (Usuario) entidade;

		if (usuario == null)
			throw new Exception("Usuario n�o pode ser nulo.");

		if (usuario.getLogin().trim().equals(""))
			throw new Exception("Login do usuario � obrigat�rio.");

		if (usuario.getSenha().trim().equals(""))
			throw new Exception("Senha do usuario � obrigat�ria.");

		if (usuario.getPerfil().trim().equals(""))
			throw new Exception("Perfil do usuario � obrigat�rio.");

		dao.salvar(usuario);

	}

	@Override
	public void excluir(Entidade entidade) throws Exception {

		dao = new UsuarioDAO();
		dao.excluir(entidade);

	}

	@Override
	public void editar(Entidade entidade) throws Exception {

		dao = new UsuarioDAO();
		dao.editar(entidade);
	}

	@Override
	public List<Entidade> listar() throws Exception {

		dao = new UsuarioDAO();
		return dao.listar();
	}

	@Override
	public Entidade getPorId(int id) throws Exception {

		dao = new UsuarioDAO();
		return dao.getPorId(id);
	}

	/**
	 * M�todo que retorna o Usuario de acordo com o login passado como
	 * par�metro.
	 * 
	 * @param login
	 * @return
	 * @throws Exception
	 */
	public Entidade getPorLogin(String login) throws Exception {

		dao = new UsuarioDAO();
		return dao.getPorLogin(login);
	}

}
