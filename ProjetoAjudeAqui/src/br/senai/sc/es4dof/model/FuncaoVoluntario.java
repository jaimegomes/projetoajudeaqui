package br.senai.sc.es4dof.model;

import br.senai.sc.ajudeaqui.abstracts.Entidade;

public class FuncaoVoluntario extends Entidade {

	private int id;
	private int idFuncao;
	private int idVoluntario;

	public FuncaoVoluntario() {
		super();
	}

	public FuncaoVoluntario(int idFuncao, int idVoluntario) {
		super();
		this.idFuncao = idFuncao;
		this.idVoluntario = idVoluntario;
	}

	public FuncaoVoluntario(int id, int idFuncao, int idVoluntario) {
		super();
		this.id = id;
		this.idFuncao = idFuncao;
		this.idVoluntario = idVoluntario;
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
	 * @return the idFuncao
	 */
	public int getIdFuncao() {
		return idFuncao;
	}

	/**
	 * @param idFuncao
	 *            the idFuncao to set
	 */
	public void setIdFuncao(int idFuncao) {
		this.idFuncao = idFuncao;
	}

	/**
	 * @return the idVoluntario
	 */
	public int getIdVoluntario() {
		return idVoluntario;
	}

	/**
	 * @param idVoluntario
	 *            the idVoluntario to set
	 */
	public void setIdVoluntario(int idVoluntario) {
		this.idVoluntario = idVoluntario;
	}

}
