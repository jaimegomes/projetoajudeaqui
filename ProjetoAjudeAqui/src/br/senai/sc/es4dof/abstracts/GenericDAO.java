package br.senai.sc.es4dof.abstracts;

import java.util.List;

/**
 * Classe abstrata DAO que cont�m os m�todos necess�rios para a manipula��o das
 * Entidades no banco de dados.
 * 
 * @author Jaime Gomes
 * 
 */
public abstract class GenericDAO {

	/**
	 * M�todo respons�vel por persistir a entidade no banco
	 * 
	 * @param Entidade
	 *            entidade
	 * 
	 * @throws Exception
	 */
	public abstract void salvar(Entidade entidade) throws Exception;

	/**
	 * M�todo respons�vel por excluir a entidade no banco
	 * 
	 * @param Entidade
	 *            entidade
	 * 
	 * @throws Exception
	 */
	public abstract void excluir(Entidade entidade) throws Exception;

	/**
	 * M�todo respons�vel por editar a entidade no banco
	 * 
	 * @param Entidade
	 *            entidade
	 * 
	 * @throws Exception
	 */
	public abstract void editar(Entidade entidade) throws Exception;

	/**
	 * M�todo que retorna uma lista de entidade
	 * 
	 * @param Entidade
	 *            entidade
	 * 
	 * @throws Exception
	 * 
	 * @return List<Entidade>
	 */
	public abstract List<Entidade> listar() throws Exception;

	/**
	 * M�todo que retorna a entidade referente ao id passado como par�metro
	 * 
	 * @param int id
	 * 
	 * @return Entidade
	 * 
	 * @throws Exception
	 */
	public abstract Entidade getPorId(int id) throws Exception;

}
