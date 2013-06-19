package geeks;

import java.util.List;

import javax.persistence.*;

import org.springframework.stereotype.Repository;

@Repository
public class GeekDAO {

	@PersistenceContext
	protected EntityManager em;

	public GeekDAO() {}
	public GeekDAO(EntityManager em) {
		this.em = em;
	}

	public List<Geek> findAll() {
		return em.createQuery("SELECT geek FROM Geek geek order by geek.pseudo", Geek.class).getResultList();
	}

	public void persist(Geek geek) {
		em.persist(geek);
	}

	public Geek findById(int id) {
		return em.find(Geek.class, id);

	}
	
}
