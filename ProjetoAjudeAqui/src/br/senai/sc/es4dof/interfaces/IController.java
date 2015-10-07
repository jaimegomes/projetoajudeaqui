package br.senai.sc.es4dof.interfaces;

import java.util.List;

import br.senai.sc.es4dof.abstracts.Entidade;

/**
 * Interface Controller, a classe que estender esta interface deve sobrescrever
 * todos os m�todos que forem usados.
 * 
 * @author Jaime Gomes
 * 
 */
public interface IController {

	/**
	 * M�todo respons�vel por persistir a entidade no banco
	 * 
	 * @param Entidade
	 *            entidade
	 */
	public void salvar(Entidade entidade) throws Exception;

	/**
	 * M�todo respons�vel por excluir a entidade no banco
	 * 
	 * @param Entidade
	 *            entidade
	 */
	public void excluir(Entidade entidade) throws Exception;

	/**
	 * M�todo respons�vel por editar a entidade no banco
	 * 
	 * @param Entidade
	 *            entidade
	 */
	public void editar(Entidade entidade) throws Exception;

	/**
	 * M�todo que retorna uma lista de entidade
	 * 
	 * @param Entidade
	 *            entidade
	 * 
	 * @return List<Entidade>
	 */
	public List<Entidade> listar() throws Exception;

	/**
	 * M�todo que retorna a entidade referente ao id passado como par�metro
	 * 
	 * @param Entidade
	 *            entidade
	 */
	public Entidade getPorId(int id) throws Exception;

}