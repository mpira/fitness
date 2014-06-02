package Connexion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class testerSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       //etape 1 recuperer les fichiers dans le properties
		Properties props = null;
		String chemin ="Fichier/config2.properties";
		try{
			props= outilsConfiguration.recupererPropoerties(chemin);
		}catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//etape2 recupere un objet connection
        Connection connection=null;
        connection= Singleton.getInstance(props);
        
        //afficher tout les records de la table client
        String sql ="select * from Client";
        Statement st=null;
        ResultSet rs=null;
        try {
		  st= connection.createStatement();
		  rs=st.executeQuery(sql);
		  while(rs.next()){
			  System.out.println(rs.getInt("idClient")+"  "+ rs.getString("nomclient")+"  "+ rs.getString("prenomClient")+"  "+rs.getString("emailClient"));
			  
		  }
		  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        finally {
        	try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	try {
				st.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        	//remettre le singleton a l'initial
        	Singleton.shutDown();
        }
        
        
	}	
}
