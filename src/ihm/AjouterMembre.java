package ihm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Adresse;
import pojo.Membre;
import pojo.Personne;
import test.HibernateUtil;

public class AjouterMembre extends JDialog {

	private JFrame frame = null;
	private GridBagConstraints gbc = null;
	
	private JTextField txtrue = null;
	private JTextField txtville= null;
	private JTextField txtprovince = null;
	private JTextField txtZipcode = null;
	private JTextField txtprenom = null;
	private JTextField txtNom = null;
	private JTextField txtdatenaissance = null;
	private JTextField txtsexe = null;
	private JTextField txttelephone= null;
	private JTextField txtemail = null;
	private JTextField txtcarteidentite = null;
	private JTextField txtCompte = null;
	private JTextField txtabonnement = null;
	private JTextField txtmedical = null;
	private JTextField txtdateinscription = null;
	
	
	
	
	private JButton btn_conf=null;
	private JButton btn_annuler=null;
	
	
	
	public AjouterMembre() {
				build();
	}
	
	private void build() {
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		
			// *** Partie Nord ***
			this.setSize(450, 450);
			this.setTitle("Nouveau Membre");
			JPanel content = new JPanel();
			content.setLayout(new GridBagLayout());
			gbc = new GridBagConstraints();
			
			// On définit un espace entre les composants avec insets
			gbc.insets = new Insets(10, 10, 10, 10);
			// On place les composants
			gbc.gridx = 0;
			gbc.gridy = 0;
			JLabel lblrue = new JLabel("Rue");
			lblrue.setPreferredSize(new Dimension(60, 20));
			// On ajoute le composant au JPanel
			// ***** ATTENTION ***** Ne pas oublier d'indiquer le gbc *****
			content.add(lblrue, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 0;
			txtrue = new JTextField();
			txtrue.setPreferredSize(new Dimension(100, 20));
			content.add(txtrue, gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 1;
			JLabel lblville = new JLabel("Ville");
			lblville.setPreferredSize(new Dimension(60, 20));
			content.add(lblville, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 1;
			txtville = new JTextField();
			txtville.setPreferredSize(new Dimension(100, 20));
			content.add(txtville, gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 2;
			JLabel lblprovince = new JLabel("Province");
			lblprovince.setPreferredSize(new Dimension(60, 20));
			content.add(lblprovince, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 2;
			txtprovince = new JTextField();
			txtprovince.setPreferredSize(new Dimension(100, 20));
			content.add(txtprovince, gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 3;
			JLabel lblzipcode = new JLabel("ZipCode");
			lblzipcode.setPreferredSize(new Dimension(60, 20));
			content.add(lblzipcode, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 3;
			txtZipcode = new JTextField();
			txtZipcode.setPreferredSize(new Dimension(100, 20));
			content.add(txtZipcode, gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 4;
			JLabel lblnom = new JLabel("Nom");
			lblnom.setPreferredSize(new Dimension(60, 20));
			content.add(lblnom, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 4;
			txtNom = new JTextField();
			txtNom.setPreferredSize(new Dimension(100, 20));
			content.add(txtNom, gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 5;
			JLabel lblprenom = new JLabel("prenom");
			lblprenom.setPreferredSize(new Dimension(60, 20));
			content.add(lblprenom, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 5;
			txtprenom = new JTextField();
			txtprenom.setPreferredSize(new Dimension(100, 20));
			content.add(txtprenom, gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 6;
			JLabel lbldatenaissance = new JLabel("Date Naissance");
			lbldatenaissance.setPreferredSize(new Dimension(60, 20));
			content.add(lbldatenaissance, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 6;
			txtdatenaissance = new JTextField();
			txtdatenaissance.setPreferredSize(new Dimension(100, 20));
			content.add(txtdatenaissance, gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 7;
			JLabel lblsexe = new JLabel("Sexe");
			lblsexe.setPreferredSize(new Dimension(60, 20));
			content.add(lblsexe, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 7;
			txtsexe = new JTextField();
			txtsexe.setPreferredSize(new Dimension(100, 20));
			content.add(txtsexe, gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 8;
			JLabel lbltelephone = new JLabel("Telephone");
			lbltelephone.setPreferredSize(new Dimension(60, 20));
			content.add(lbltelephone, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 8;
			txttelephone = new JTextField();
			txttelephone.setPreferredSize(new Dimension(100, 20));
			content.add(txttelephone, gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 9;
			JLabel lblemail = new JLabel("Email");
			lblemail.setPreferredSize(new Dimension(60, 20));
			content.add(lblemail, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 9;
			txtemail = new JTextField();
			txtemail.setPreferredSize(new Dimension(100, 20));
			content.add(txtemail, gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 10;
			JLabel lblcarteId = new JLabel("Num CarteId");
			lblcarteId.setPreferredSize(new Dimension(60, 20));
			content.add(lblcarteId, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 10;
			txtcarteidentite = new JTextField();
			txtcarteidentite.setPreferredSize(new Dimension(100, 20));
			content.add(txtcarteidentite, gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 11;
			JLabel lblcompte= new JLabel("Num Compte");
			lblcompte.setPreferredSize(new Dimension(60, 20));
			content.add(lblcompte, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 11;
			txtCompte = new JTextField();
			txtCompte.setPreferredSize(new Dimension(100, 20));
			content.add(txtCompte, gbc);

			gbc.gridx = 0;
			gbc.gridy = 12;
			JLabel lblabonnement= new JLabel("Abonnement");
			lblabonnement.setPreferredSize(new Dimension(60, 20));
			content.add(lblabonnement, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 12;
			txtabonnement = new JTextField();
			txtabonnement.setPreferredSize(new Dimension(100, 20));
			content.add(txtabonnement, gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 13;
			JLabel lblmedical= new JLabel("Status Medical");
			lblmedical.setPreferredSize(new Dimension(60, 20));
			content.add(lblmedical, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 13;
			txtmedical = new JTextField();
			txtmedical.setPreferredSize(new Dimension(100, 20));
			content.add(txtmedical, gbc);
			
			gbc.gridx = 0;
			gbc.gridy = 14;
			JLabel lblinscription= new JLabel("Date Inscription");
			lblinscription.setPreferredSize(new Dimension(60, 20));
			content.add(lblinscription, gbc);
			
			gbc.gridx = 1;
			gbc.gridy = 14;
			txtdateinscription = new JTextField();
			txtdateinscription.setPreferredSize(new Dimension(100, 20));
			content.add(txtdateinscription, gbc);



			
			
			
			   gbc.gridx=1;
		        gbc.gridy=15;
		        JPanel pnl_btn=new JPanel();
		        pnl_btn.setLayout(new GridLayout(1,2,30,10));
		        btn_conf=new JButton("Ajouter");
		        pnl_btn.add(btn_conf);
		        btn_annuler=new JButton("Annuler");
		        pnl_btn.add(btn_annuler);
		        content.add(pnl_btn,gbc);
		        
		        btn_conf.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						Session session = null;
						session = HibernateUtil.instance().openSession();
						
						Transaction tx = null;
						try{
							tx = session.beginTransaction(); //commencer la transaction
							//recuperer un client
							
							//recuperer un produit
							//encoder un pays et le rendre persistan
							//encoder une Adresse
							Adresse adresse=new Adresse(txtrue.getText(),txtville.getText(),txtprovince.getText(),txtZipcode.getText());
							session.persist(adresse);
							//encoder une personne
							Personne personne= new Personne(txtNom.getText(),txtprenom.getText(),txtdatenaissance.getText(),txtsexe.getText(),
									txttelephone.getText(),txtemail.getText(), adresse.getIdAdresse());
							session.persist(personne);
							//Client client=new Client(personne,adresse,new Date(),'H',0.1f,"Saga Africa","BE0507096543");
							Membre membre=new Membre(personne.getIdPersonne(),txtcarteidentite.getText(),txtCompte.getText(),txtabonnement.getText(),
									txtmedical.getText(),txtdatenaissance.getText());
							session.persist(membre);
							tx.commit();
							JOptionPane.showMessageDialog(null, "Nouveau Membre ajouté");
							System.out.println("pas de problème de mapping");
						}
						catch (HibernateException he) {
							if (tx!=null) tx.rollback();
							he.printStackTrace(); 
						}
						finally {
							session.close(); 
						}
						
						txtrue.setText("");
						txtville.setText("");
						txtprovince.setText("");
						txtZipcode.setText("");
						txtNom.setText("");
						txtprenom.setText("");
						txtdatenaissance.setText("");
						txtsexe.setText("");
						txttelephone.setText("");
						txtemail.setText("");
						txtcarteidentite.setText("");
						txtCompte.setText("");
						txtabonnement.setText("");
						txtmedical.setText("");
						txtdatenaissance.setText("");
					}
					
				});
		        
		        btn_annuler.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						txtrue.setText("");
						txtville.setText("");
						txtprovince.setText("");
						txtZipcode.setText("");
						txtNom.setText("");
						txtprenom.setText("");
						txtdatenaissance.setText("");
						txtsexe.setText("");
						txttelephone.setText("");
						txtemail.setText("");
						txtcarteidentite.setText("");
						txtCompte.setText("");
						txtabonnement.setText("");
						txtmedical.setText("");
						txtdatenaissance.setText("");
					}
				});
			
			// On ajoute le JPanel à la JFrame
			this.getContentPane().add(content, BorderLayout.CENTER);
			
			this.pack();
			
			this.setLocationRelativeTo(null);
			
			
			
	}
}
