package netflix1;

public class Profil{
	private String profil;
	
    public String getProfil() {
		return "Profil: " + profil;
	}

	public void setProfil(String profil) {
		this.profil = profil;
	}
	
	public Film [] ListaFilme=new Film[30];
	private int i=0;
	
	public void addFilm(Film film) {
		ListaFilme[i++]=film;
	}
	
    private int contor1_1=0;
    
	public void ListFilms() {
		for(Film f: ListaFilme) {
			if(f!=null) {
				contor1_1++;
				System.out.println("Film: " + "\n" + f );
			}	
			else
				break;
		}
		if(contor1_1==0)
			System.out.println("Fara filme\n");
	}
}
