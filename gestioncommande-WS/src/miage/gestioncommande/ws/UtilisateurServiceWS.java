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
import miage.gestioncommande.api.Responsable;
import miage.gestioncommande.api.UtilisateurService;

@Stateless
@Path("/utilisateur")
public class UtilisateurServiceWS {

	@Inject
	private UtilisateurService us;
	
	@GET
	@Path("/listerclients")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listerClients() {
		return Response.ok(us.listerClients()).build();
	}
	
	@GET
	@Path("/listerresponsable")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listerResponsable() {
		return Response.ok(us.listerResponsable()).build();
	}
	
	@POST
	@Path("/creerclient")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response creerClient(Client c) {
		us.creerClient(c);
		return Response.ok("client ajouter : OK").build();
	}
	
	@POST
	@Path("/creerresponsable")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response creerResponsable(Responsable r) {
		us.creerResponsable(r);
		return Response.ok("responsable ajouter : OK").build();
	}
}
