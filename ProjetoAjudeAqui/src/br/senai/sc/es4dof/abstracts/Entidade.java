package br.senai.sc.es4dof.abstracts;

/**
 * Classe abstrata Entidade, toda classe model deve estender est� classe.
 * 
 * @author Jaime Gomes
 * 
 */
public abstract class Entidade {

	/**
	 * M�todo que retorna o id da entidade.
	 * 
	 */
	public abstract int getId();

	/**
	 * M�todo respons�vel�vel por atribuir valor ao id da entidade.
	 * 
	 * @param int id
	 */
	public abstract void setId(int id);

}
