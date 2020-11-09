package netflix1;

public abstract class Utilizator{
	
	String eticheta;
	
	public abstract String getNume();
	
	public Utilizator(String eticheta) {
		this.eticheta=eticheta;
	}
	private String [] ListaProfile=new String[30];
	private int contor=0; 
    private int j=0;
	
	public void addProfil(String profil) {
		ListaProfile[j++]=profil;
	}
	
	private int contor1=0;
	private int q=0;
	
	public void deleteProfil(String profil) {
		for(String s: ListaProfile) {
			if(s!=null && ListaProfile[contor1].equals(profil)){
				q=contor1;
				break;
				}
			contor1++;
			}	
		for(int k=q; k<j; k++) {
			ListaProfile[k]=ListaProfile[k+1];
			}	
	}
	
	public void ListProfiles(int nr) {
		for(String p: ListaProfile) {
			if(p!=null) {
				contor++;
				System.out.println("Profil: " + p);
				if(contor==nr)
					break;
			}	
			else 
				break;
		}
		System.out.println();
	}
	
	public int find=0;
	
	public void LogIn(String x) {
		for(String p: ListaProfile) {
			if(p!=null && p.equals(x)){
				find=1;
				System.out.println(x);
				break;
			}
		}
		if(find==0)
			System.out.println("profilul nu exista");
	}
	
	public void viewFilm(Profil profi, Film film) {
		for(Film f: profi.ListaFilme) {
			if(f!=null && f.equals(film)) {
				find=1;
				System.out.println(film);
				break;
			}
		}
		if(find==0)
			System.out.println("filmul nu se afla in profilul selectat");
	}
}
