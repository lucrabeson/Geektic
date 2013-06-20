package geeks;

import java.util.*;
import javax.persistence.*;

@Entity
public class Interet {

	@Id
	@SequenceGenerator(name = "intGenName", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	protected String nom;
	
	@ManyToMany(
			cascade={CascadeType.PERSIST,
					CascadeType.MERGE,
					CascadeType.REFRESH})
	@JoinTable(
			name="GeekInteret",
			joinColumns=@JoinColumn(name="nomInteret"),
			inverseJoinColumns=@JoinColumn(name="idGeek"))
	protected List<Geek> geekList = new ArrayList<>();

	public Interet() {}

	public Interet(String n) {
		nom = n;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Geek> getGeekList() {
		return geekList;
	}

	public void setGeekList(List<Geek> geekList) {
		this.geekList = geekList;
	}
	
}
