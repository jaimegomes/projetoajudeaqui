package br.senai.sc.es4dof.test;

import br.senai.sc.es4dof.dao.VoluntarioDAO;

public class TestVoluntarioDAO {

	public static void main(String[] args) {
		VoluntarioDAO volDAO = new VoluntarioDAO();

		// Voluntario OK!!!

		// Voluntario voluntario = new Voluntario("Jaime", "234-5678",
		// "009.688.179-80", "Rua x",
		// "jaimegomes.bjj@gmail.com",
		// StringUtils.getInstance().parseStringToDate("24/10/1987"), usu,
		// "M",
		// "Casado", "xxx", "9840-0757", "gente fina");
		//
		// volDAO.salvar(voluntario);
		//
		// Voluntario vol = (Voluntario) volDAO.getPorId(1);
		// System.out.println("nome: " + vol.getNome());
		// System.out.println("login: " + vol.getUsuario().getLogin());
		//
		// Voluntario voluntarioEditado = new Voluntario("Jaime O Belo",
		// "234-5678", "009.688.179-80", "Rua x",
		// "jaimegomes.bjj@gmail.com",
		// StringUtils.getInstance().parseStringToDate("24/10/1987"), usu,
		// "M",
		// "Casado", "xxx", "9840-0757", "gente fina");

		// volDAO.editar(voluntarioEditado);

		// Voluntario volu = (Voluntario) volDAO.getPorId(3);

		// System.out.println("EDITADO");
		// System.out.println("nome: " + volu.getNome());
		// System.out.println("login: " + volu.getUsuario().getLogin());

		//

		// List<Entidade> list = volDAO.listar();
		// System.out.println("list.size(): " + list.size());
		//
		// for (Entidade e : list) {
		//
		// Voluntario volun = (Voluntario) e;
		// System.out.println("nome: " + volun.getNome());
		// System.out.println("login: " + volun.getUsuario().getLogin());
		//
		// }

		// volDAO.excluir(volDAO.getPorId(2));
	}

}
