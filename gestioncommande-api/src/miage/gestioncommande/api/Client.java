package miage.gestioncommande.api;

import java.util.Calendar;

/**
 * Interface repr�sentant une classe client
 * @author JS
 *
 */
public interface Client {

	/**
	 * Retourne le genre du client (Homme ou Femme)
	 * @return Genre
	 */
	String getGenre();

	/**
	 * Met � jour le genre du client
	 * @param genre
	 */
	void setGenre(String genre);

	/**
	 * Retourne la date de naissance du client
	 * @return DatNaiss
	 */
	Calendar getDateNaiss();

	/**
	 * Met � jour la date de naissance du client
	 * @param dateNaiss
	 */
	void setDateNaiss(Calendar dateNaiss);

	/**
	 * Retourne l'adresse du client
	 * @return Adresse
	 */
	Adresse getAdresse();

	/**
	 * Met � jour l'adresse du client
	 * @param adresse
	 */
	void setAdresse(Adresse adresse);

	/**
	 * Retourne l'utilisateur responsable de ce client
	 * @return Responsable
	 */
	Responsable getResponsable();

	/**
	 * Met � jour le responsable du client
	 * @param responsable
	 */
	void setResponsable(Responsable responsable);

}