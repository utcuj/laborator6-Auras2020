package netflix1;

public class Netflix {
	Utilizator [] utilizatori=new Utilizator[30];
	private int i=0;
	private int j=0;
    private int contor=0;
	
	public void add(Utilizator utilizator) {
		utilizatori[i++]=utilizator;
	}
	
	public void sub(Utilizator utilizator) {
		for(Utilizator u: utilizatori) {
			if(u!=null && utilizatori[contor].equals(utilizator)){
				j=contor;
				break;
				}
			contor++;
			}	
		for(int k=j; k<i; k++) {
			utilizatori[k]=utilizatori[k+1];
			}	
		}
	
	public void listUtilizatori() {
		for(Utilizator u: utilizatori) {
			if(u!=null)
				System.out.println(u.getNume());
			else
				break;
			}
		System.out.println();
		}
	
	Film [] ListaFilmeVechi=new Film[30];
	public int a=0;
	
	public void addFilmVechi(Film film) {
		ListaFilmeVechi[a++]=film;
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
		for(int k=j1; k<a; k++) {
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
	public int b=0;
	
	public void addFilmeNoi(Film film) {
		ListaFilmeNoi[b++]=film;
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
		for(int k=j2; k<b; k++) {
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
	public int c=0;
	
	public void addFilmeRecente(Film film) {
		ListaFilmeRecente[c++]=film;
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
		for(int k=j3; k<c; k++) {
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
