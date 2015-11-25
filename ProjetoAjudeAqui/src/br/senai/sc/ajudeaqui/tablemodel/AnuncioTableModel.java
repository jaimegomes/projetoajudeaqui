package br.senai.sc.ajudeaqui.tablemodel;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

import br.senai.sc.ajudeaqui.abstracts.Entidade;
import br.senai.sc.ajudeaqui.model.Anuncio;
import br.senai.sc.ajudeaqui.utils.StringUtils;

public class AnuncioTableModel extends AbstractTableModel {

	private static final long serialVersionUID = 1L;
	private static final int COL_TITULO = 0;
	private static final int COL_DESCRICAO = 1;
	private static final int COL_QTD_VAGAS = 2;
	private static final int COL_DATA_PUBLICACAO = 3;
	private static final int COL_FUNCAO = 4;
	private static final int COL_STATUS = 5;
	private static final int COL_INSTITUICAO = 6;

	private List<Entidade> valores;

	public AnuncioTableModel(List<Entidade> list) {
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
		return 7;
	}

	/**
	 * Retorna o nome da coluna passada como parâmetro.
	 * 
	 * @param int
	 *            colunm
	 */
	public String getColumnName(int column) {
		if (column == COL_TITULO)
			return "Título";

		if (column == COL_DESCRICAO)
			return "Descrição";

		if (column == COL_QTD_VAGAS)
			return "Vagas";

		if (column == COL_DATA_PUBLICACAO)
			return "Data Públicação";

		if (column == COL_FUNCAO)
			return "Função";

		if (column == COL_STATUS)
			return "Status";

		if (column == COL_INSTITUICAO)
			return "Instituição";

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
		Anuncio anuncio = (Anuncio) valores.get(row);

		if (column == COL_TITULO)
			return anuncio.getTitulo();

		if (column == COL_DESCRICAO)
			return anuncio.getDescricao();

		if (column == COL_QTD_VAGAS)
			return anuncio.getQtdVagas();

		if (column == COL_DATA_PUBLICACAO) {
			try {
				return StringUtils.getInstance().parseDateToString(anuncio.getDataPublicacao());
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}

		if (column == COL_FUNCAO)
			return anuncio.getFuncao().getFuncao();

		if (column == COL_STATUS)
			return anuncio.getStatus();

		if (column == COL_INSTITUICAO)
			return anuncio.getInstituicao().getNome();

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
		Anuncio anuncio = (Anuncio) valores.get(rowIndex);

		if (columnIndex == COL_TITULO)
			anuncio.setTitulo(aValue.toString());

		if (columnIndex == COL_DESCRICAO)
			anuncio.setDescricao(aValue.toString());

		if (columnIndex == COL_QTD_VAGAS)
			anuncio.setQtdVagas(Integer.parseInt(aValue.toString()));

		if (columnIndex == COL_DATA_PUBLICACAO) {
			try {
				anuncio.setDataPublicacao(StringUtils.getInstance().parseStringToDate(aValue.toString()));
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}

		if (columnIndex == COL_FUNCAO)
			anuncio.getFuncao().setFuncao(aValue.toString());

		if (columnIndex == COL_STATUS)
			anuncio.setStatus(aValue.toString());

		if (columnIndex == COL_INSTITUICAO)
			anuncio.getInstituicao().setNome(aValue.toString());

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
	public Anuncio get(int row) {
		return (Anuncio) valores.get(row);
	}

}
