package Connexion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class CreationProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties props= new Properties();
		props.put("Driver","com.mysql.jdbc.Driver");
		props.put("URL","jdbc:mysql://localhost:3306/fitnessclub");
		props.put("Admin","root");
		props.put("Password","");
		
		
		String chemin="Fichier/configurations.properties";
		File file= new File(chemin);
		//fw est un objet pour ecrire dans le fichier
		FileWriter fw=null;
		
		try {
			
			fw=new FileWriter(file);
			
			props.store(fw,"Configuration Donnees Database");
			fw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
