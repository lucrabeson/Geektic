package geeks;

import java.util.ArrayList;
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

	public List<Geek> getGeeksLikePseudo(String pseudo) {
		List<Geek> list = new ArrayList<>();
		for(Geek geek : dao.findAll()){
			if(geek.pseudo.toLowerCase().contains(pseudo.toLowerCase()))
				list.add(geek);
		}
		return list;
	}

	public List<Geek> getGeeksLikeNom(String nom) {
		List<Geek> list = new ArrayList<>();
		for(Geek geek : dao.findAll()){
			if(geek.nom.toLowerCase().contains(nom.toLowerCase()))
				list.add(geek);
		}
		return list;
	}

	public List<Geek> getGeeksLikeMail(String mail) {
		List<Geek> list = new ArrayList<>();
		for(Geek geek : dao.findAll()){
			if(geek.mail.toLowerCase().contains(mail.toLowerCase()))
				list.add(geek);
		}
		return list;
	}

	public List<Geek> getGeeksWithInteret(String interet) {
		List<Geek> list = new ArrayList<>();
		for(Geek geek : dao.findAll()){
			for(Interet interetGeek : geek.interetList){
				if(interetGeek.nom.toLowerCase().contains(interet.toLowerCase())){
					list.add(geek);
					break;
				}
			}
				
		}
		return list;
	}

	public Geek getGeek(int id) {
		return dao.findById(id);
	}

	public void creerGeek(Geek g) {
		dao.persist(g);
	}
	
	public List<Geek> getGeeksCategory(String category, String value, String sex) {
		List<Geek> list = new ArrayList<>();
		if(category.equals("pseudo"))
			list = getGeeksLikePseudo(value);
		else if(category.equals("nom"))
			list = getGeeksLikeNom(value);
		else if(category.equals("mail"))
			list = getGeeksLikeMail(value);
		else if(category.equals("intérêts"))
			list = getGeeksWithInteret(value);
		else
			return null;
		
		if(sex.equals("pas une carte mère"))
			return list;
		
		List<Geek> retour = new ArrayList<>();
		if(sex.equals("un homme")){
			for(Geek geek : list){
				if(geek.male)
					retour.add(geek);
			}
		}else if(sex.equals("une femme")){
			for(Geek geek : list){
				if(!geek.male)
					retour.add(geek);
			}
		}
		return retour;
	}
}
