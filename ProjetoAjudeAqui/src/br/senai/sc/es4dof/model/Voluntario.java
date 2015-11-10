package br.senai.sc.es4dof.model;

import java.util.Date;

import br.senai.sc.ajudeaqui.abstracts.Entidade;

/**
 * Classe que representa a entidade Voluntario.
 * 
 * @author Jaime Gomes
 *
 */
public class Voluntario extends Entidade {

	private int id;
	private String nome;
	private String telefone;
	private String cpf;
	private String endereco;
	private String email;
	private Date dataNascimento;
	private Usuario usuario;
	private String sexo;
	private String estadoCivil;
	private String complemento;
	private String celular;
	private String informacoesComplementares;

	/**
	 * Construtor padrão.
	 */
	public Voluntario() {
	}

	/**
	 * Construtor com todos os atributos menos o id.
	 * 
	 * @param nome
	 * @param telefone
	 * @param cpf
	 * @param endereco
	 * @param email
	 * @param dataNascimento
	 * @param usuario
	 * @param sexo
	 * @param estadoCivil
	 * @param complemento
	 * @param celular
	 * @param atuouVolunt
	 * @param horarioDisponivel
	 * @param informacoesComplementares
	 */
	public Voluntario(String nome, String telefone, String cpf, String endereco, String email, Date dataNascimento,
			Usuario usuario, String sexo, String estadoCivil, String complemento, String celular, 
			 String informacoesComplementares) {
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.endereco = endereco;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.usuario = usuario;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.complemento = complemento;
		this.celular = celular;
		this.informacoesComplementares = informacoesComplementares;
	}

	/**
	 * Construtor com todos os atributos.
	 * 
	 * @param id
	 * @param nome
	 * @param telefone
	 * @param cpf
	 * @param endereco
	 * @param email
	 * @param dataNascimento
	 * @param usuario
	 * @param sexo
	 * @param estadoCivil
	 * @param complemento
	 * @param celular
	 * @param informacoesComplementares
	 */
	public Voluntario(int id, String nome, String telefone, String cpf, String endereco, String email,
			Date dataNascimento, Usuario usuario, String sexo, String estadoCivil, String complemento, String celular,
			 String informacoesComplementares) {
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.endereco = endereco;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.usuario = usuario;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.complemento = complemento;
		this.celular = celular;
		this.informacoesComplementares = informacoesComplementares;
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
	 * Método que retorna o nome da Pessoa
	 * 
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Método que seta o nome da Pessoa
	 * 
	 * @param nome
	 *            the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Método que retorna o telefone da Pessoa
	 * 
	 * @return the telefone
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * 
	 * Método que seta o telefone da Pessoa
	 * 
	 * @param telefone
	 *            the telefone to set
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * Método que retorna o cpf da Pessoa
	 * 
	 * @return the cpf
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * Método que seta o cpf da Pessoa
	 * 
	 * @param cpf
	 *            the cpf to set
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * Método que retorna o endereço da Pessoa
	 * 
	 * @return the endereco
	 */
	public String getEndereco() {
		return endereco;
	}

	/**
	 * Método que seta o endereço da Pessoa
	 * 
	 * @param endereco
	 *            the endereco to set
	 */
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	/**
	 * Método que retorna o email da Pessoa
	 * 
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Método que seta o email da Pessoa
	 * 
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Método que retorna a data de nascimento da Pessoa
	 * 
	 * @return the dataNascimento
	 */
	public Date getDataNascimento() {
		return dataNascimento;
	}

	/**
	 * Método que seta a data de nascimento da Pessoa
	 * 
	 * @param dataNascimento
	 *            the dataNascimento to set
	 */
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	/**
	 * Método que retorna o usuário da Pessoa
	 * 
	 * @return the idUsuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * Método que seta o usuário da Pessoa
	 * 
	 * @param idUsuario
	 *            the idUsuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the sexo
	 */
	public String getSexo() {
		return sexo;
	}

	/**
	 * @param sexo
	 *            the sexo to set
	 */
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	/**
	 * @return the estadoCivil
	 */
	public String getEstadoCivil() {
		return estadoCivil;
	}

	/**
	 * @param estadoCivil
	 *            the estadoCivil to set
	 */
	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	/**
	 * @return the complemento
	 */
	public String getComplemento() {
		return complemento;
	}

	/**
	 * @param complemento
	 *            the complemento to set
	 */
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	/**
	 * @return the celular
	 */
	public String getCelular() {
		return celular;
	}

	/**
	 * @param celular
	 *            the celular to set
	 */
	public void setCelular(String celular) {
		this.celular = celular;
	}

	/**
	 * @return the informacoesComplementares
	 */
	public String getInformacoesComplementares() {
		return informacoesComplementares;
	}

	/**
	 * @param informacoesComplementares
	 *            the informacoesComplementares to set
	 */
	public void setInformacoesComplementares(String informacoesComplementares) {
		this.informacoesComplementares = informacoesComplementares;
	}
	
	

}
