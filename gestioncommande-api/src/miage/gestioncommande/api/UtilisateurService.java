package miage.gestioncommande.api;

import java.util.List;

/**
 * Interface du Service qui gère les utilisateurs
 * @author JS
 *
 */
public interface UtilisateurService {

	/**
	 * Retourne la liste sauvegardée des clients
	 * @return La liste des clients
	 */
	List<? extends Client> listerClients();
	
	/**
	 * Retourne la liste des responsables
	 * @return La liste des responsables
	 */
	List<? extends Responsable> listerResponsable();

	/**
	 * Permet de créer un nouveau client
	 * @param c Le client à créer
	 */
	void creerClient(Client c);

	/**
	 * Permet de créer un responsable
	 * @param r Le responsable à créer
	 */
	void creerResponsable(Responsable r);

}