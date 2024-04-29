package practicaGit;

import java.util.Scanner;

public class PracticaGit {

	public static void main(String[] args ) {
		//cuando creas el scanner se pone el system.in
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un nombre");
		String nombre = scan.nextLine();
		System.out.println(nombre + ", estas creando el primer repositorio");
	}
}
