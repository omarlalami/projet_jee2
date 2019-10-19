package miage.gestioncommande.api;

/**
 * Classe repr�sentant l'adresse d'un client
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
	 * Met � jour la ligne 1 de l'adresse
	 */
	void setLigne1(String ligne1);

	/**
	 * Retourne la ligne 2 de l'adresse
	 * @return Ligne 2
	 */
	String getLigne2();

	/**
	 * Met � jour la ligne 2 de l'adresse
	 */
	void setLigne2(String ligne2);

	/**
	 * Retourne la ville de l'adresse
	 * @return Ville
	 */
	String getVille();

	/**
	 * Met � jour la ville de l'adresse
	 */
	void setVille(String ville);

	/**
	 * Retourne le code postal de l'adresse
	 * @return CodePostal
	 */
	String getCodePostal();

	/**
	 * Met � jour le code postal de l'adresse
	 */ 
	void setCodePostal(String codePostal);

}