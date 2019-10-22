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

import miage.gestioncommande.api.CatalogueService;
import miage.gestioncommande.api.Prix;
import miage.gestioncommande.api.Produit;


@Stateless
@Path("/produit")
public class ProduitWSService {
	
	// a mettre en commentaire le inject pour le moment...
	@Inject
	private CatalogueService cg; 
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listerProduits() {
		return Response.ok(cg.afficherCatalogue()).build();
	}
	// utilisation sur POSTMAN
	// Get
	// http://localhost:8080/gestioncommande-WS/gestioncommande/produit/list

	@POST
	@Path("/ajoute")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response ajouterProduit(Produit p) {
		cg.ajouterProduit(p);
		return Response.ok("objet ajout avec succes").build();
	}
	// utilisation sur POSTMAN
	// POST
	// http://localhost:8080/gestioncommande-WS/gestioncommande/produit/ajout?
	// pas tres sur comment on fait pour passez un produit durant l'appel

	
	
	@POST
	@Path("/actualiserprix")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response actualiserPrix(Prix px, Produit pr) {
		cg.actualiserPrix(px,pr);
		return Response.ok("prix produit actualiser : OK").build();
	}


	@POST
	@Path("/rechercherproduit")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response rechercherProduit(Long id) {
		return Response.ok(cg.rechercherProduit(id)).build();
	}

	@POST
	@Path("/supprimerproduit")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response supprimerProduit(Long id) {
		cg.supprimerProduit(id);
		return Response.ok("produit supprimer: OK").build();
	}
	
	
	@POST
	@Path("/recupererprix")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response recupererPrix(Produit p) {
		return Response.ok(cg.recupererPrix(p)).build();
	}
	

}
