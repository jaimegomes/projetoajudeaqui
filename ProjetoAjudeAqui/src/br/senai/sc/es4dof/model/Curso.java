package br.senai.sc.es4dof.model;

import java.util.Date;

import br.senai.sc.es4dof.abstracts.Entidade;

/**
 * Classe que representa a entidade Curso
 * 
 * @author Jaime Gomes
 *
 */
public class Curso extends Entidade {

	private int id;
	private String nivel;
	private String curso;
	private String instituicao;
	private String situacao;
	private Date inicio;
	private Date fim;
	private Voluntario voluntario;

	/**
	 * Construtor padrao.
	 */
	public Curso() {
		super();
	}

	/**
	 * Construtor com todos os atributos menos o id.
	 * 
	 * @param nivel
	 * @param curso
	 * @param instituicao
	 * @param situacao
	 * @param inicio
	 * @param fim
	 * @param voluntario
	 */
	public Curso(String nivel, String curso, String instituicao,
			String situacao, Date inicio, Date fim, Voluntario voluntario) {
		super();
		this.nivel = nivel;
		this.curso = curso;
		this.instituicao = instituicao;
		this.situacao = situacao;
		this.inicio = inicio;
		this.fim = fim;
		this.voluntario = voluntario;
	}

	/**
	 * Construtor com todos os atributos.
	 * 
	 * @param id
	 * @param nivel
	 * @param curso
	 * @param instituicao
	 * @param situacao
	 * @param inicio
	 * @param fim
	 * @param voluntario
	 */
	public Curso(int id, String nivel, String curso, String instituicao,
			String situacao, Date inicio, Date fim, Voluntario voluntario) {
		super();
		this.id = id;
		this.nivel = nivel;
		this.curso = curso;
		this.instituicao = instituicao;
		this.situacao = situacao;
		this.inicio = inicio;
		this.fim = fim;
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
	 * @return the nivel
	 */
	public String getNivel() {
		return nivel;
	}

	/**
	 * @param nivel
	 *            the nivel to set
	 */
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	/**
	 * @return the curso
	 */
	public String getCurso() {
		return curso;
	}

	/**
	 * @param curso
	 *            the curso to set
	 */
	public void setCurso(String curso) {
		this.curso = curso;
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
	 * @return the situacao
	 */
	public String getSituacao() {
		return situacao;
	}

	/**
	 * @param situacao
	 *            the situacao to set
	 */
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	/**
	 * @return the inicio
	 */
	public Date getInicio() {
		return inicio;
	}

	/**
	 * @param inicio
	 *            the inicio to set
	 */
	public void setInicio(Date inicio) {
		this.inicio = inicio;
	}

	/**
	 * @return the fim
	 */
	public Date getFim() {
		return fim;
	}

	/**
	 * @param fim
	 *            the fim to set
	 */
	public void setFim(Date fim) {
		this.fim = fim;
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
