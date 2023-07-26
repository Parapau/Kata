package cataCompeti;

import java.util.Scanner;

//Es tracta de crear un generador de passwords. L'usuari ha d'indicar la mida del password i el programa ha de generar i mostrar
//per pantalla el password corresponent. El password pot contenir: minúscules, majúscules, números i aquests símbols: 
//('!','@','#','$','%','^','&','*','(',')','{','}','[',']','=','<','>')
//
//Hay que subirlo a GitHub y pasar el enlace al mentor por Discord.
//
//Buena suerte!

public class Main {
	static Scanner entrada = new Scanner (System.in);
	public static void main (String args[]) {
		String pass = "", msg = "siusplau introdueix la llargada dessitjada";
		char lletra = 0;
		int llarg = 0, rand = 0;

		System.out.println(msg);
		llarg = numeros();
		for (int i = 0; i < llarg; i++){
			lletra = (char) ascii();
			pass += lletra;
		}
		System.out.println(pass);

	}





	public static int ascii() {
		int rand = (int)Math.floor(Math.random() * 93);
		rand += 33;
		return rand;
	}



	public static int numeros (){
		int opcio = 0;
		boolean numeros;
		do {
			try {
				opcio = Integer.parseInt(entrada.nextLine());
				numeros = true;
			}
			catch (java.lang.NumberFormatException e) {
				System.err.println("Aixo no es un numero.");
				numeros = false;
			}
		} while (!numeros);
		return opcio;
	}
}
