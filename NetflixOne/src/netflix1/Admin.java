package netflix1;

public class Admin extends Utilizator{

	public Admin(String eticheta) {
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
		return "Admin: " + nume + "\n" + "tara: " + tara + "\n" + "mail: " + mail + "\n";
	}
	
	Film [] ListaFilmeVechi=new Film[30];
	public  int a1=0;
	
	public void addFilmVechi(Film film) {
		ListaFilmeVechi[a1++]=film;
	}
	
	private int j1=0;
    private int contor1=0;
    
    public void deleteFilmVechi(Film film) {
		for(Film fv: ListaFilmeVechi) {
			if(fv!=null && ListaFilmeVechi[contor1].equals(film)){
				j1=contor1;
				break;
				}
			contor1++;
			}	
		for(int k=j1; k<a1; k++) {
			ListaFilmeVechi[k]=ListaFilmeVechi[k+1];
			}	
		}
	
    private int contor1_1=0;
    
	public void ListFilmsVechi() {
		for(Film fv: ListaFilmeVechi) {
			if(fv!=null) {
				contor1_1++;
				System.out.println("Film vechi: " + "\n" + fv );
			}	
			else
				break;
		}
		if(contor1_1==0)
			System.out.println("Fara filme\n");
	}
	
	Film [] ListaFilmeNoi=new Film[30];
	public int b1=0;
	
	public void addFilmeNoi(Film film) {
		ListaFilmeNoi[b1++]=film;
	}
	
	private int j2=0;
    private int contor2=0;
    
    public void deleteFilmNou(Film film) {
		for(Film fn: ListaFilmeNoi) {
			if(fn!=null && ListaFilmeNoi[contor2].equals(film)){
				j2=contor2;
				break;
				}
			contor2++;
			}	
		for(int k=j2; k<b1; k++) {
			ListaFilmeNoi[k]=ListaFilmeNoi[k+1];
			}	
		}
	
    private int contor2_1=0;
    
	public void ListFilmsNoi() {
		for(Film fn: ListaFilmeNoi) {
			if(fn!=null) {
				contor2_1++;
				System.out.println("Film nou: " + "\n" + fn);
			}	
			else
				break;
		}
		if(contor2_1==0)
			System.out.println("Fara filme\n");
	}
	
	Film [] ListaFilmeRecente=new Film[30];
	public int c1=0;
	
	public void addFilmeRecente(Film film) {
		ListaFilmeRecente[c1++]=film;
	}
	
	private int j3=0;
    private int contor3=0;
    
    public void deleteFilmRecent(Film film) {
		for(Film fr: ListaFilmeRecente) {
			if(fr!=null && ListaFilmeRecente[contor3].equals(film)){
				j3=contor3;
				break;
				}
			contor3++;
			}	
		for(int k=j3; k<c1; k++) {
			ListaFilmeRecente[k]=ListaFilmeRecente[k+1];
			}	
		}
	
    private int contor3_1=0;
    
	public void ListFilmsRecente() {
		for(Film fr: ListaFilmeRecente) {
			if(fr!=null) {
				contor3_1++;
				System.out.println("Film recent: " + "\n" + fr);
			}	
			else
				break;
		}
		if(contor3_1==0)
			System.out.println("Fara filme\n");
	}
}
