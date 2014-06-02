package ihm;

import java.applet.Applet;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;

import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Spring;
import javax.swing.SpringLayout;
import javax.swing.border.Border;

public class FenetrePrincipale extends JFrame{

	private JLabel lb_titre=null;
	private JButton btn_conf=null;
	private JButton btn_annuler=null;
	private JPanel container=new JPanel();
	private Dimension dim_label=new Dimension(150,25);
	private Dimension dim_bouton=new Dimension(100,25);
	private Dimension dim_comp=new Dimension(80,35);
	private GridLayout gl=new GridLayout(4,2,30,30);
	private JButton cours=new JButton("Cours collectifs");
	private JButton membres=new JButton("Membres");
	private JButton guests=new JButton("Guests");
	private JButton produit=new JButton("Produits");
	private JButton coach=new JButton("Coachs");
	private JButton employe=new JButton("Employés");
	private JButton prof=new JButton("Professeurs cours");
	private DefaultComboBoxModel comboModel;
	private JComboBox combo;
	private Font font=new Font("Verdana", Font.BOLD, 24);
	private Font font2=new Font("Script",Font.BOLD,24);
	private Font font3=new Font("Comic Sans",Font.BOLD,24);
	private JButton ajoutMembre=new JButton("Ajouter");
	private JButton modifierMembre=new JButton("Modifier");
	private JPanel panMembre=new JPanel();
	private JPanel containerCentre=new JPanel();
	
	
	public FenetrePrincipale(){
		super();
		build();
	}
	
	private void build() {
		this.setTitle("Fitness Club");
		this.setSize(300,250);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		//Je modifie l'icone  de la fenetre
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CardLayout cl = new CardLayout();
		//Liste des noms de nos conteneurs pour la pile de cartes 
		container.setLayout(new BorderLayout());
		lb_titre=new JLabel("FITNESS CLUB");
		lb_titre.setHorizontalAlignment(JLabel.CENTER);
		lb_titre.setPreferredSize(new Dimension(400,75));
		lb_titre.setFont(new Font("Verdana",Font.BOLD,32));
		lb_titre.setForeground(Color.BLACK);
		//lb_titre.setBackground(Color.WHITE);
		lb_titre.setOpaque(true);
		container.setBackground(Color.magenta);
		container.add(lb_titre , BorderLayout.NORTH);
	      
		 //Ici je rajoute les bouton dans des panels pour pouvoir rajouter des composant dans groupés avc mon bouton
		//Bouton Membres
	     containerCentre.setLayout(gl);
	     membres.setBackground(Color.YELLOW);
	     membres.setFont(font);
	     membres.setEnabled(false);
	     panMembre.setLayout(new BorderLayout());
	     panMembre.add(membres,BorderLayout.CENTER);
	     panMembre.add(ajoutMembre,BorderLayout.SOUTH);
	     panMembre.add(modifierMembre,BorderLayout.NORTH);
	     containerCentre.add(panMembre);
	     
	     guests.setBackground(Color.YELLOW);
	     guests.setFont(font);
	     containerCentre.add(guests);
	     cours.setBackground(Color.YELLOW);
	     cours.setFont(font);
	     containerCentre.add(cours);
	     prof.setBackground(Color.YELLOW);
	     prof.setFont(font);
	     containerCentre.add(prof);
	     employe.setBackground(Color.YELLOW);
	     employe.setFont(font);
	     containerCentre.add(employe);
	     coach.setBackground(Color.YELLOW);
	     coach.setFont(font);
	     containerCentre.add(coach);
	     produit.setBackground(Color.YELLOW);
	     produit.setFont(font);
	     containerCentre.add(produit);
	     
	     comboModel=new DefaultComboBoxModel();
	     comboModel.addElement("Theme par Defaut");
	     comboModel.addElement("Theme 1");
	     comboModel.addElement("Theme 2");
	    
	     combo=new JComboBox(comboModel);
	     combo.setBackground(Color.BLACK);
	     combo.setForeground(Color.YELLOW);
	     combo.setFont(font);
	     containerCentre.add(combo);
	     
	     combo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent event) {
				 JComboBox combo=(JComboBox) event.getSource();
				 System.out.println("Selected Item  = " + combo.getSelectedItem());

				if("Theme 1".equals(combo.getSelectedItem())){
					membres.setBackground(Color.RED);
					membres.setFont(font2);
					membres.setForeground(Color.BLACK);
					cours.setBackground(Color.RED);
					cours.setFont(font2);
					cours.setForeground(Color.BLACK);
					prof.setBackground(Color.RED);
					prof.setFont(font2);
					prof.setForeground(Color.BLACK);
					coach.setBackground(Color.RED);
					coach.setFont(font2);
					coach.setForeground(Color.BLACK);
					guests.setBackground(Color.RED);
					guests.setFont(font2);
					guests.setForeground(Color.BLACK);
					produit.setBackground(Color.RED);
					produit.setFont(font2);
					produit.setForeground(Color.BLACK);
					employe.setBackground(Color.RED);
					employe.setFont(font2);
					employe.setForeground(Color.BLACK);
					
					containerCentre.setBackground(Color.WHITE);

				}
				else if("Theme 2".equals(combo.getSelectedItem())){
				membres.setBackground(Color.blue);
				membres.setFont(font3);
				membres.setForeground(Color.YELLOW);
				cours.setBackground(Color.blue);
				cours.setFont(font3);
				cours.setForeground(Color.YELLOW);
				prof.setBackground(Color.blue);
				prof.setFont(font3);
				prof.setForeground(Color.YELLOW);
				coach.setBackground(Color.blue);
				coach.setFont(font3);
				coach.setForeground(Color.YELLOW);
				guests.setBackground(Color.blue);
				guests.setFont(font3);
				guests.setForeground(Color.YELLOW);
				produit.setBackground(Color.blue);
				produit.setFont(font3);
				produit.setForeground(Color.YELLOW);
				employe.setBackground(Color.blue);
				employe.setFont(font3);
				employe.setForeground(Color.YELLOW);
				
				containerCentre.setBackground(Color.green);

			}else{
				 membres.setBackground(Color.YELLOW);
			     membres.setFont(font);
			 	 membres.setForeground(Color.BLACK);
			     guests.setBackground(Color.YELLOW);
			     guests.setFont(font);
			 	 guests.setForeground(Color.BLACK);
			     cours.setBackground(Color.YELLOW);
			     cours.setFont(font);
			 	 cours.setForeground(Color.BLACK);
			     prof.setBackground(Color.YELLOW);
			     prof.setFont(font);
			 	 prof.setForeground(Color.BLACK);
			     employe.setBackground(Color.YELLOW);
			     employe.setFont(font);
			 	 employe.setForeground(Color.BLACK);
			     coach.setBackground(Color.YELLOW);
			     coach.setFont(font);
			 	 coach.setForeground(Color.BLACK);
			     produit.setBackground(Color.YELLOW);
			     produit.setFont(font);
			 	 produit.setForeground(Color.BLACK);
			  
			 	 containerCentre.setBackground(Color.lightGray);

			}
		}
	});
  
	   
	    
	     
	               
         container.add(containerCentre,BorderLayout.CENTER);
		//container.add(label2);
		//container.add(jtf);
         ImageIcon icone = new ImageIcon("images/IMG_4437.PNG");
         JLabel image = new JLabel(icone);
         container.add(image,BorderLayout.WEST);
		
		this.setContentPane(container);
		this.pack();
		this.setVisible(true);
		
		
	}
}
