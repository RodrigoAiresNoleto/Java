package app;

import java.util.Scanner;

import entidade.Modelo;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Modelo x = new Modelo();
		
		System.out.println("Digite 1-Adição | 2-Subtração | 3- Multiplicação | 4-Divisão");
		int sel = sc.nextInt();
		
		if (sel == 1) {
			System.out.println("Operação Escolhida 'Adição' ");
			System.out.println("Digite os valores");
			x.n1 = sc.nextFloat();
			x.n2 = sc.nextFloat();
			
			float res = x.adicao();
			
			System.out.println("Resultado da Adição = "+res);
			
		} else if (sel == 2) {
			
			System.out.println("Operação escolhida 'Subtração");
			System.out.println("Digite os valores");
			x.n1 = sc.nextFloat();
			x.n2 = sc.nextFloat();
			
			float res = x.subtração();
			
			System.out.println("Resultado da subtração = "+res);
		} else {

		} {

		}
	}

}
