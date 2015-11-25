package br.senai.sc.ajudeaqui.model;

import br.senai.sc.ajudeaqui.abstracts.Entidade;

/**
 * Classe que representa a entidade FuncaoVoluntario
 * 
 * @author Jaime Gomes
 *
 */
public class FuncaoVoluntario extends Entidade {

	private int id;
	private Funcao funcao;
	private Voluntario voluntario;

	public FuncaoVoluntario() {
		super();
	}

	/**
	 * 
	 * @param funcao
	 * @param voluntario
	 */
	public FuncaoVoluntario(Funcao funcao, Voluntario voluntario) {
		super();
		this.funcao = funcao;
		this.voluntario = voluntario;
	}

	/**
	 * @param id
	 * @param funcao
	 * @param voluntario
	 */
	public FuncaoVoluntario(int id, Funcao funcao, Voluntario voluntario) {
		super();
		this.id = id;
		this.funcao = funcao;
		this.voluntario = voluntario;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the funcao
	 */
	public Funcao getFuncao() {
		return funcao;
	}

	/**
	 * @param funcao the funcao to set
	 */
	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	/**
	 * @return the voluntario
	 */
	public Voluntario getVoluntario() {
		return voluntario;
	}

	/**
	 * @param voluntario the voluntario to set
	 */
	public void setVoluntario(Voluntario voluntario) {
		this.voluntario = voluntario;
	}


}
