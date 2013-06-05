package java;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeekService{
	
	public GeekDAO dao;
	
	@Autowired
	public GeekService(GeekDAO dao) {
		this.dao = dao;
	}
	
	public List<String> trouver(String chaine){
		
		List<String> s = dao.lire();
		List<String> retour = new ArrayList<>();
		for(String str: s){
			if(str.contains(chaine)){
				retour.add(str);
			}
		}
		
		return retour;
	}

	public boolean creer(String chaine){

		boolean flag = true;
		for(String str: dao.lire()){
			if(str.equals(chaine)){
				flag = false;
				break;
			}
		}
		
		if(flag)
			dao.creerGeek(chaine);
		
		return flag;
	}
}
