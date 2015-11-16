package br.senai.sc.ajudeaqui.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe que cont�m m�todos de formata��o de Strings.
 * 
 * @author Jaime Gomes
 *
 */
public class StringUtils {

	private static StringUtils stringUtils = null;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	/**
	 * Construtor padr�o
	 */
	public StringUtils() {
	}

	public final static StringUtils getInstance() {
		if (stringUtils == null) {
			stringUtils = new StringUtils();
		}
		return stringUtils;
	}

	/**
	 * M�todo que converte uma String data em Date data
	 * 
	 * @param String
	 *            data
	 * @return Date data (dd/MM/yyyy)
	 * @throws ParseException
	 */
	public Date parseStringToDate(String data) throws ParseException {
		return sdf.parse(data);
	}
	
	public String parseDateToString(Date data) throws ParseException {
		return sdf.format(data);
	}
	
}
