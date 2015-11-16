package br.senai.sc.ajudeaqui.model;

import br.senai.sc.ajudeaqui.abstracts.Entidade;

/**
 * Classe que representa a entidade VoluntarioAnuncio
 * 
 * @author Jaime Gomes
 *
 */
public class VoluntarioAnuncio extends Entidade {

	private int id;
	private int idVoluntario;
	private int idAnuncio;

	/**
	 * Construtor padrao.
	 */
	public VoluntarioAnuncio() {
		super();
	}

	/**
	 * Construtor com todos os atributos menos o id.
	 * 
	 * @param idVoluntario
	 * @param idAnuncio
	 */
	public VoluntarioAnuncio(int idVoluntario, int idAnuncio) {
		super();
		this.idVoluntario = idVoluntario;
		this.idAnuncio = idAnuncio;
	}

	/**
	 * Construtor com todos os atributos.
	 * 
	 * @param id
	 * @param idVoluntario
	 * @param idAnuncio
	 */
	public VoluntarioAnuncio(int id, int idVoluntario, int idAnuncio) {
		super();
		this.id = id;
		this.idVoluntario = idVoluntario;
		this.idAnuncio = idAnuncio;
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

	/**
	 * @return the idAnuncio
	 */
	public int getIdAnuncio() {
		return idAnuncio;
	}

	/**
	 * @param idAnuncio
	 *            the idAnuncio to set
	 */
	public void setIdAnuncio(int idAnuncio) {
		this.idAnuncio = idAnuncio;
	}

}
