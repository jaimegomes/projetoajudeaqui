package br.senai.sc.ajudeaqui.controller;

import java.util.List;

import br.senai.sc.ajudeaqui.abstracts.Entidade;
import br.senai.sc.es4dof.dao.UsuarioDAO;
import br.senai.sc.es4dof.interfaces.IController;
import br.senai.sc.es4dof.model.Usuario;

public class UsuarioController implements IController {

	UsuarioDAO dao = new UsuarioDAO();
	Usuario usuario = null;

	@Override
	public void salvar(Entidade entidade) throws Exception {
		usuario = (Usuario) entidade;

		if (usuario == null)
			throw new Exception("Usuario não pode ser nulo.");

		if (usuario.getLogin().trim().equals(""))
			throw new Exception("Login do usuario é obrigatório.");

		if (usuario.getSenha().trim().equals(""))
			throw new Exception("Senha do usuario é obrigatória.");

		if (usuario.getPerfil().trim().equals(""))
			throw new Exception("Perfil do usuario é obrigatório.");

		dao.salvar(usuario);

	}

	@Override
	public void excluir(Entidade entidade) throws Exception {

	}

	@Override
	public void editar(Entidade entidade) throws Exception {

	}

	@Override
	public List<Entidade> listar() throws Exception {
		return null;
	}

	@Override
	public Entidade getPorId(int id) throws Exception {
		return null;
	}
	
	public Entidade getPorLogin(String login) throws Exception {
		
		Usuario usuario = (Usuario) dao.getPorLogin(login);
		
		return usuario;
	}

}
