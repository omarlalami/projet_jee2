package miage.gestioncommande.api;

/**
 * Classe représentant l'adresse d'un client
 * 
 * @author JS
 *
 */
public interface Adresse {

	/**
	 * Retourne la ligne 1 de l'adresse
	 * @return Ligne1
	 */
	String getLigne1();

	/**
	 * Met à jour la ligne 1 de l'adresse
	 */
	void setLigne1(String ligne1);

	/**
	 * Retourne la ligne 2 de l'adresse
	 * @return Ligne 2
	 */
	String getLigne2();

	/**
	 * Met à jour la ligne 2 de l'adresse
	 */
	void setLigne2(String ligne2);

	/**
	 * Retourne la ville de l'adresse
	 * @return Ville
	 */
	String getVille();

	/**
	 * Met à jour la ville de l'adresse
	 */
	void setVille(String ville);

	/**
	 * Retourne le code postal de l'adresse
	 * @return CodePostal
	 */
	String getCodePostal();

	/**
	 * Met à jour le code postal de l'adresse
	 */ 
	void setCodePostal(String codePostal);

}