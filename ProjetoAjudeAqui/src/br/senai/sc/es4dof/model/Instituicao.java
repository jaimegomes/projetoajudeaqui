package br.senai.sc.es4dof.model;

import br.senai.sc.es4dof.abstracts.Entidade;

/**
 * Classe que representa a entidade Empresa no banco de dados.
 * 
 * @author Jaime Gomes
 *
 */
public class Instituicao extends Entidade {

	private int id;
	private String razaoSocial;
	private String cnpj;

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
	 */
	public Instituicao(String razaoSocial, String cnpj) {
		super();
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
	}

	/**
	 * Construtor com todos os atributos.
	 * 
	 * @param id
	 * @param razaoSocial
	 * @param cnpj
	 */
	public Instituicao(int id, String razaoSocial, String cnpj) {
		super();
		this.id = id;
		this.razaoSocial = razaoSocial;
		this.cnpj = cnpj;
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
	 * M�todo que retorna a raz�o social da empresa.
	 * 
	 * @return the razaoSocial
	 */
	public String getRazaoSocial() {
		return razaoSocial;
	}

	/**
	 * M�todo que seta a raz�o social da empresa.
	 * 
	 * @param razaoSocial
	 *            the razaoSocial to set
	 */
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	/**
	 * M�todo que retorna o CNPJ da empresa.
	 * 
	 * @return the cnpj
	 */
	public String getCnpj() {
		return cnpj;
	}

	/**
	 * M�todo que seta o CNPJ da empresa.
	 * 
	 * @param cnpj
	 *            the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
