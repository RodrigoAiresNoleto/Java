package app;

import java.util.Scanner;

import entidade.Modelo;

public class Programa {

	public static void main(String[] args) {
		
		
		/*
		 * Na produ��o de pe�as, uma f�brica tem um custo fixo de R$(Valor a digita)
		 * mais um custo vari�vel de R$(valor a digita) por unidade produzida.
		 * Sendo : C = custo da produ��o
		 * 		   N = numero de pe�cas produzidas
		 * 
		 *A) Determine a Lei da fun��o de primeiro grau.
		 *B) O Custo da produ��o de (Quantidade)
		 */
		// TODO Auto-generated method stub
		Modelo modelo = new Modelo();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Lei da Fun��o");
		System.out.print("Digite o valor de custo : ");
		modelo.vc = sc.nextInt();
		System.out.print("Digite o valor do custo vari�vel : ");
		modelo.cv = sc.nextInt();
		
		System.out.println("A lei da fun��o de primeiro grau � : ' C(n) = "+modelo.cv+" . n + "+modelo.vc+"'");
		

		
		System.out.print("Determine o valor para calcular a produ��o de uma determinada quantidade de pe�as : ");
		modelo.vp = sc.nextInt();
		
		modelo.res = modelo.Quantidadepecas();
		
		System.out.print("O Custo da produ��o de "+modelo.vp+" pe�a � : "+modelo.res+" Reais");
		
		
		
	}

}
