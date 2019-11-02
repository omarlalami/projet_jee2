package miage.gestioncommande.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import miage.gestioncommande.ws.CommandeServiceWS;
import miage.gestioncommande.ws.ProduitWSService;
import miage.gestioncommande.ws.UtilisateurServiceWS;

@ApplicationPath("/gestioncommande")
public class RestApplication extends Application{
	
	@Override
	public Set<Class<?>> getClasses(){
		Set<Class<?>> classSet = new HashSet<>();
		classSet.add(ProduitWSService.class);
		classSet.add(UtilisateurServiceWS.class);
		classSet.add(CommandeServiceWS.class);
		
		return classSet;
	} 

}
