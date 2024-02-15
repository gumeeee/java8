package colecao.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PrimeiroExercicio {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> inteiros = new HashSet<>();
		int numero;

		System.out.print("Quantos numeros deseja digitar? ");
		int quantidadeNumeros = sc.nextInt();

		for (int i = 0; i < quantidadeNumeros; i++) {
			System.out.print("Digite um numéro: ");
			numero = sc.nextInt();

			inteiros.add(numero);
		}

		System.out.println("Listar dados do Set: \n");

		Iterator<Integer> iInteiros = inteiros.iterator();

		while (iInteiros.hasNext()) {
			System.out.println(iInteiros.next());
		}
		
		sc.close();
	}
}
