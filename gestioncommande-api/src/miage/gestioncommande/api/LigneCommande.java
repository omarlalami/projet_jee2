package miage.gestioncommande.api;

public interface LigneCommande {

	Produit getProduit();

	void setProduit(Produit produit);

	Commande getCommande();

	void setCommande(Commande commande);

	int getQuantite();

	void setQuantite(int quantite);

	double getMontant();

	void setMontant(double montant);

}