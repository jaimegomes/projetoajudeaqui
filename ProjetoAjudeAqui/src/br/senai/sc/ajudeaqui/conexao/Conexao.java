package br.senai.sc.ajudeaqui.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Classe que faz a conex�o com o banco de dados.
 * 
 * @author Jaime Gomes
 * 
 */
public class Conexao {

	static Connection con = null;

	/**
	 * M�todo que inicia uma conex�o com o banco de dados.
	 * 
	 * @return
	 */
	public static Connection getConnection() {

		try {

			// Conex�o MySQLWorkbench
			 Class.forName("com.mysql.jdbc.Driver");
			 String url = "jdbc:mysql://localhost:3306/ajudeaqui";
			 con = DriverManager.getConnection(url, "root","");
			 con.setAutoCommit(false);
			 
			// Conex�o Postgres
			// Class.forName("org.postgresql.Driver");
			// con = DriverManager.getConnection(
			// "jdbc:postgresql://localhost:5432/ajudeaqui", "postgres",
			// "postgres");
			// con.setAutoCommit(false);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			System.out.println("Driver n�o encontrado.");
			throw new RuntimeException(e);
		}
		return con;

	}

	/**
	 * M�todo que encerra a conex�o com o banco de dados
	 * 
	 * @throws SQLException
	 */
	public void closeConnection() throws SQLException {

		con.close();
		System.out.println("Conexao encerrada.");
	}
}
