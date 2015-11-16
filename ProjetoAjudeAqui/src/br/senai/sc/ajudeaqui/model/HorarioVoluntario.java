package br.senai.sc.ajudeaqui.model;

import br.senai.sc.ajudeaqui.abstracts.Entidade;

/**
 * Classe que representa a entidade HorarioVoluntario
 * 
 * @author Jaime Gomes
 *
 */
public class HorarioVoluntario extends Entidade {

	private int id;
	private int idHorario;
	private int idVoluntario;

	public HorarioVoluntario() {
		super();
	}

	public HorarioVoluntario(int idHorario, int idVoluntario) {
		super();
		this.idHorario = idHorario;
		this.idVoluntario = idVoluntario;
	}

	public HorarioVoluntario(int id, int idHorario, int idVoluntario) {
		super();
		this.id = id;
		this.idHorario = idHorario;
		this.idVoluntario = idVoluntario;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the idHorario
	 */
	public int getIdHorario() {
		return idHorario;
	}

	/**
	 * @param idHorario
	 *            the idHorario to set
	 */
	public void setIdHorario(int idHorario) {
		this.idHorario = idHorario;
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
