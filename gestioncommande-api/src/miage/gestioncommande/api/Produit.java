package miage.gestioncommande.api;

import java.util.List;

public interface Produit {

	Long getId();

	void setId(Long id);

	String getDesignation();

	void setDesignation(String designation);
	
	List<Prix> getPrix();
	
	void setPrix(List<Prix> prix);

}