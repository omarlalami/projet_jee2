package miage.gestioncommande.ws;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import miage.gestioncommande.api.Client;
import miage.gestioncommande.api.Commande;
import miage.gestioncommande.api.CommandeService;
import miage.gestioncommande.api.Produit;

@Stateless
@Path("/commande")
public class CommandeServiceWS {

	@Inject
	private CommandeService cs;
	
	@GET
	@Path("/listecommande")
	@Produces(MediaType.APPLICATION_JSON)
	public Response rechercherCommande() {
		return Response.ok(cs.rechercherCommande()).build();
	}
	
	
	@POST
	@Path("/livrercommande")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response livrerCommande(Commande c) {
		cs.livrerCommande(c);
		return Response.ok("commande livrer : OK").build();
	}
	
	
	@POST
	@Path("/creercommande")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response creerCommande(Client c) {
		return Response.ok(cs.creerCommande(c)).build();
	}	
	

	
	@POST
	@Path("/selectionnercommande")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response selectionnerCommande(Commande c) {
		cs.selectionnerCommande(c);
		return Response.ok("commande selectionner : OK").build();
	}	
	

	
	
	@POST
	@Path("/ajouterproduit")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response ajouterProduit(Produit p) {
		cs.ajouterProduit(p);
		return Response.ok("produit ajouter : OK").build();
	}	
	
	
	
	
	@POST
	@Path("/supprimerproduit")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response supprimerProduit(Produit p) {
		cs.supprimerProduit(p);
		return Response.ok("produit supprimer : OK").build();
	}	



	
	@GET
	@Path("/sauvegardercommande")
	public Response sauvegarderCommande() {
		cs.sauvegarderCommande();
		return Response.ok("commande sauvegarder : OK").build();
	}	
	
	
	
	@GET
	@Path("/listerproduit")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listerProduit() {
		return Response.ok(cs.listerProduit()).build();
	}
	
	
	
	@POST
	@Path("/listerCommandes")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response listerCommandes(Client c) {
		return Response.ok(cs.listerCommandes(c)).build();
	}
	
}
