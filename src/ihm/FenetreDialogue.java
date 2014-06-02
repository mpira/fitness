package ihm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.AbstractListModel;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class FenetreDialogue extends JDialog {
	
	private GridBagConstraints gbc = null;
	private JTextField txtNom = null;
	private JTextField txtPrenom = null;
	private JTextField txtAge = null;
	private GridLayout gl=new GridLayout(4,2,30,30);
	private JButton cours=new JButton("Cours collectifs");
	private JButton membres=new JButton("Ajouter Membre");
	private JButton membresMod=new JButton("Update Membre");
	private JButton guests=new JButton("Guests");
	private JButton produit=new JButton("Produits");
	private JButton coach=new JButton("Coachs");
	private JButton employe=new JButton("Employés");
	private JButton prof=new JButton("Professeurs cours");
	private Dimension dim_btn = new Dimension(150, 50);	
	public boolean flag = false;
	private JDialog dialog2 = null;
	
	private JFrame frame;

	public FenetreDialogue(JFrame frame, String titre,
			boolean modal) {
		super(frame, titre, modal);
		this.frame = frame;
		build();
	}
	public FenetreDialogue(){
		build();
	}
	private void build() {
	this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	
		// *** Partie Nord ***
		this.setSize(450, 450);
		this.setTitle("Vue Generale");
		JPanel content = new JPanel();
		// On definit le layout du JPanel
		
		content.setLayout(gl);
		membres.setBorder(BorderFactory.createLineBorder(Color.RED));
		membresMod.setBorder(BorderFactory.createLineBorder(Color.RED));
	    content.add(membres);
	    content.add(membresMod);
	    guests.setBorder(BorderFactory.createLineBorder(Color.RED));
	    content.add(guests);
	    cours.setBorder(BorderFactory.createLineBorder(Color.RED));
	     content.add(cours);
	     prof.setBorder(BorderFactory.createLineBorder(Color.RED));
	     content.add(prof);
	     employe.setBorder(BorderFactory.createLineBorder(Color.RED));
	     content.add(employe);
	     coach.setBorder(BorderFactory.createLineBorder(Color.RED));
	     content.add(coach);
	     produit.setBorder(BorderFactory.createLineBorder(Color.RED));
	     content.add(produit);
		
	     membres.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent arg0) {
					// Je ne lance la boite de dialogue que si elle n'est pas ouverte
					 if(!flag ) {
						 // false donne une JDialog non-modal
						 dialog2 = new AjouterMembre();
						 dialog2.setVisible(true);
						 flag = true;
					 }
				}
			});
		
		// On ajoute le JPanel à la JFrame
		this.getContentPane().add(content, BorderLayout.CENTER);
		this.pack();
		// Positionner la Jdialog a coté de la fenetre principale
		this.setLocationRelativeTo(null); 
		
	}
	
	
	
	
	
	
	
	

}
