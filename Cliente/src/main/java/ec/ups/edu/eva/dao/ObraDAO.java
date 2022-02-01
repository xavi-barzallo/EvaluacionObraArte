package ec.ups.edu.eva.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.ups.edu.eva.model.obra;



@Stateless
public class ObraDAO {

	@PersistenceContext
	private EntityManager em;
	public void insert(obra ob) {
		em.persist(ob);
	}
	
	public void update(obra ob) {
		em.merge(ob);
	}
	
	public obra read (String codigo) {
		obra ob = em.find(obra.class, codigo);
		return ob;
	}
	
	public void delete (int id) {
		obra ob = em.find(obra.class, id);
		em.remove(ob);
	}
	
	public List<obra> getList(){
		List<obra> listado = new ArrayList<obra>();
		//Se consalta a las entidades que estan dentro de mi paquete modelo
		String jpql = "SELECT ob FROM obra ob";
		
		Query query = em.createQuery(jpql, obra.class);
		
		listado = query.getResultList();
		
		//JPQL -> SQL
		
		
		return listado;
	}
	
	
	public obra getPersona(String codigo){
		obra obr = new obra();
		//Se consalta a las entidades que estan dentro de mi paquete modelo
		String jpql = "SELECT pe FROM Persona pe"
				+ " WHERE cedula= ?1";
		
		Query query = em.createQuery(jpql, obra.class);
		
		query.setParameter(1, codigo);
		
		obr = (obra) query.getSingleResult();
		
		//JPQL -> SQL
		
		
		return obr;
	}
}
