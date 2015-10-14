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
	 * Construtor padrão
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
	 * Método que retorna o login do usuário.
	 * 
	 * @return the login
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * Método que seta o login do usuário.
	 * 
	 * @param login
	 *            the login to set
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * Método que retorna a senha do usuário.
	 * 
	 * @return the senha
	 */
	public String getSenha() {
		return senha;
	}

	/**
	 * Método que seta a senha do usuário.
	 * 
	 * @param senha
	 *            the senha to set
	 */
	public void setSenha(String senha) {
		this.senha = senha;
	}

	/**
	 * Método que retorna o perfil de usuário.
	 * 
	 * @return the perfil
	 */
	public String getPerfil() {
		return perfil;
	}

	/**
	 * Método que seta o perfil de usuário
	 * 
	 * @param perfil
	 *            the perfil to set
	 */
	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	/**
	 * Método que retorna o lembrete de senha de senha do usuário.
	 * 
	 * @return the lembreteSenha
	 */
	public String getLembreteSenha() {
		return lembreteSenha;
	}

	/**
	 * Método que seta o lembrete de senha do usuário.
	 * 
	 * @param lembreteSenha
	 *            the lembreteSenha to set
	 */
	public void setLembreteSenha(String lembreteSenha) {
		this.lembreteSenha = lembreteSenha;
	}

}
