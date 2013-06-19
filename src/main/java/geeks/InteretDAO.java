package geeks;

import java.util.List;
import javax.persistence.*;
import org.springframework.stereotype.Repository;

@Repository
public class InteretDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	public InteretDAO(){}

	public InteretDAO(EntityManager em) {
		this.em = em;
	}
	
	@SuppressWarnings("unchecked")
	public List<String> findAll() {
		return em.createQuery("SELECT distinct interet.nom FROM Interet i").getResultList();
	}
	
	public void persist(Interet interet) {
		em.persist(interet);
	}
	
	public Interet findById(Long id) {
		return em.find(Interet.class, id);
	}

}