package Connexion;

import javax.swing.JOptionPane;

public class testerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver reconnu");
			JOptionPane.showMessageDialog(null, "Driver reconnu");
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("probleme avec le Driver");
			JOptionPane.showMessageDialog(null, "Probleme avec le Driver");
		}
	}

}
