package miage.gestioncommande.api;

import java.util.List;

/**
 * Interface du Service qui g�re les utilisateurs
 * @author JS
 *
 */
public interface UtilisateurService {

	/**
	 * Retourne la liste sauvegard�e des clients
	 * @return La liste des clients
	 */
	List<? extends Client> listerClients();
	
	/**
	 * Retourne la liste des responsables
	 * @return La liste des responsables
	 */
	List<? extends Responsable> listerResponsable();

	/**
	 * Permet de cr�er un nouveau client
	 * @param c Le client � cr�er
	 */
	void creerClient(Client c);

	/**
	 * Permet de cr�er un responsable
	 * @param r Le responsable � cr�er
	 */
	void creerResponsable(Responsable r);

}