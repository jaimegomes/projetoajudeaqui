package br.senai.sc.es4dof.model;

import java.util.Date;

import br.senai.sc.es4dof.abstracts.Entidade;

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
	private Funcao tipoServico;
	private String situacao;

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
	 * @param tipoServico
	 * @param situacao
	 */
	public Anuncio(String titulo, String descricao, int qtdVagas,
			Date dataPublicacao, Funcao tipoServico, String situacao) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
		this.qtdVagas = qtdVagas;
		this.dataPublicacao = dataPublicacao;
		this.tipoServico = tipoServico;
		this.situacao = situacao;
	}

	/**
	 * Construtor com todos os atributos.
	 * 
	 * @param id
	 * @param titulo
	 * @param descricao
	 * @param qtdVagas
	 * @param dataPublicacao
	 * @param tipoServico
	 * @param situacao
	 */
	public Anuncio(int id, String titulo, String descricao, int qtdVagas,
			Date dataPublicacao, Funcao tipoServico, String situacao) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
		this.qtdVagas = qtdVagas;
		this.dataPublicacao = dataPublicacao;
		this.tipoServico = tipoServico;
		this.situacao = situacao;
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
	 * @return the tipoServico
	 */
	public Funcao getTipoServico() {
		return tipoServico;
	}

	/**
	 * @param tipoServico
	 *            the tipoServico to set
	 */
	public void setTipoServico(Funcao tipoServico) {
		this.tipoServico = tipoServico;
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

}
