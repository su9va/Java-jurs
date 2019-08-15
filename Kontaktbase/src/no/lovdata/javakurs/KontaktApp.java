package no.lovdata.javakurs;

import java.util.Scanner;

public class KontaktApp {

	public KontaktApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kontakt nyKontakt = new Kontakt();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("1. Legg til ny kontakt");
			System.out.println("2. Vis alle kontakter");
			System.out.println("3. Søk etter kontakt");
			System.out.println("q. Avslutt");
			
			String valg = sc.nextLine();
			
			if (valg.equals("q")) {
			System.out.println("Farvel...");
			break;
			} else if (valg.equals("1")) {
			
			System.out.println("Kontaktens fornavn:");	
			nyKontakt.setFornavn(sc.nextLine());
			
			System.out.println("Kontaktens etternavn:");	
			nyKontakt.setEtternavn(sc.nextLine());
			
			System.out.println("Kontaktens epost:");	
			nyKontakt.setEpost(sc.nextLine());
			
			System.out.println("Kontaktens telefonnummer:");	
			nyKontakt.setTelefon(sc.nextLine());
			
			nyKontakt.lagre();
			
			} else if (valg.equals("2")) {
				
				
			} else if (valg.equals("3")) {
				
				
			} else {
				System.out.println("Du må taste inn 1, 2, 3 eller q");
			
		}
			
		
		
	
		
	}
		
		sc.close();
		
	}

}
