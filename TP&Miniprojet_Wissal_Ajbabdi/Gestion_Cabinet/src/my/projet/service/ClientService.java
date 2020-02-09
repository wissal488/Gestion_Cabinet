package my.projet.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import DAO.IDAO;
import my.projet.classes.Client;
import my.projet.connection.Connexion;

public class ClientService implements IDAO<Client>{
	
	//@Override
	public boolean create(Client obj) {
		try {
			//Création d'une requete SQL
			String req="insert into client (version,titre,nom,prenom) values("+obj.getVersion()+","+obj.getSexe()+","+obj.getNom()+","+obj.getPrenom()+")";
			//Création d'un statement
			Statement st= Connexion.getConnection().createStatement();
			//Exécution de la requete
			if(st.executeUpdate(req)==1) {
				return true;
			}
		}catch(SQLException e) {
			System.err.println("Erreur SQL!!");
		}
		return false;
	}
	
	public boolean update(Client obj) {
		try {
			String req="update client set version="+obj.getVersion()+", titre= ="+obj.getSexe()+", nom ="+obj.getNom()+", prenom ="+obj.getPrenom();
			Statement st=Connexion.getConnection().createStatement();
			if(st.executeUpdate(req)==1) {
				return true;
			}
		}catch(SQLException e) {
			System.err.println("Erreur SQL!!");
		}
		return false;
	}
	
	public boolean delete(Client obj) {
		try {
			String req="delete from client where id="+obj.getId();
			Statement st=Connexion.getConnection().createStatement();
			if(st.executeUpdate(req)==1) {
				return true;
			}
		}catch(SQLException e) {
			System.err.println("Erreur SQL!!");
		}
		return false;
	}
	
	
	public Client findById(int id) {
		try {
			String req="select * from client where id="+id;
			Statement st=Connexion.getConnection().createStatement();
			ResultSet rs=st.executeQuery(req);
			if(rs.next()) {
				return new Client(rs.getInt("ID"),rs.getString("VERSION"),rs.getString("SEXE"),rs.getString("NOM"),rs.getString("PRENOM"));
			}
		}catch(SQLException e) {
			System.err.println("Erreur SQL!!");
		}
		return null;
	}
	
	
	public List<Client> findAll(){
		List<Client> c=new ArrayList<>();
		try {
			String req="select * from client";
			Statement st=Connexion.getConnection().createStatement();
			ResultSet rs=st.executeQuery(req);
			while(rs.next()) {
				c.add(new Client(rs.getInt("ID"),rs.getString("VERSION"),rs.getString("SEXE"),rs.getString("NOM"),rs.getString("PRENOM")));
			}
		}catch(SQLException e) {
			System.err.println("Erreur SQL!!");
		}
		return c;
	}

}
