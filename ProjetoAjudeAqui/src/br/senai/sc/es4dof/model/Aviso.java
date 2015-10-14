package br.senai.sc.es4dof.model;

import java.util.Date;

import br.senai.sc.ajudeaqui.abstracts.Entidade;

/**
 * Classe que representa a entidade Aviso.
 * 
 * @author Jaime Gomes
 *
 */
public class Aviso extends Entidade {

	private int id;
	private String titulo;
	private String descricao;
	private Date dataPublicacao;
	private Funcao tipoServico;
	private char situacao;

	/**
	 * Construtor padrao.
	 */
	public Aviso() {
	}

	/**
	 * Construtor com todos os atributos menos o id.
	 * 
	 * @param titulo
	 * @param descricao
	 * @param dataPublicacao
	 * @param tipoServico
	 * @param situacao
	 */
	public Aviso(String titulo, String descricao, Date dataPublicacao,
			Funcao tipoServico, char situacao) {
		super();
		this.titulo = titulo;
		this.descricao = descricao;
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
	 * @param dataPublicacao
	 * @param tipoServico
	 * @param situacao
	 */
	public Aviso(int id, String titulo, String descricao, Date dataPublicacao,
			Funcao tipoServico, char situacao) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descricao = descricao;
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
	public char getSituacao() {
		return situacao;
	}

	/**
	 * @param situacao
	 *            the situacao to set
	 */
	public void setSituacao(char situacao) {
		this.situacao = situacao;
	}

}
