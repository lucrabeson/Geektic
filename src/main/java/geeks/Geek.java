package geeks;

import java.util.Date;
import javax.persistence.*;

@Entity
public class Geek {

	@Id
	@SequenceGenerator(name = "geekGenName", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	protected int id;
	protected String pseudo;
	protected String mail;
	protected boolean male;
	@Temporal(TemporalType.TIMESTAMP)
	protected Date inscription;
	
	public Geek() {
	}
	
	public Geek(String pse, String mai, boolean mal, Date ins) {
		pseudo = pse;
		mail = mai;
		male = mal;
		inscription = ins;
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

	public Date getInscription() {
		return inscription;
	}

	public void setInscription(Date inscription) {
		this.inscription = inscription;
	}

}
