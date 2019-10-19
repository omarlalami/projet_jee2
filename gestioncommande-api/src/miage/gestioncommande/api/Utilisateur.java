package miage.gestioncommande.api;

public interface Utilisateur {

	Long getId();

	void setId(Long id);

	String getNom();

	void setNom(String nom);

	String getPrenom();

	void setPrenom(String prenom);

	String getLogin();

	void setLogin(String login);

	String getMdp();

	void setMdp(String mdp);

}