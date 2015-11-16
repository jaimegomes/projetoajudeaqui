package br.senai.sc.ajudeaqui.model;

import br.senai.sc.ajudeaqui.abstracts.Entidade;

/**
 * Classe que representa a entidade Instituição.
 * 
 * @author Jaime Gomes
 *
 */
public class Instituicao extends Entidade {

	private int id;
	private String razaoSocial;
	private String cnpj;
	private String nome;
	private String email;
	private String telefone;
	private String endereco;
	private String site;
	private String responsavel;
	private String observacoes;
	private Usuario usuario;

	/**
	 * Construtor padrão.
	 */
	public Instituicao() {
	}

	/**
	 * Construtor com todos os atributos menos o id.
	 * 
	 * @param razaoSocial
	 * @param cnpj
	 * @param nome
	 * @param email
	 * @param telefone
	 * @param endereco
	 * @param site
	 * @param responsavel
	 * @param observacoes
	 * @param idUsuario
	 */
	public Instituicao(String razaoSocial, String cnpj, String nome,
			String email, String telefone, String endereco, String site,
			String responsavel, String observacoes, Usuario usuario) {
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.site = site;
		this.responsavel = responsavel;
		this.observacoes = observacoes;
		this.usuario = usuario;
	}

	/**
	 * Construtor com todos os atributos.
	 * 
	 * @param id
	 * @param razaoSocial
	 * @param cnpj
	 * @param nome
	 * @param email
	 * @param telefone
	 * @param endereco
	 * @param site
	 * @param responsavel
	 * @param observacoes
	 * @param idUsuario
	 */
	public Instituicao(int id, String razaoSocial, String cnpj, String nome,
			String email, String telefone, String endereco, String site,
			String responsavel, String observacoes, Usuario usuario) {
		super();
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.site = site;
		this.responsavel = responsavel;
		this.observacoes = observacoes;
		this.usuario = usuario;
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
	 * 
	 * Método que retorna a razão social da instituição.
	 * 
	 * @return the razaoSocial
	 */
	public String getRazaoSocial() {
		return razaoSocial;
	}

	/**
	 * Método que seta a razão social da instituição.
	 * 
	 * @param razaoSocial
	 *            the razaoSocial to set
	 */
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	/**
	 * Método que retorna o CNPJ da instituição.
	 * 
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * Método que seta o CNPJ da instituição.
	 * 
	 * @param cnpj
	 *            the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * Método que retorna o nome da instituição.
	 * 
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Método que seta o nome da instituição.
	 * 
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Método que retorna o email da instituição.
	 * 
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Método que seta o email da instituição.
	 * 
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Método que retorna o telefone da instituição.
	 * 
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * Método que seta o telefone da instituição.
	 * 
	 * @param telefone
	 *            the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * Método que retorna o endereco da instituição.
	 * 
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * Método que seta o endereco da instituição.
	 * 
	 * @param endereco
	 *            the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * Método que retorna o site da instituição.
	 * 
	 * @return the site
	 */
	public String getSite() {
		return site;
	}

	/**
	 * Método que seta o site da instituição.
	 * 
	 * @param site
	 *            the site to set
	 */
	public void setSite(String site) {
		this.site = site;
	}

	/**
	 * Método que retorna o responsável da instituição.
	 * 
	 * @return the responsavel
	 */
	public String getResponsavel() {
		return responsavel;
	}

	/**
	 * Método que seta o responsável da instituição.
	 * 
	 * @param responsavel
	 *            the responsavel to set
	 */
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	/**
	 * Método que retorna as observações da instituição.
	 * 
	 * @return the observacoes
	 */
	public String getObservacoes() {
		return observacoes;
	}

	/**
	 * Método que seta as observações da instituição.
	 * 
	 * @param observacoes
	 *            the observacoes to set
	 */
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario
	 *            the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
