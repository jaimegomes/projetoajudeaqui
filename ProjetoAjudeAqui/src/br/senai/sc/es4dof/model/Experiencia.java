package br.senai.sc.es4dof.model;

import br.senai.sc.ajudeaqui.abstracts.Entidade;

/**
 * Classe que representa a entidade Experiencia
 * 
 * @author Jaime Gomes
 *
 */
public class Experiencia extends Entidade {

	private int id;
	private String instituicao;
	private String funcao;
	private String tempo;
	private Voluntario voluntario;

	/**
	 * Construtor padrao
	 * 
	 */
	public Experiencia() {
		super();
	}

	/**
	 * Construtor com todos os atributos menos o id.
	 * 
	 * @param instituicao
	 * @param funcao
	 * @param tempo
	 * @param voluntario
	 */
	public Experiencia(String instituicao, String funcao, String tempo,
			Voluntario voluntario) {
		super();
		this.instituicao = instituicao;
		this.funcao = funcao;
		this.tempo = tempo;
		this.voluntario = voluntario;
	}

	/**
	 * Construtor com todos os atributos.
	 * 
	 * @param id
	 * @param instituicao
	 * @param funcao
	 * @param tempo
	 * @param voluntario
	 */
	public Experiencia(int id, String instituicao, String funcao, String tempo,
			Voluntario voluntario) {
		super();
		this.id = id;
		this.instituicao = instituicao;
		this.funcao = funcao;
		this.tempo = tempo;
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
	 * @return the instituicao
	 */
	public String getInstituicao() {
		return instituicao;
	}

	/**
	 * @param instituicao
	 *            the instituicao to set
	 */
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
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

	/**
	 * @return the tempo
	 */
	public String getTempo() {
		return tempo;
	}

	/**
	 * @param tempo
	 *            the tempo to set
	 */
	public void setTempo(String tempo) {
		this.tempo = tempo;
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
