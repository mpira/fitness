package ihm;

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
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Spring;
import javax.swing.SpringLayout;
import javax.swing.border.Border;

public class FenetrePrincipale2 extends JFrame{

	private JLabel lb_titre=null;
	private JButton btn_conf=null;
	private JButton btn_annuler=null;
	private JPanel container=new JPanel();
	private Dimension dim_label=new Dimension(150,25);
	private Dimension dim_bouton=new Dimension(100,25);
	private Dimension dim_comp=new Dimension(250,25);
	private JButton Annuler=null;
	private JButton Confirmer=null;
	private JLabel label1=new JLabel("Login");
	private JLabel label2=new JLabel("Password");
	private JTextField jtf= new JTextField();
	private JTextField jtf2= new JTextField();
	private JPanel containerCentre=new JPanel();
	public boolean flag = false;
	private JDialog dialog = null;
	
	
	public FenetrePrincipale2(){
		super();
		build();
	}
	
	private void build() {
		this.setTitle("Fitness Club");
		this.setSize(500,500);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		//Je modifie l'icone  de la fenetre
		
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowAdapter() {
			// redéfinition de la méthode
			public void windowClosing(WindowEvent e){
				// demander confirmation avec JOptionPane
				int v = JOptionPane.showConfirmDialog(null, "Etes-vous sur de vouloir quitter ?", "Confirmation", JOptionPane.YES_NO_OPTION, 2);
				// o pour oui et 1 pour non
				if( v == 0){
					// faire les differentes operations de maintenance
					// sauvegarde par exemple
					System.exit(0);
				}
			}
		});
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
	        GridBagLayout layout = new GridBagLayout();
	        containerCentre.setLayout(layout);
	        GridBagConstraints gbc=new GridBagConstraints();
	        gbc.insets=new Insets (3,3,10,20);
	        gbc.gridx=0;
	        gbc.gridy=0;
	        label1.setPreferredSize(dim_label);
	        containerCentre.add(label1,gbc);
	        gbc.gridx=1;
	        gbc.gridy=0;
	        jtf.setPreferredSize(dim_comp);
	        containerCentre.add(jtf,gbc);
	        
	        gbc.gridx=0;
	        gbc.gridy=1;
	        label2.setPreferredSize(dim_label);
	        containerCentre.add(label2,gbc);
	        gbc.gridx=1;
	        gbc.gridy=1;
	        jtf2.setPreferredSize(dim_comp);
	        containerCentre.add(jtf2,gbc);
	        
	        gbc.gridx=1;
	        gbc.gridy=2;
	        JPanel pnl_btn=new JPanel();
	        pnl_btn.setLayout(new GridLayout(1,2,30,10));
	        btn_conf=new JButton("Confirmer");
	        btn_conf.setPreferredSize(dim_bouton);
	        pnl_btn.add(btn_conf);
	        btn_annuler=new JButton("Annuler");
	        btn_annuler.setPreferredSize(dim_bouton);
	        pnl_btn.add(btn_annuler);
	        btn_annuler.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					jtf.setText("");
					jtf2.setText("");	
				}
			});
	        
	        containerCentre.add(pnl_btn,gbc);
	        container.add(containerCentre);
	        
	        
	               
         container.add(containerCentre,BorderLayout.CENTER);
         
		//container.add(label2);
		//container.add(jtf);
         ImageIcon icone = new ImageIcon("images/zetman.jpg");
         JLabel image = new JLabel(icone);
         container.add(image,BorderLayout.WEST);
         
         // ici je vais ouvrir une fenetre de dialog sur la commande du btn confirmer
         btn_conf.addActionListener(new ActionListener() {
        	 
        	
				@Override
				public void actionPerformed(ActionEvent arg0) {
					 if(jtf.getText().equalsIgnoreCase("nobody") && jtf2.getText().equalsIgnoreCase("nobody") ){
					// Je ne lance la boite de dialogue que si elle n'est pas ouverte
					 if(!flag ) {
						 // false donne une JDialog non-modal
						 dialog = new FenetreDialogue(FenetrePrincipale2.this, "Ajouter membre", false);
						 dialog.setVisible(true);
						 flag = true;
					 }
					 jtf.setText("");
					 jtf2.setText("");
				  }else{
					  JOptionPane.showMessageDialog(null,"Le login n'est pas correct");
					  jtf.setText("");
					  jtf2.setText("");	
				  }
				}
			});
		
		this.setContentPane(container);
		this.pack();
		this.setVisible(true);
		
		
	}
}
