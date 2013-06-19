package geeks;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class InteretService {

	private InteretDAO dao;

	public InteretService() {
	}

	@Autowired
	public InteretService(InteretDAO d) {
		dao = d;
	}

	public List<String> getInterets() {
		return dao.findAll();
	}

	public Interet getInteret(Long id) {
		return dao.findById(id);
	}
	
	public void creerInteret(Interet i) {
		dao.persist(i);
	}

}