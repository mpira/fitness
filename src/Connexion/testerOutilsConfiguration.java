package Connexion;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class testerOutilsConfiguration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /*
		Properties props= new Properties();
		props.put("Driver","com.mysql.jdbc.Driver");
		props.put("URL","jdbc:mysql://localhost:3306/testerjdbc");
		props.put("Admin","root");
		props.put("Password","");
		
		String chemin="Fichier/Config2.properties";
		try {
			outilsConfiguration.sauverProperties(props, chemin);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
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
		
		
	}

}
