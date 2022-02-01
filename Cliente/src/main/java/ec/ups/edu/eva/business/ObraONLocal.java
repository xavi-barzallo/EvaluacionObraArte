package ec.ups.edu.eva.business;

import java.util.List;

import javax.ejb.Local;


import ec.ups.edu.eva.model.obra;


@Local
public interface ObraONLocal {

	public void insertar (obra o) throws Exception;
	public List<obra> getClientes();
	
	public obra getBuscarP(String codigo) ;
	
	public void guardar(obra o) throws Exception;
	
	public obra getCliente(String codigo);
}
