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
		
		//Adição
		if (sel == 1) {
			System.out.println("Operação Escolhida 'Adição' ");
			System.out.println("Digite os valores");
			x.n1 = sc.nextFloat();
			x.n2 = sc.nextFloat();
			
			float res = x.adicao();
			
			System.out.println("Resultado da Adição = "+res);
			
		} 
		//Subtração
		else if (sel == 2) {
			
			System.out.println("Operação escolhida 'Subtração");
			System.out.println("Digite os valores");
			x.n1 = sc.nextFloat();
			x.n2 = sc.nextFloat();
			
			float res = x.subtração();
			
			System.out.println("Resultado da subtração = "+res);
		} 
		//Multiplicação
		else if(sel == 3) {
			
			System.out.println("Operação escolhida 'Multiplicação' ");
			System.out.println("Digite os valores");
			x.n1 = sc.nextFloat();
			x.n2 = sc.nextFloat();
			
			float res = x.multiplicação();
			
			System.out.println("Resultado da Multiplicação = "+res);
			
		}
		//Divisão
		else {
			
			System.out.println("Operação escolhida 'Divisão'");
			System.out.println("Digite os valores");
			x.n1 = sc.nextFloat();
			x.n2 = sc.nextFloat();
			
			float res = x.divisao();
			
			System.out.println("Resultado da divisão = " +res);
		}
	}

}
