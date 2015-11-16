package br.senai.sc.ajudeaqui.test;

import java.util.List;

import br.senai.sc.ajudeaqui.abstracts.Entidade;
import br.senai.sc.ajudeaqui.dao.FuncaoDAO;
import br.senai.sc.ajudeaqui.model.Funcao;

public class TestFuncaoDAO {

	public static void main(String[] args) throws Exception {

		FuncaoDAO funcaoDAO = new FuncaoDAO();

		Funcao funcao = new Funcao("Carpinteiro");
		Funcao funcao2 = new Funcao("Cuidados Especiais");

		funcaoDAO.salvar(funcao);
		funcaoDAO.salvar(funcao2);

//		Funcao fun = (Funcao) funcaoDAO.getPorId(2);
//		System.out.println("funcao: " + fun.getFuncao());
//		
//		fun.setFuncao("Editado");
//		funcaoDAO.editar(fun);
//
//		List<Entidade> list = funcaoDAO.listar();
//
//		for (Entidade e : list) {
//			Funcao f = (Funcao) e;
//
//			System.out.println("funcao: " + f.getFuncao());
//		}

//		funcaoDAO.excluir(funcao2);
	}

}
