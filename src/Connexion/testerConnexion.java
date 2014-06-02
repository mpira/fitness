package Connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class testerConnexion {

	public static void main(String[] args) {
	
		//declarer mes parametres de connexion
		Connection connexion=null;
        try {
			connexion = DriverManager.getConnection(paramsconnexion.URL,paramsconnexion.ADMIN,paramsconnexion.PASSWORD);
			System.out.println("Les parametres sont Correctes");
			JOptionPane.showMessageDialog(null, "Parametre Correctes...");
			
		} 
        catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Les parametres sont incorrectes");
			JOptionPane.showMessageDialog(null, "Parametres Incorrectes");
		}
        finally{
        	//fermer les objets
        	if (connexion!= null){
        		try {
					connexion.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
        	}
        }
	}

}
