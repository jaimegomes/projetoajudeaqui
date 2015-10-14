package br.senai.sc.es4dof.model;

import br.senai.sc.ajudeaqui.abstracts.Entidade;

/**
 * Classe que representa a entidade Usuario.
 * 
 * @author Jaime Gomes
 *
 */
public class Usuario extends Entidade {

	private int id;
	private String login;
	private String senha;
	private String perfil;
	private String lembreteSenha;

	/**
	 * Construtor padr�o
	 */
	public Usuario() {
	}

	/**
	 * Construtor com todos os atributos menos o id.
	 * 
	 * @param login
	 * @param senha
	 * @param confirmacaoSenha
	 * @param perfil
	 * @param instituicao
	 * @param lembreteSenha
	 */
	public Usuario(String login, String senha, String perfil,
			String lembreteSenha) {
		super();
		this.login = login;
		this.senha = senha;
		this.perfil = perfil;
		this.lembreteSenha = lembreteSenha;
	}

	/**
	 * Construtor com todos os atributos.
	 * 
	 * @param id
	 * @param login
	 * @param senha
	 * @param confirmacaoSenha
	 * @param perfil
	 * @param instituicao
	 * @param lembreteSenha
	 */
	public Usuario(int id, String login, String senha, String perfil,
			String lembreteSenha) {
		super();
		this.id = id;
		this.login = login;
		this.senha = senha;
		this.perfil = perfil;
		this.lembreteSenha = lembreteSenha;
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
	 * M�todo que retorna o login do usu�rio.
	 * 
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * M�todo que seta o login do usu�rio.
	 * 
	 * @param login
	 *            the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * M�todo que retorna a senha do usu�rio.
	 * 
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * M�todo que seta a senha do usu�rio.
	 * 
	 * @param senha
	 *            the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * M�todo que retorna o perfil de usu�rio.
	 * 
	 * @return the perfil
	 */
	public String getPerfil() {
		return perfil;
	}

	/**
	 * M�todo que seta o perfil de usu�rio
	 * 
	 * @param perfil
	 *            the perfil to set
	 */
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	/**
	 * M�todo que retorna o lembrete de senha de senha do usu�rio.
	 * 
	 * @return the lembreteSenha
	 */
	public String getLembreteSenha() {
		return lembreteSenha;
	}

	/**
	 * M�todo que seta o lembrete de senha do usu�rio.
	 * 
	 * @param lembreteSenha
	 *            the lembreteSenha to set
	 */
	public void setLembreteSenha(String lembreteSenha) {
		this.lembreteSenha = lembreteSenha;
	}

}
