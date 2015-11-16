package br.senai.sc.ajudeaqui.test;

import java.util.List;

import br.senai.sc.ajudeaqui.abstracts.Entidade;
import br.senai.sc.ajudeaqui.dao.UsuarioDAO;
import br.senai.sc.ajudeaqui.model.Usuario;

/**
 * DAO OK
 * @author Jaime Gomes
 *
 */
public class TestUsuarioDAO {

	
	public static void main(String[] args) {
		UsuarioDAO usuDAO = new UsuarioDAO();

		try {

			Usuario usuario = new Usuario("jaime", "Voluntário", "123");
			Usuario usuario2 = new Usuario("apae", "Instituição", "123");

			// salvar
			usuDAO.salvar(usuario);
			System.out.println("test salvar login: " + usuario.getLogin());

			usuDAO.salvar(usuario2);
			System.out.println("test salvar login: " + usuario2.getLogin());

			System.out.println("=================================");

			List<Entidade> listUsuarios = usuDAO.listar();

			System.out.println("LISTA DE USUARIOS");
			System.out.println("test listar");

			for (Entidade ent : listUsuarios) {
				Usuario u = (Usuario) ent;

				System.out.println("id: " + u.getId() + "\nlogin: " + u.getLogin() + "\n");
			}

			System.out.println("=================================");

//			// getPorId
//			Usuario u = (Usuario) usuDAO.getPorId(5);
//			System.out.println("test getPorId \nid: " + u.getId() + "\nlogin: " + u.getLogin());
//
//			System.out.println("=================================");

			// getPorLogin
			Usuario usu = (Usuario) usuDAO.getPorLogin("apae");
			System.out.println("test getPorLogin \nid: " + usu.getId() + "\nlogin: " + usu.getLogin());

			System.out.println("=================================");

			// editar
			Usuario u = (Usuario) usuDAO.getPorLogin("apae");
			u.setLogin("editado");
			u.setSenha("editado");
			u.setPerfil("editado");
			usuDAO.editar(u);
			
			// excluir
//			usuDAO.excluir(usu);
//			usuDAO.excluir(usuario);
//			System.out.println("usuarios excluidos.");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
