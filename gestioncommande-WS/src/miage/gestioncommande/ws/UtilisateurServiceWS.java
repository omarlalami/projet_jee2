package miage.gestioncommande.ws;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Path;

import miage.gestioncommande.api.UtilisateurService;

@Stateless
@Path("/utilisateur")
public class UtilisateurServiceWS {

	@Inject
	private UtilisateurService us;
	
	
	
	
	
}
