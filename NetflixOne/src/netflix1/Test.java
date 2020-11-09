package netflix1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//4.a
		Netflix platforma=new Netflix();
		
		UtilizatorBasic basic=new UtilizatorBasic("Simple");
		UtilizatorPlus plus=new UtilizatorPlus("Better");
		UtilizatorSuper sup=new UtilizatorSuper("Best");
		Admin admin=new Admin("Admin");
		
		//4.b
		System.out.println("adaugare utilizatori:");
		platforma.add(basic);
		platforma.add(plus);
		platforma.add(sup);
		platforma.add(admin);
		platforma.listUtilizatori();
		
		//4.c
		System.out.println("adaugare profile:");
		basic.addProfil("b1");
		basic.ListProfiles(1);//se va afisa maxim un profil
		
		plus.addProfil("p1");
		plus.addProfil("p2");
		plus.ListProfiles(2);//se vor afisa maxim 2 profile
		
		sup.addProfil("s1");
		sup.addProfil("s2");
		sup.addProfil("s3");
		sup.addProfil("s4");
		sup.ListProfiles(4);//se vor afisa maxim 4 profile
		
		//4.d
		System.out.println("adaugare filme:");
		Film f1=new Film();
		f1.setNume("Titanic");
		f1.setDescriere("drama");
	
		platforma.addFilmVechi(f1);
		
		Film f2=new Film();
		f2.setNume("Superman");
		f2.setDescriere("actiune");
		
		platforma.addFilmVechi(f2);
		platforma.ListFilmsVechi();
		
		Film f3=new Film();
		f3.setNume("Deadpool");
		f3.setDescriere("actiune");
		
		platforma.addFilmeNoi(f3);
		
		Film f4=new Film();
		f4.setNume("Conjuring");
		f4.setDescriere("horror");
		
		platforma.addFilmeNoi(f4);
		platforma.ListFilmsNoi();
		
		Film f5=new Film();
		f5.setNume("Avengers");
		f5.setDescriere("SF");
		
		platforma.addFilmeRecente(f5);
		
		Film f6=new Film();
		f6.setNume("Silence");
		f6.setDescriere("horror");
		
		platforma.addFilmeRecente(f6);
		platforma.ListFilmsRecente();
		
	    //5
		System.out.println("info utilizatori:");
		basic.setNume("Andu");
		basic.setMail("anduion");
		basic.setTara("Romania");
		System.out.println(basic.toString());
		Profil b1=new Profil();
		b1.setProfil("profil1");
		System.out.println(b1.getProfil());
	    b1.addFilm(f1);
	    b1.addFilm(f2);
	    b1.ListFilms();
	    
	    plus.setNume("Marian");
	    plus.setMail("marianstate");
	    plus.setTara("Anglia");
	    System.out.println(plus.toString());
		Profil p1=new Profil();
		p1.setProfil("profil1");
		System.out.println(p1.getProfil());
		p1.addFilm(f3);
		p1.addFilm(f4);
		p1.ListFilms();
		Profil p2=new Profil();
		p2.setProfil("profil2");
		System.out.println(p2.getProfil());
		p2.ListFilms();
		
		sup.setNume("Matei");
	    sup.setMail("marianmatei");
	    sup.setTara("Italia");
	    System.out.println(sup.toString());
		Profil s1=new Profil();
		s1.setProfil("profil1");
		System.out.println(s1.getProfil());
		s1.addFilm(f5);
		s1.addFilm(f6);
		s1.ListFilms();
		Profil s2=new Profil();
		s2.setProfil("profil2");
		System.out.println(s2.getProfil());
		s2.addFilm(f5);
		s2.addFilm(f6);
		s2.ListFilms();
		Profil s3=new Profil();
		s3.setProfil("profil3");
		System.out.println(s3.getProfil());
		s3.addFilm(f6);
		s3.addFilm(f5);
		s3.ListFilms();
		Profil s4=new Profil();
		s4.setProfil("profil4");
		System.out.println(s4.getProfil());
		s4.addFilm(f5);
		s4.addFilm(f6);
		s4.ListFilms();
		
		Film f7=new Film();
		f7.setNume("Batman");
		f7.setDescriere("actiune");
		
		Film f8=new Film();
		f8.setNume("Omul Furnica");
		f8.setDescriere("SF");
		
		Film f9=new Film();
		f9.setNume("Paul");
		f9.setDescriere("comedie");
		
		//6
		System.out.println("adaugare filme de admini:");
		admin.addFilmVechi(f7);
		admin.ListFilmsVechi();
		admin.addFilmeNoi(f8);
		admin.ListFilmsNoi();
		admin.addFilmeRecente(f9);
		admin.ListFilmsRecente();
		
		//7
		System.out.println("log in:");
		basic.find=0;
		basic.LogIn("p1");
		plus.find=0;
		plus.LogIn("p2");
		sup.find=0;
		sup.LogIn("s3");
		sup.find=0;
		sup.LogIn("r4");
		
		System.out.println("\nadaugare profil:");
		basic.addProfil("p2");
		basic.ListProfiles(3);
		
		System.out.println("stergere profil:");
		sup.deleteProfil("s2");
		sup.ListProfiles(4);
		
		//simulare vizionare film pt utilizator basic
		System.out.println("vizionare film:");
		basic.find=0;
		basic.viewFilm(b1, f2);
		
		System.out.println("simulare stergere film de admin:");
		admin.addFilmeNoi(f3);
		platforma.deleteFilmNou(admin.ListaFilmeNoi[admin.b1-1]);//simulare stergere film utilizator plus de catre admin 
		//admin.deleteFilmNou(f3);
		platforma.ListFilmsNoi();
		
		
		//8
		System.out.println("filme utilizatori dupa adaugare de admin:");
		for(int i=0; i<=admin.a1; i++)
			platforma.addFilmVechi(admin.ListaFilmeVechi[i]);
		platforma.ListFilmsVechi();;
		
		for(int i=0; i<=admin.b1; i++)
			platforma.addFilmeNoi(admin.ListaFilmeNoi[i]);
		platforma.ListFilmsNoi();;
		
		for(int i=0; i<=admin.c1; i++)
			platforma.addFilmeRecente(admin.ListaFilmeRecente[i]);
		platforma.ListFilmsRecente();
		
		//9
		System.out.println("afisare film:");
		String nume;
		Scanner in = new Scanner(System.in);
		System.out.println("Care e numele filmului?");
		nume=in.nextLine();
		System.out.println("Film: " + nume);
		for(int i=0; i<platforma.a; i++) {
			if(platforma.ListaFilmeVechi[i]!=null && platforma.ListaFilmeVechi[i].getNume().equals(nume)) {
				System.out.println(basic.toString());
				break;
				}
		if(platforma.ListaFilmeNoi[i]!=null && platforma.ListaFilmeNoi[i].getNume().equals(nume)) {
					System.out.println(plus.toString());
					break;
				}
		if(platforma.ListaFilmeRecente[i]!=null && platforma.ListaFilmeRecente[i].getNume().equals(nume)) {
					System.out.println(sup.toString());
					break;
				}
		}
		
		//10
		System.out.println("afisare filme super:");
		s1.ListFilms();
		s2.ListFilms();
		s3.ListFilms();
		s4.ListFilms();
	}
}
