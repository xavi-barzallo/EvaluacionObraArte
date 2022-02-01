package ec.ups.edu.eva.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;


import ec.ups.edu.eva.dao.ObraDAO;
import ec.ups.edu.eva.model.obra;


@Stateless
public class ObraON implements  ObraONLocal {

	@Inject
	private ObraDAO daoObra;
	
	public void insertar (obra o) throws Exception {
		daoObra.insert(o);
	}
	
	
	public void guardar(obra o) throws Exception {
		if(daoObra.read(o.getCodigo())==null)
			daoObra.insert(o);
		else
			daoObra.update(o);
	}

	
	public List<obra> getClientes(){
		return daoObra.getList();
	}
	
	public obra getCliente(String codigo) {
		return daoObra.read(codigo);
	}

	
	public obra getBuscarP(String codigo) {
		return daoObra.getPersona(codigo);
	}
}
