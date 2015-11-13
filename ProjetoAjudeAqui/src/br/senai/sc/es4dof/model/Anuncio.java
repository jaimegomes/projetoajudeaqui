package br.senai.sc.es4dof.model;

import java.util.Date;

import br.senai.sc.ajudeaqui.abstracts.Entidade;

/**
 * Classe que representa a entidade Anuncio.
 * 
 * @author Jaime Gomes
 *
 */
public class Anuncio extends Entidade {

	private int id;
	private String titulo;
	private String descricao;
	private int qtdVagas;
	private Date dataPublicacao;
	private Funcao funcao;
	private String status;
	private Instituicao instituicao;

	/**
	 * Construtor padrao
	 */
	public Anuncio() {

	}

	/**
	 * Construtor com todos os atributos menos o id.
	 * 
	 * @param titulo
	 * @param descricao
	 * @param qtdVagas
	 * @param dataPublicacao
	 * @param funcao
	 * @param status
	 * @param instituicao
	 */
	public Anuncio(String titulo, String descricao, int qtdVagas,
			Date dataPublicacao, Funcao funcao, String status,
			Instituicao instituicao) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.qtdVagas = qtdVagas;
		this.dataPublicacao = dataPublicacao;
		this.funcao = funcao;
		this.status = status;
		this.instituicao = instituicao;
	}

	/**
	 * Construtor com todos os atributos.
	 * 
	 * @param id
	 * @param titulo
	 * @param descricao
	 * @param qtdVagas
	 * @param dataPublicacao
	 * @param funcao
	 * @param status
	 * @param instituicao
	 */
	public Anuncio(int id, String titulo, String descricao, int qtdVagas,
			Date dataPublicacao, Funcao funcao, String status,
			Instituicao instituicao) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.qtdVagas = qtdVagas;
		this.dataPublicacao = dataPublicacao;
		this.funcao = funcao;
		this.status = status;
		this.instituicao = instituicao;
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
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo
	 *            the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao
	 *            the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the qtdVagas
	 */
	public int getQtdVagas() {
		return qtdVagas;
	}

	/**
	 * @param qtdVagas
	 *            the qtdVagas to set
	 */
	public void setQtdVagas(int qtdVagas) {
		this.qtdVagas = qtdVagas;
	}

	/**
	 * @return the dataPublicacao
	 */
	public Date getDataPublicacao() {
		return dataPublicacao;
	}

	/**
	 * @param dataPublicacao
	 *            the dataPublicacao to set
	 */
	public void setDataPublicacao(Date dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	/**
	 * @return the funcao
	 */
	public Funcao getFuncao() {
		return funcao;
	}

	/**
	 * @param funcao
	 *            the funcao to set
	 */
	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the instituicao
	 */
	public Instituicao getInstituicao() {
		return instituicao;
	}

	/**
	 * @param instituicao
	 *            the instituicao to set
	 */
	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

}
