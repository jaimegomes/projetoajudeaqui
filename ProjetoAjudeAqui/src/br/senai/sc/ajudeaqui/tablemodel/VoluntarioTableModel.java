package br.senai.sc.ajudeaqui.tablemodel;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.senai.sc.ajudeaqui.abstracts.Entidade;
import br.senai.sc.es4dof.model.Voluntario;
import br.senai.sc.es4dof.utils.StringUtils;

public class VoluntarioTableModel extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	private static final int COL_NOME = 0;
	private static final int COL_TELEFONE = 1;
	private static final int COL_CPF = 2;
	private static final int COL_ENDERECO = 3;
	private static final int COL_EMAIL = 4;
	private static final int COL_DATA_NASCIMENTO = 5;
	private static final int COL_USUARIO = 6;
	private static final int COL_SEXO = 7;
	private static final int COL_ESTADO_CIVIL = 8;
	private static final int COL_COMPLEMENTO = 9;
	private static final int COL_CELULAR = 10;
	private static final int COL_INFORMACOES_COMPLEMENTARES = 11;

	private List<Entidade> valores;

	public VoluntarioTableModel(List<Entidade> list) {
		this.valores = new ArrayList<Entidade>(list);
	}

	/**
	 * Retorna a quantidade de linhas da lista.
	 * 
	 * @return valores.size();
	 */
	public int getRowCount() {
		return valores.size();
	}

	/**
	 * Retorna a quantidade de colunas, deve ser setado manualmente.
	 * 
	 * @return 7
	 */
	public int getColumnCount() {
		return 12;
	}

	/**
	 * Retorna o nome da coluna passada como par�metro.
	 * 
	 * @param int colunm
	 */
	public String getColumnName(int column) {
		if (column == COL_NOME)
			return "Nome";

		if (column == COL_TELEFONE)
			return "Telefone";

		if (column == COL_CPF)
			return "CPF";

		if (column == COL_ENDERECO)
			return "Endere�o";

		if (column == COL_EMAIL)
			return "Email";

		if (column == COL_DATA_NASCIMENTO)
			return "Data Nascimento";

		// n�o ser� exibida na tabela
		// if (column == COL_USUARIO)
		// return "Usu�rio";

		if (column == COL_SEXO)
			return "Sexo";

		if (column == COL_ESTADO_CIVIL)
			return "Estado Civil";

		if (column == COL_COMPLEMENTO)
			return "Complemento";

		if (column == COL_CELULAR)
			return "Celular";

		if (column == COL_INFORMACOES_COMPLEMENTARES)
			return "Informa��es Complementares";

		return "";
	}

	/**
	 * Retorna o objeto que est� na linha e coluna indicada como par�metros.
	 * 
	 * @param int row
	 * @param int column
	 */
	public Object getValueAt(int row, int column) {
		Voluntario voluntario = (Voluntario) valores.get(row);

		if (column == COL_NOME)
			return voluntario.getNome();

		if (column == COL_TELEFONE)
			return voluntario.getTelefone();

		if (column == COL_CPF)
			return voluntario.getCpf();

		if (column == COL_ENDERECO)
			return voluntario.getEndereco();

		if (column == COL_EMAIL)
			return voluntario.getEmail();

		if (column == COL_DATA_NASCIMENTO) {
			try {
				return StringUtils.getInstance().parseDateToString(
						voluntario.getDataNascimento());
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}

		// n�o ser� exibida na tabela
		// if (column == COL_USUARIO)
		// return "Usu�rio";

		if (column == COL_SEXO)
			return voluntario.getSexo();

		if (column == COL_ESTADO_CIVIL)
			return voluntario.getEstadoCivil();

		if (column == COL_COMPLEMENTO)
			return voluntario.getComplemento();

		if (column == COL_CELULAR)
			return voluntario.getCelular();

		if (column == COL_INFORMACOES_COMPLEMENTARES)
			return voluntario.getInformacoesComplementares();

		return "";
	}

	/**
	 * Atribui valor ao objeto que est� na linha e coluna que s�o passados como
	 * par�metros.
	 * 
	 * @param Object
	 *            aValue
	 * @param int rowIndex
	 * @param int columnIndex
	 */
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		Voluntario voluntario = (Voluntario) valores.get(rowIndex);

		if (columnIndex == COL_NOME)
			voluntario.setNome(aValue.toString());

		if (columnIndex == COL_TELEFONE)
			voluntario.setTelefone(aValue.toString());

		if (columnIndex == COL_CPF)
			voluntario.setCpf(aValue.toString());

		if (columnIndex == COL_ENDERECO)
			voluntario.setEndereco(aValue.toString());

		if (columnIndex == COL_EMAIL)
			voluntario.setEmail(aValue.toString());

		if (columnIndex == COL_DATA_NASCIMENTO) {
			try {
				voluntario.setDataNascimento(StringUtils.getInstance()
						.parseStringToDate(aValue.toString()));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}

		// n�o ser� exibida na tabela
		// if (columnIndex == COL_USUARIO)
		// voluntario.getUsuario.setNome(aValue.toString());

		if (columnIndex == COL_SEXO)
			voluntario.setSexo(aValue.toString());

		if (columnIndex == COL_ESTADO_CIVIL)
			voluntario.setEstadoCivil(aValue.toString());

		if (columnIndex == COL_COMPLEMENTO)
			voluntario.setComplemento(aValue.toString());

		if (columnIndex == COL_CELULAR)
			voluntario.setCelular(aValue.toString());

		if (columnIndex == COL_INFORMACOES_COMPLEMENTARES)
			voluntario.setInformacoesComplementares(aValue.toString());

	}

	/**
	 * Retorna a classe da coluna passada como par�metro, caso tenha mais de um
	 * tipo de par�metro fazer um if como em setValueAt para verificar qual a
	 * columnIndex se trata e retornar o tipo da classe.
	 * 
	 * @param int columnIndex
	 * @return Class<?>
	 */
	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	/**
	 * Verifica se a c�lula passada como par�metro � edit�vel.
	 * 
	 * @param int rowIndex
	 * @param int columnIndex
	 * @return boolean true
	 */
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	/**
	 * Retorna o objeto que est� na linha passada como par�metro.
	 * 
	 * @param int row
	 * @return Anuncio valores.get(row)
	 */
	public Voluntario get(int row) {
		return (Voluntario) valores.get(row);
	}

}
