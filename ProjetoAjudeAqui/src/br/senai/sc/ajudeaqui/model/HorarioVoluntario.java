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
	private Horario horario;
	private Voluntario voluntario;

	public HorarioVoluntario() {
		super();
	}

	public HorarioVoluntario(Horario horario, Voluntario voluntario) {
		super();
		this.horario = horario;
		this.voluntario = voluntario;
	}

	public HorarioVoluntario(int id, Horario horario, Voluntario voluntario) {
		super();
		this.id = id;
		this.horario = horario;
		this.voluntario = voluntario;
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
	public Horario getHorario() {
		return horario;
	}

	/**
	 * @param horario
	 *            the horario to set
	 */
	public void setHorario(Horario horario) {
		this.horario = horario;
	}

	/**
	 * @return the voluntario
	 */
	public Voluntario getVoluntario() {
		return voluntario;
	}

	/**
	 * @param voluntario
	 *            the voluntario to set
	 */
	public void setVoluntario(Voluntario voluntario) {
		this.voluntario = voluntario;
	}

}
