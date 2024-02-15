package colecao.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrimeiroExercicio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int vezesDigitar;
		String corDigitada;

		ArrayList<String> cores = new ArrayList<>();

		System.out.print("Quantas cores deseja digitar? ");
		vezesDigitar = sc.nextInt();

		for (int i = 0; i < vezesDigitar; i++) {
			System.out.print("Digite um cor: ");
			corDigitada = sc.next();

			cores.add(corDigitada);
		}

		System.out.println("Listar todas as cores: ");
		
		System.out.println("");
		
		for (String cor : cores) {
			System.out.println(cor);
		}

		System.out.println(" ");

		Collections.sort(cores);

		System.out.println("Ordenar cores: ");

		System.out.println(" ");

		for (String cor : cores) {
			System.out.println(cor);
		}

		sc.close();

	}

}
