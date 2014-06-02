package statements;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import Connexion.paramsconnexion;

public class TesterPreparedStatement {

	public static void main(String[] args) {
		Connection connexion=null;
		PreparedStatement pst=null;
		String sql=null;
		ResultSet rsKey=null;
		
        try {
			connexion = DriverManager.getConnection(paramsconnexion.URL,paramsconnexion.ADMIN,paramsconnexion.PASSWORD);
			
			sql= "INSERT INTO membre values(Null,?,?,?,?,?,?,?,?,?,?,?)";
			pst= connexion.prepareStatement(sql);
			//remplacer les points d'interrogation par leurs valeurs respectives 
			
			pst.setString(1,"5425321");
			pst.setString(2,"000373435108");
			pst.setString(3,"light");
			pst.setString(4,"valide");
			pst.setString(5,"2014-02-23");
			//un prepared statement gere les simple quotes
			
			
			int val=pst.executeUpdate();
			
			JOptionPane.showMessageDialog(null, "1 Personne ajoutée");
		   
		} 
        
        catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Les parametres sont incorrectes");
			JOptionPane.showMessageDialog(null, "Parametres Incorrectes");
		}
    
        //fermer les objets
        finally{
        	if(rsKey!=null){
        		try {
					rsKey.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
        	}
        	
        	if (pst != null){
        		try {
					pst.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
        	}
        }
	}

	
}
