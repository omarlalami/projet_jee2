package miage.gestioncommande.api;

import java.util.List;

/**
 * Interface de service qui sert à présenter et à actualiser les produits du catalogue
 * @author JS
 *
 */
public interface CatalogueService {

	/**
	 * Retourne la liste des produits
	 * @return La liste des produits
	 */
	List<? extends Produit> afficherCatalogue();

	/**
	 * Ajoute un produit au catalogue
	 * @param p Le produit à rajouter
	 */
	void ajouterProduit(Produit p);

	/**
	 * Permet d'actualiser le prix d'un produit
	 * @param px Le nouveau prix
	 * @param pr L'ancien prix
	 */
	void actualiserPrix(Prix px, Produit pr);

	/**
	 * Permet de rechercher un produit à partir de son id
	 * @param id L'ID du produit
	 * @return Le produit , sinon null
	 */
	Produit rechercherProduit(Long id);

	/**
	 * Permet de supprimer un produit a partir de son ID.
	 * @param id L'ID du produit à supprimer
	 */
	void supprimerProduit(Long id);
	
	/**
	 * Permet de récuperer le prix actuel d'un produit.
	 * @param p Le produit dont le prix est recherché
	 * @return Le prix d'un produit
	 */
	Prix recupererPrix(Produit p);

}