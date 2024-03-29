package pojo;

// Generated 01-juin-2014 23:43:04 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Produits generated by hbm2java
 */
@Entity
@Table(name = "produits", catalog = "fitnessclub")
public class Produits implements java.io.Serializable {

	private Integer idProduit;
	private String libelle;
	private String description;
	private float quantite;
	private BigDecimal prixHtva;
	private float tauxTva;
	private float prix;
	private int idCategorie;

	public Produits() {
	}

	public Produits(String libelle, String description, float quantite,
			BigDecimal prixHtva, float tauxTva, float prix, int idCategorie) {
		this.libelle = libelle;
		this.description = description;
		this.quantite = quantite;
		this.prixHtva = prixHtva;
		this.tauxTva = tauxTva;
		this.prix = prix;
		this.idCategorie = idCategorie;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idProduit", unique = true, nullable = false)
	public Integer getIdProduit() {
		return this.idProduit;
	}

	public void setIdProduit(Integer idProduit) {
		this.idProduit = idProduit;
	}

	@Column(name = "libelle", nullable = false, length = 50)
	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Column(name = "description", nullable = false, length = 50)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "quantite", nullable = false, precision = 12, scale = 0)
	public float getQuantite() {
		return this.quantite;
	}

	public void setQuantite(float quantite) {
		this.quantite = quantite;
	}

	@Column(name = "prixHtva", nullable = false, precision = 20, scale = 0)
	public BigDecimal getPrixHtva() {
		return this.prixHtva;
	}

	public void setPrixHtva(BigDecimal prixHtva) {
		this.prixHtva = prixHtva;
	}

	@Column(name = "tauxTva", nullable = false, precision = 12, scale = 0)
	public float getTauxTva() {
		return this.tauxTva;
	}

	public void setTauxTva(float tauxTva) {
		this.tauxTva = tauxTva;
	}

	@Column(name = "prix", nullable = false, precision = 12, scale = 0)
	public float getPrix() {
		return this.prix;
	}

	public void setPrix(float prix) {
		this.prix = prix;
	}

	@Column(name = "idCategorie", nullable = false)
	public int getIdCategorie() {
		return this.idCategorie;
	}

	public void setIdCategorie(int idCategorie) {
		this.idCategorie = idCategorie;
	}

}
