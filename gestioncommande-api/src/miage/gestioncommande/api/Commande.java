package miage.gestioncommande.api;

import java.util.Calendar;
import java.util.List;

/**
 * Interface décrivant une commande
 * @author JS
 *
 */
public interface Commande {

	Long getId();

	void setId(Long id);

	Calendar getDateCommande();

	void setDateCommande(Calendar dateCommande);

	Calendar getDateLivraison();

	void setDateLivraison(Calendar dateLivraison);

	Client getClient();

	void setClient(Client client);

	Responsable getResponsable();

	void setResponsable(Responsable responsable);

	List<? extends LigneCommande> getLigneCommandes();

	void setLigneCommandes(List<? extends LigneCommande> produits);

}