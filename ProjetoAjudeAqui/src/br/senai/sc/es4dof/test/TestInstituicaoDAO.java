package br.senai.sc.es4dof.test;

import java.util.List;

import br.senai.sc.ajudeaqui.abstracts.Entidade;
import br.senai.sc.es4dof.dao.InstituicaoDAO;
import br.senai.sc.es4dof.dao.UsuarioDAO;
import br.senai.sc.es4dof.model.Instituicao;
import br.senai.sc.es4dof.model.Usuario;

/**
 * DAO OK
 * @author Jaime Gomes
 *
 */
public class TestInstituicaoDAO {

	public static void main(String[] args) throws Exception {

		InstituicaoDAO instDAO = new InstituicaoDAO();
		UsuarioDAO usuarioDAO = new UsuarioDAO();

		Usuario usuario = (Usuario) usuarioDAO.getPorLogin("apae");

		Instituicao instituicao = new Instituicao("APAE", "123.456.78/0001-23", "APAE", "apae@org.com", "3234-5678",
				"Rua x", "apae.org.br", "Ademir", "escola de ensino especial", usuario);

		Instituicao instituicao2 = new Instituicao("APAE", "123.456.78/0001-23", "APAE", "apae@org.com", "3234-5678",
				"Rua x", "apae.org.br", "Ademir", "escola de ensino especial", usuario);

		instDAO.salvar(instituicao);

		System.out.println("salvo");

		Instituicao inst = (Instituicao) instDAO.getPorIdUsuario(usuario.getId());

		instDAO.editar(inst);

		instDAO.excluir(instituicao2);

		Instituicao in = (Instituicao) instDAO.getPorId(1);

		System.out.println("razao social: " + in.getRazaoSocial());

		List<Entidade> list = instDAO.listar();
		
		for(Entidade e: list) {
			Instituicao i = (Instituicao) e;
			
			System.out.println("razao social: " + i.getRazaoSocial());
		}

	}

}
