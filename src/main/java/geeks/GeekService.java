package geeks;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class GeekService {

	private GeekDAO dao;

	public GeekService() {}
	@Autowired
	public GeekService(GeekDAO d) {
		dao = d;
	}

	public List<Geek> getGeeks() {
		return dao.findAll();
	}

	public Geek getGeek(Long id) {
		return dao.findById(id);
	}

	public void creerGeek(Geek g) {
		dao.persist(g);
	}
}
