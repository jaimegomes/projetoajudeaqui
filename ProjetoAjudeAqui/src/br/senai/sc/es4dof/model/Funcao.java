package br.senai.sc.es4dof.model;

import br.senai.sc.es4dof.abstracts.Entidade;

/**
 * Classe que representa a entidade Funcao
 * 
 * @author Jaime Gomes
 *
 */
public class Funcao extends Entidade {

	private int id;
	private String funcao;

	/**
	 * Construtor padrao.
	 */
	public Funcao() {
		super();
	}

	/**
	 * Construtor que recebe a funcao como parametro.
	 * 
	 * @param funcao
	 */
	public Funcao(String funcao) {
		super();
		this.funcao = funcao;
	}

	/**
	 * Construtor que recebe todos os atributos como paramentro.
	 * 
	 * @param id
	 * @param funcao
	 */
	public Funcao(int id, String funcao) {
		super();
		this.id = id;
		this.funcao = funcao;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the funcao
	 */
	public String getFuncao() {
		return funcao;
	}

	/**
	 * @param funcao
	 *            the funcao to set
	 */
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

}
