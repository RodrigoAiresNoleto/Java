package app;

import java.util.Scanner;

import entidade.Modelo;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Modelo x = new Modelo();
		
		System.out.println("Digite 1-Adi��o | 2-Subtra��o | 3- Multiplica��o | 4-Divis�o");
		int sel = sc.nextInt();
		
		if (sel == 1) {
			System.out.println("Opera��o Escolhida 'Adi��o' ");
			System.out.println("Digite os valores");
			x.n1 = sc.nextFloat();
			x.n2 = sc.nextFloat();
			
			float res = x.adicao();
			
			System.out.println("Resultado da Adi��o = "+res);
			
		} else if (sel == 2) {
			
			System.out.println("Opera��o escolhida 'Subtra��o");
			System.out.println("Digite os valores");
			x.n1 = sc.nextFloat();
			x.n2 = sc.nextFloat();
			
			float res = x.subtra��o();
			
			System.out.println("Resultado da subtra��o = "+res);
		} else {

		} {

		}
	}

}
