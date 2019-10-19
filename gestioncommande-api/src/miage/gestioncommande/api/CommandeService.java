package miage.gestioncommande.api;

import java.util.List;

/**
 * Interface de service qui g�re les commandes
 * @author JS
 *
 */
public interface CommandeService {

	/**
	 * Permet de rechercher les commandes
	 * @return La liste des commandes
	 */
	List<? extends Commande> rechercherCommande();

	/**
	 * Permet de passer un commande au statut livr�
	 * @param c Le client
	 */
	void livrerCommande(Commande c);

	/**
	 * Permet de cr�er un commande pour un client
	 * @param c Le client
	 * @return Commande
	 */
	Commande creerCommande(Client c);

	/**
	 * Permet de selectionner une commande, pour effectuer les op�rations d'ajout, de liste et de suppression de produit, de sauvegarde et de sauvegarde de commande
	 * @param c La Commande � selectionner
	 */
	void selectionnerCommande(Commande c);

	/**
	 * Permet d'ajouter un produit � la commande selectionn�e
	 * @param Produit � ajouter
	 */
	void ajouterProduit(Produit p);

	/**
	 * Permet de supprimer un produit de la commande
	 * @param Produit � supprimer
	 */
	void supprimerProduit(Produit p);

	/**
	 * Permet de sauvegarder la commande selectionn�e
	 */
	void sauvegarderCommande();

	/**
	 * Retourne la liste des produits contenus dans une commande
	 * @return La liste des produits dans la commande selectionn�e
	 */
	List<? extends Produit> listerProduit();
	
	/**
	 * Permet de lister les commandes d'un client
	 * @param c Le client dont les commandes doivent �tre list�
	 */
	List<? extends Commande> listerCommandes(Client c);

}