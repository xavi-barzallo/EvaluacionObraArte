package ec.ups.edu.eva.bean;

import java.util.List;

import javax.inject.Inject;
import javax.jws.WebService;


import ec.ups.edu.eva.business.ObraONLocal;
import ec.ups.edu.eva.model.obra;

@WebService
public class ObrasServiceSOAP {

	@Inject
	private ObraONLocal obrasON;
	
	private obra obraA= new obra();
	
	public String crearContacto (obra obra) {
		try {
			obrasON.guardar(obra);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return "ERROR";
		}
		return "Se ha Guardado Persona";
	}
	
	
	public List<obra> getContactos(){
		
		return obrasON.getClientes();
	}
	
	
	
	
}
