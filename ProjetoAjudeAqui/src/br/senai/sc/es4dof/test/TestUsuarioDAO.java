package br.senai.sc.es4dof.test;

import br.senai.sc.es4dof.dao.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		UsuarioDAO usuDAO = new UsuarioDAO();

		try {

			// Usuario OK!!!
			//
			// Usuario usuario = new Usuario();
			// usuario.setLogin("jaime");
			// usuario.setPerfil("Voluntário");
			// usuario.setSenha("123");
			// usuDAO.salvar(usuario);
			// Usuario u = (Usuario) usuDAO.getPorId(2);
			// Usuario usu = (Usuario) usuDAO.getPorLogin("jaime");
			// System.out.println("login: " + u.getLogin() + " id: " +
			// u.getId());
			// System.out.println("login: " + usu.getLogin());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
