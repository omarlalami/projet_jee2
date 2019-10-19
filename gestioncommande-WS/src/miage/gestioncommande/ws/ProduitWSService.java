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










}
