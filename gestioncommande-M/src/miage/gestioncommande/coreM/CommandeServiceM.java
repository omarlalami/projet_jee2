package miage.gestioncommande.coreM;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Singleton;

import miage.gestioncommande.api.Client;
import miage.gestioncommande.api.Commande;
import miage.gestioncommande.api.CommandeService;
import miage.gestioncommande.api.Produit;

/*
 * on utilise surtout pour des appels local
 * pour les remote appel a distance on utilise des web servioces !
 * */
@Singleton
@Local(CommandeService.class)
public class CommandeServiceM implements CommandeService {

	private List<CommandeM> listeCommande;
	private CommandeM commandeSelectionner;

	@Override
	public List<? extends Commande> rechercherCommande() {
		return listeCommande;
	}

	@Override
	public void livrerCommande(Commande c) {
		c.setDateLivraison(Calendar.getInstance());
	}

	@Override
	public Commande creerCommande(Client c) {
		CommandeM com = new CommandeM();
		com.setId((long) listeCommande.size());
		com.setDateCommande(Calendar.getInstance());
		com.setClient(c);
		return com;
	}

	@Override
	public void selectionnerCommande(Commande c) {
		commandeSelectionner=(CommandeM) c;
	}

	@Override
	public void ajouterProduit(Produit p) {
		ArrayList <LigneCommandeM> ligneCommandes = (ArrayList<LigneCommandeM>) commandeSelectionner.getLigneCommandes();
		
		LigneCommandeM lc = new LigneCommandeM();
		lc.setCommande(commandeSelectionner);
		lc.setProduit(p);
		lc.setQuantite(1);
		lc.setMontant(p.getPrix().get(0).getPrix());
		
		ligneCommandes.add(lc);
		
		commandeSelectionner.setLigneCommandes(ligneCommandes);
	}

	@Override
	public void supprimerProduit(Produit p) {

		if (commandeSelectionner != null ){
			ArrayList <LigneCommandeM> ligneCommandes = (ArrayList<LigneCommandeM>) commandeSelectionner.getLigneCommandes();
			for( LigneCommandeM ligneCommande : ligneCommandes){
				if ( (ligneCommande.getProduit()).equals(p) )
				ligneCommandes.remove(ligneCommande);
			}
		}
		
	}

	@Override
	public void sauvegarderCommande() {
		listeCommande.add(commandeSelectionner);
	}

	@Override
	public List<? extends Produit> listerProduit() {
		ArrayList <LigneCommandeM> ligneCommandes = (ArrayList<LigneCommandeM>) commandeSelectionner.getLigneCommandes();
		ArrayList listeProduits = new ArrayList();
		for( LigneCommandeM ligneCommande : ligneCommandes){
			listeProduits.add(ligneCommande.getProduit());
		}
		return listeProduits;
	}

	@Override
	public List<? extends Commande> listerCommandes(Client c) {
		ArrayList <CommandeM> commandesClient = new ArrayList();
		for ( CommandeM commande : listeCommande )
			if ( (commande.getClient()).equals(c) )
				commandesClient.add(commande);
		return commandesClient;
		
	}

}
