package my.projet.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {

	private static Connection con;
	static {
		try {
			//Charger le driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Authentification aupr�s de la base de donn�es
			con= DriverManager.getConnection("jdbc:mysql://localhost/cabinet", "root", "");
		}catch(ClassNotFoundException e) {
			System.err.println("Impossible de charger le driver!!");
		}catch(SQLException e) {
			System.err.println("Erreur de connexion � la base de donn�es!!");
		}
	}
	public static Connection getConnection() {
		return con;
	}
}
