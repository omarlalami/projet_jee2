package miage.gestioncommande.coreM;

import javax.xml.bind.annotation.XmlRootElement;

import miage.gestioncommande.api.Responsable;
@XmlRootElement
public class ResponsableM extends UtilisateurM implements Responsable{

	private String numEmployee;

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Responsable#getNumEmployee()
	 */
	@Override
	public String getNumEmployee() {
		return numEmployee;
	}

	/* (non-Javadoc)
	 * @see miage.gestioncommande.coreM.Responsable#setNumEmployee(java.lang.String)
	 */
	@Override
	public void setNumEmployee(String numEmployee) {
		this.numEmployee = numEmployee;
	}
	
}
