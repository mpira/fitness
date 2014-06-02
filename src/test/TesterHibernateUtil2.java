package test;
import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.Adresse;
import pojo.Categorie;
import pojo.Membre;
import pojo.Personne;



public class TesterHibernateUtil2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Session session = null;
		session = HibernateUtil.instance().openSession();
		
		Transaction tx = null;
		try{
			tx = session.beginTransaction(); //commencer la transaction
			//recuperer un client
			
			//recuperer un produit
			//encoder un pays et le rendre persistan
			//encoder une Adresse
			Adresse adresse=new Adresse("Rue de le ptite Boucherie","Mons","Hainaut","7000");
			session.persist(adresse);
			//encoder une personne
			Personne personne= new Personne("Mpira","Abdallah","1986-04-22","Homme","0483095130","abmpira@hotmail.com", adresse.getIdAdresse());
			session.persist(personne);
			//Client client=new Client(personne,adresse,new Date(),'H',0.1f,"Saga Africa","BE0507096543");
			Membre membre=new Membre(personne.getIdPersonne(),"203578903","00030658509225","All in","Valide","2014-02-26");
			session.persist(membre);
			tx.commit();
			System.out.println("pas de problème de mapping");
		}
		catch (HibernateException e) {
			if (tx!=null) tx.rollback();
			e.printStackTrace(); 
		}
		finally {
			session.close(); 
		}
		
	}

}
