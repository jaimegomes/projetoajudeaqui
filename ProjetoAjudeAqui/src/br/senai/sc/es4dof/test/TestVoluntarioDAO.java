package br.senai.sc.es4dof.test;

import java.util.List;

import br.senai.sc.ajudeaqui.abstracts.Entidade;
import br.senai.sc.es4dof.dao.UsuarioDAO;
import br.senai.sc.es4dof.dao.VoluntarioDAO;
import br.senai.sc.es4dof.model.Usuario;
import br.senai.sc.es4dof.model.Voluntario;
import br.senai.sc.es4dof.utils.StringUtils;

/**
 * DAO OK
 * @author Jaime Gomes
 *
 */
public class TestVoluntarioDAO {

	public static void main(String[] args) throws Exception {
		VoluntarioDAO volDAO = new VoluntarioDAO();
		UsuarioDAO usuDAO = new UsuarioDAO();

		Usuario usu = (Usuario) usuDAO.getPorLogin("jaime");

		Voluntario voluntario = new Voluntario("Jaime", "234-5678", "009.688.179-80", "Rua x",
				"jaimegomes.bjj@gmail.com", StringUtils.getInstance().parseStringToDate("24/10/1987"), usu, "M",
				"Casado", "xxx", "9840-0757", "gente fina");
//
//		Voluntario voluntario2 = new Voluntario("Jurema", "234-5678", "123.456.789-10", "Rua x", "jurema@gmail.com",
//				StringUtils.getInstance().parseStringToDate("20/02/1985"), usu, "M", "Casado", "xxx", "9840-0757",
//				"gente fina");
//
//		// salvar
		volDAO.salvar(voluntario);
//		System.out.println("voluntario " + voluntario.getNome() + " salvo.");
//		volDAO.salvar(voluntario2);
//		System.out.println("voluntario " + voluntario.getNome() + " salvo.");
//
//		System.out.println("=================================");
//
//		// getPorId
		Voluntario vol = (Voluntario) volDAO.getPorId(4);
		System.out.println("nome: " + vol.getNome());
		System.out.println("login: " + vol.getUsuario().getLogin());
//
//		System.out.println("=================================");

		// editar
//		Voluntario volu = (Voluntario) volDAO.getPorId(3);
//		volu.setNome("Jaime O Belo");
//		System.out.println("editado");
//		volDAO.editar(volu);
//		
//		Voluntario volunt = (Voluntario) volDAO.getPorId(3);
//		
//		System.out.println("voluntario " + volunt.getNome());
//
//		System.out.println("=================================");

//		System.out.println("LISTAR VOLUNTARIOS");
//		List<Entidade> list = volDAO.listar();
//
//		for (Entidade e : list) {
//
//			Voluntario volun = (Voluntario) e;
//			System.out.println("nome: " + volun.getNome());
//			System.out.println("login: " + volun.getUsuario().getLogin());
//
//		}
//
//		 volDAO.excluir(volDAO.getPorId(2));
	}

}
