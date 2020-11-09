package netflix1;

public class Film {
	private String nume;
	private String descriere;
	
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getDescriere() {
		return descriere;
	}
	public void setDescriere(String descriere) {
		this.descriere = descriere;
	}
	
	public String toString() {
		return "Nume: " + nume + "\n" + "Descriere: " + descriere + "\n";
	}
}
