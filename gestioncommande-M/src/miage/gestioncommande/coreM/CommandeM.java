package miage.gestioncommande.coreM;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import miage.gestioncommande.api.Client;
import miage.gestioncommande.api.Commande;
import miage.gestioncommande.api.LigneCommande;
import miage.gestioncommande.api.Produit;
import miage.gestioncommande.api.Responsable;

public class CommandeM implements Commande {

	private Long id;
	
	private Calendar dateCommande;
	
	private Calendar dateLivraison;
	
	private Client client;
	
	private Responsable responsable;
	
	private List<LigneCommandeM> ligneCommandes;

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Commande#getId()
	 */
	@Override
	public Long getId() {
		return id;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Commande#setId(java.lang.Long)
	 */
	@Override
	public void setId(Long id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Commande#getDateCommande()
	 */
	@Override
	public Calendar getDateCommande() {
		return dateCommande;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Commande#setDateCommande(java.util.Calendar)
	 */
	@Override
	public void setDateCommande(Calendar dateCommande) {
		this.dateCommande = dateCommande;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Commande#getDateLivraison()
	 */
	@Override
	public Calendar getDateLivraison() {
		return dateLivraison;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Commande#setDateLivraison(java.util.Calendar)
	 */
	@Override
	public void setDateLivraison(Calendar dateLivraison) {
		this.dateLivraison = dateLivraison;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Commande#getClient()
	 */
	@Override
	public Client getClient() {
		return client;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Commande#setClient(miage.gestioncommande.coreM.Client)
	 */
	@Override
	public void setClient(Client client) {
		this.client = client;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Commande#getResponsable()
	 */
	@Override
	public Responsable getResponsable() {
		return responsable;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Commande#setResponsable(miage.gestioncommande.coreM.Responsable)
	 */
	@Override
	public void setResponsable(Responsable responsable) {
		this.responsable = responsable;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Commande#getProduits()
	 */
	@Override
	public List<? extends LigneCommande> getLigneCommandes() {
		if(ligneCommandes == null) ligneCommandes = new ArrayList<LigneCommandeM>();
		return ligneCommandes;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Commande#setProduits(java.util.List)
	 */
	@Override
	public void setLigneCommandes(List<? extends LigneCommande> ligneCommandes) {
		this.ligneCommandes = (List<LigneCommandeM>) ligneCommandes;
	}
	
}
