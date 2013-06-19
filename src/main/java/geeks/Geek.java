package geeks;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Geek {

	@Id
	@SequenceGenerator(name = "geekGenName", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	protected int id;
	protected String pseudo;
	protected String prenom;
	protected String nom;
	protected String mail;
	protected boolean male;
	@OneToMany(mappedBy = "geek")
	protected List<Interet> interets = new ArrayList<Interet>();
	
	public Geek() {
	}
	
	public Geek(String pse, String pre, String leNom, String mai, boolean mal) {
		pseudo = pse;
		prenom = pre;
		nom = leNom;
		mail = mai;
		male = mal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public List<Interet> getInterets() {
		return interets;
	}

	public void setInterets(List<Interet> interets) {
		this.interets = interets;
	}

}
