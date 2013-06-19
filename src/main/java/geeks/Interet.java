package geeks;

import javax.persistence.*;

@Entity
public class Interet {

	@Id
	@SequenceGenerator(name = "intGenName", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	protected int id;
	protected String nom;

	@ManyToOne
	@JoinColumn(name = "idGeek", nullable = false)
	protected Geek geek;

	public Interet() {}

	public Interet(String n) {
		nom = n;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Geek getGeek() {
		return geek;
	}

	public void setGeek(Geek geek) {
		this.geek = geek;
	}
	
}
