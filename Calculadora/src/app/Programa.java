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
		
		//Adi��o
		if (sel == 1) {
			System.out.println("Opera��o Escolhida 'Adi��o' ");
			System.out.println("Digite os valores");
			x.n1 = sc.nextFloat();
			x.n2 = sc.nextFloat();
			
			float res = x.adicao();
			
			System.out.println("Resultado da Adi��o = "+res);
			
		} 
		//Subtra��o
		else if (sel == 2) {
			
			System.out.println("Opera��o escolhida 'Subtra��o");
			System.out.println("Digite os valores");
			x.n1 = sc.nextFloat();
			x.n2 = sc.nextFloat();
			
			float res = x.subtra��o();
			
			System.out.println("Resultado da subtra��o = "+res);
		} 
		//Multiplica��o
		else if(sel == 3) {
			
			System.out.println("Opera��o escolhida 'Multiplica��o' ");
			System.out.println("Digite os valores");
			x.n1 = sc.nextFloat();
			x.n2 = sc.nextFloat();
			
			float res = x.multiplica��o();
			
			System.out.println("Resultado da Multiplica��o = "+res);
			
		}
		//Divis�o
		else {
			
			System.out.println("Opera��o escolhida 'Divis�o'");
			System.out.println("Digite os valores");
			x.n1 = sc.nextFloat();
			x.n2 = sc.nextFloat();
			
			float res = x.divisao();
			
			System.out.println("Resultado da divis�o = " +res);
		}
	}

}
