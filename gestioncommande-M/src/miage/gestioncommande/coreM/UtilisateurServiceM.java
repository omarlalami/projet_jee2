package miage.gestioncommande.coreM;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Singleton;

import miage.gestioncommande.api.Client;
import miage.gestioncommande.api.Responsable;
import miage.gestioncommande.api.UtilisateurService;

@Singleton
@Local(UtilisateurService.class)
public class UtilisateurServiceM implements UtilisateurService {

	private List<Client> listeClient;
	private List<Responsable> listeResponsable;

	
	@PostConstruct
	public void initialiser() {
		
		listeClient = new ArrayList<Client>();
		listeResponsable = new ArrayList<Responsable>();
		
		Client c1 = new ClientM();	
		Client c2 = new ClientM();
		Responsable r1 = new ResponsableM();
		Responsable r2 = new ResponsableM();
		
		listeClient.add(c1);
		listeClient.add(c2);
		listeResponsable.add(r1);
		listeResponsable.add(r2);
	}
	
	@Override
	public List<? extends Client> listerClients() {
		return listeClient;
	}

	@Override
	public List<? extends Responsable> listerResponsable() {
		return listeResponsable;
	}

	@Override
	public void creerClient(Client c) {
		listeClient.add(c);
	}

	@Override
	public void creerResponsable(Responsable r) {
		listeResponsable.add(r);
	}

}
