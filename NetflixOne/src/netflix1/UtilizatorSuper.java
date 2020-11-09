package netflix1;

public class UtilizatorSuper extends Utilizator{

	public UtilizatorSuper(String eticheta) {
		super(eticheta);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return "Utilizator: " + eticheta;
	}
	
	private String nume;
	private String tara;
	private String mail;
	
	public String getTara() {
		return tara;
	}

	public void setTara(String tara) {
		this.tara = tara;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public String toString() {
		return "Utilizator super: " + nume + "\n" + "tara: " + tara + "\n" + "mail: " + mail + "\n";
	}
	
}
