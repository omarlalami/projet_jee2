package miage.gestioncommande.ws;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.Path;

import miage.gestioncommande.api.CommandeService;

@Stateless
@Path("/commande")
public class CommandeServiceWS {

	@Inject
	private CommandeService cs;
	
	
	
	
}
