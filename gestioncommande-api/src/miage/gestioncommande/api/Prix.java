package miage.gestioncommande.api;

import java.util.Calendar;

public interface Prix {

	Long getId();

	void setId(Long id);

	Double getPrix();

	void setPrix(Double prix);

	Calendar getDateprix();

	void setDateprix(Calendar dateprix);

}