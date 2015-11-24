package br.senai.sc.ajudeaqui.tablemodel;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.senai.sc.ajudeaqui.abstracts.Entidade;
import br.senai.sc.ajudeaqui.model.Voluntario;
import br.senai.sc.ajudeaqui.utils.StringUtils;

public class VoluntarioTableModel extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	private static final int COL_NOME = 0;
	private static final int COL_TELEFONE = 1;
	private static final int COL_ENDERECO = 2;
	private static final int COL_EMAIL = 3;
	private static final int COL_DATA_NASCIMENTO = 4;
	private static final int COL_SEXO = 5;
	private static final int COL_ESTADO_CIVIL = 6;
	private static final int COL_CELULAR = 7;

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
	 * @return 8
	 */
	public int getColumnCount() {
		return 8;
	}

	/**
	 * Retorna o nome da coluna passada como parâmetro.
	 * 
	 * @param int
	 *            colunm
	 */
	public String getColumnName(int column) {
		if (column == COL_NOME)
			return "Nome";

		if (column == COL_TELEFONE)
			return "Telefone";

		if (column == COL_ENDERECO)
			return "Endereço";

		if (column == COL_EMAIL)
			return "Email";

		if (column == COL_DATA_NASCIMENTO)
			return "Data Nascimento";

		if (column == COL_SEXO)
			return "Sexo";

		if (column == COL_ESTADO_CIVIL)
			return "Estado Civil";

		if (column == COL_CELULAR)
			return "Celular";
		
		return "";
	}

	/**
	 * Retorna o objeto que está na linha e coluna indicada como parâmetros.
	 * 
	 * @param int
	 *            row
	 * @param int
	 *            column
	 */
	public Object getValueAt(int row, int column) {
		Voluntario voluntario = (Voluntario) valores.get(row);

		if (column == COL_NOME)
			return voluntario.getNome();

		if (column == COL_TELEFONE)
			return voluntario.getTelefone();

		if (column == COL_ENDERECO)
			return voluntario.getEndereco();

		if (column == COL_EMAIL)
			return voluntario.getEmail();

		if (column == COL_DATA_NASCIMENTO) {
			try {
				return StringUtils.getInstance().parseDateToString(voluntario.getDataNascimento());
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}

		if (column == COL_SEXO)
			return voluntario.getSexo();

		if (column == COL_ESTADO_CIVIL)
			return voluntario.getEstadoCivil();

		if (column == COL_CELULAR)
			return voluntario.getCelular();

		return "";
	}

	/**
	 * Atribui valor ao objeto que está na linha e coluna que sÃo passados como
	 * parâmetros.
	 * 
	 * @param Object
	 *            aValue
	 * @param int
	 *            rowIndex
	 * @param int
	 *            columnIndex
	 */
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		Voluntario voluntario = (Voluntario) valores.get(rowIndex);

		if (columnIndex == COL_NOME)
			voluntario.setNome(aValue.toString());

		if (columnIndex == COL_TELEFONE)
			voluntario.setTelefone(aValue.toString());

		if (columnIndex == COL_ENDERECO)
			voluntario.setEndereco(aValue.toString());

		if (columnIndex == COL_EMAIL)
			voluntario.setEmail(aValue.toString());

		if (columnIndex == COL_DATA_NASCIMENTO) {
			try {
				voluntario.setDataNascimento(StringUtils.getInstance().parseStringToDate(aValue.toString()));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}

		// não será exibida na tabela
		// if (columnIndex == COL_USUARIO)
		// voluntario.getUsuario.setNome(aValue.toString());

		if (columnIndex == COL_SEXO)
			voluntario.setSexo(aValue.toString());

		if (columnIndex == COL_ESTADO_CIVIL)
			voluntario.setEstadoCivil(aValue.toString());

		if (columnIndex == COL_CELULAR)
			voluntario.setCelular(aValue.toString());

	}

	/**
	 * Retorna a classe da coluna passada como parâmetro, caso tenha mais de um
	 * tipo de parâmetro fazer um if como em setValueAt para verificar qual a
	 * columnIndex se trata e retornar o tipo da classe.
	 * 
	 * @param int
	 *            columnIndex
	 * @return Class<?>
	 */
	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	/**
	 * Verifica se a célula passada como parâmetro é editável.
	 * 
	 * @param int
	 *            rowIndex
	 * @param int
	 *            columnIndex
	 * @return boolean true
	 */
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}

	/**
	 * Retorna o objeto que está na linha passada como parâmetro.
	 * 
	 * @param int
	 *            row
	 * @return Anuncio valores.get(row)
	 */
	public Voluntario get(int row) {
		return (Voluntario) valores.get(row);
	}

}
