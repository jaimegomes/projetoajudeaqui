package br.senai.sc.es4dof.test;

import java.util.Date;
import java.util.List;

import br.senai.sc.ajudeaqui.abstracts.Entidade;
import br.senai.sc.es4dof.dao.AnuncioDAO;
import br.senai.sc.es4dof.dao.FuncaoDAO;
import br.senai.sc.es4dof.dao.InstituicaoDAO;
import br.senai.sc.es4dof.model.Anuncio;
import br.senai.sc.es4dof.model.Funcao;
import br.senai.sc.es4dof.model.Instituicao;

public class TestAnuncioDAO {

	public static void main(String[] args) throws Exception {

		AnuncioDAO anuncioDAO = new AnuncioDAO();

		InstituicaoDAO instituicaoDAO = new InstituicaoDAO();
		Instituicao inst = (Instituicao) instituicaoDAO.getPorId(1);
//
//		FuncaoDAO funcaoDAO = new FuncaoDAO();
//		Funcao funcao = (Funcao) funcaoDAO.listar().get(0);
//
//		Anuncio anuncio = new Anuncio("titulo", "descricao", 2, new Date(), funcao, "Aberto", inst);
//		Anuncio anuncio2 = new Anuncio("titulo2", "descricao2", 3, new Date(), funcao, "Aberto", inst);
//		anuncioDAO.salvar(anuncio);
//
		
		Anuncio anun = (Anuncio) anuncioDAO.getPorId(1);
		System.out.println(anun.getStatus());
		System.out.println(anun.getFuncao().getFuncao());
		
		
//		anun.setStatus("Encerrado");
//		anuncioDAO.editar(anun);

//		anuncioDAO.excluir(anun);

//		Anuncio a = (Anuncio) anuncioDAO.getPorIdInstituicao(inst.getId());
//		System.out.println("titulo: " + a.getTitulo());
//
//		List<Entidade> list = anuncioDAO.listar();
//
//		for (Entidade e : list) {
//			Anuncio anunc = (Anuncio) e;
//			System.out.println("titulo: " + anunc.getTitulo());
//
//		}
	}

}
