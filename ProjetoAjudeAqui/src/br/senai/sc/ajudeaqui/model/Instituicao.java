package br.senai.sc.ajudeaqui.model;

import br.senai.sc.ajudeaqui.abstracts.Entidade;

/**
 * Classe que representa a entidade Institui��o.
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
	 * Construtor padr�o.
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
	 * M�todo que retorna a raz�o social da institui��o.
	 * 
	 * @return the razaoSocial
	 */
	public String getRazaoSocial() {
		return razaoSocial;
	}

	/**
	 * M�todo que seta a raz�o social da institui��o.
	 * 
	 * @param razaoSocial
	 *            the razaoSocial to set
	 */
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	/**
	 * M�todo que retorna o CNPJ da institui��o.
	 * 
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * M�todo que seta o CNPJ da institui��o.
	 * 
	 * @param cnpj
	 *            the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	/**
	 * M�todo que retorna o nome da institui��o.
	 * 
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * M�todo que seta o nome da institui��o.
	 * 
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * M�todo que retorna o email da institui��o.
	 * 
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * M�todo que seta o email da institui��o.
	 * 
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * M�todo que retorna o telefone da institui��o.
	 * 
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * M�todo que seta o telefone da institui��o.
	 * 
	 * @param telefone
	 *            the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * M�todo que retorna o endereco da institui��o.
	 * 
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * M�todo que seta o endereco da institui��o.
	 * 
	 * @param endereco
	 *            the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * M�todo que retorna o site da institui��o.
	 * 
	 * @return the site
	 */
	public String getSite() {
		return site;
	}

	/**
	 * M�todo que seta o site da institui��o.
	 * 
	 * @param site
	 *            the site to set
	 */
	public void setSite(String site) {
		this.site = site;
	}

	/**
	 * M�todo que retorna o respons�vel da institui��o.
	 * 
	 * @return the responsavel
	 */
	public String getResponsavel() {
		return responsavel;
	}

	/**
	 * M�todo que seta o respons�vel da institui��o.
	 * 
	 * @param responsavel
	 *            the responsavel to set
	 */
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	/**
	 * M�todo que retorna as observa��es da institui��o.
	 * 
	 * @return the observacoes
	 */
	public String getObservacoes() {
		return observacoes;
	}

	/**
	 * M�todo que seta as observa��es da institui��o.
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
