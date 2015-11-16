package br.senai.sc.ajudeaqui.model;

import br.senai.sc.ajudeaqui.abstracts.Entidade;

/**
 * Classe que representa a entidade Horario.
 * 
 * @author Jaime Gomes
 *
 */
public class Horario extends Entidade {

	private int id;
	private String horario;

	/**
	 * Construtor padrao.
	 */
	public Horario() {
		super();
	}

	/**
	 * Construtor que recebe o horario como parametro.
	 * 
	 * @param horario
	 */
	public Horario(String horario) {
		super();
		this.horario = horario;
	}

	/**
	 * Construtor com todos os atributos.
	 * 
	 * @param id
	 * @param horario
	 */
	public Horario(int id, String horario) {
		super();
		this.id = id;
		this.horario = horario;
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
	 * @return the horario
	 */
	public String getHorario() {
		return horario;
	}

	/**
	 * @param horario
	 *            the horario to set
	 */
	public void setHorario(String horario) {
		this.horario = horario;
	}

}
