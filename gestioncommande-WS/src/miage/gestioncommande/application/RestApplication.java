package miage.gestioncommande.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import miage.gestioncommande.ws.ProduitWSService;

@ApplicationPath("/gestioncommande")
public class RestApplication extends Application{
	
	@Override
	public Set<Class<?>> getClasses(){
		Set<Class<?>> classSet = new HashSet<>();
		classSet.add(ProduitWSService.class);
		
		return classSet;
	} 

}
