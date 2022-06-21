package jana60;

import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);

		Indirizzo indirizzo = new Indirizzo("Via Aldo Moro", "65", "Milano");
		Indirizzo indirizzo2 = new Indirizzo(indirizzo);

		Persona persona = new Persona("Giacomo", "Leopardi", indirizzo);
		Persona persona2 = new Persona("Luigi", "Pirandello", indirizzo2);

		System.out.println("Inserisci il tuo indirizzo: ");
		System.out.println("Inserisci Via: ");
		String via = scan.nextLine();
		System.out.println("Inserisci Numero Civico: ");
		String numero = scan.nextLine();
		System.out.println("Inserisci Città: ");
		String citta = scan.nextLine();

		persona2.getIndirizzo().setVia(via);
		persona2.getIndirizzo().setNumeroCivico(numero);
		persona2.getIndirizzo().setCitta(citta);

		System.out.println("Indirizzo Persona 1: " + persona.getIndirizzo());
		System.out.println("Indirizzo Persona 2: " + persona2.getIndirizzo());

		System.out.println("Inserisci la modifica dell'indirizzo: ");
		System.out.println("Inserisci il tuo indirizzo: ");
		System.out.println("Inserisci Via: ");
		String via2 = scan.nextLine();
		System.out.println("Inserisci Numero Civico: ");
		String numero2 = scan.nextLine();
		System.out.println("Inserisci Città: ");
		String citta2 = scan.nextLine();

		persona2.getIndirizzo().setVia(via2);
		persona2.getIndirizzo().setNumeroCivico(numero2);
		persona2.getIndirizzo().setCitta(citta2);

		System.out.println("Indirizzo Persona 1: " + persona.getIndirizzo());
		System.out.println("Indirizzo Persona 2: " + persona2.getIndirizzo());
		scan.close();
	}

}
