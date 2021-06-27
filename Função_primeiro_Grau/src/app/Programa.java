package app;

import java.util.Scanner;

import entidade.Modelo;

public class Programa {

	public static void main(String[] args) {
		
		
		/*
		 * Na produção de peças, uma fábrica tem um custo fixo de R$(Valor a digita)
		 * mais um custo variável de R$(valor a digita) por unidade produzida.
		 * Sendo : C = custo da produção
		 * 		   N = numero de peçcas produzidas
		 * 
		 *A) Determine a Lei da função de primeiro grau.
		 *B) O Custo da produção de (Quantidade)
		 */
		// TODO Auto-generated method stub
		Modelo modelo = new Modelo();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Lei da Função");
		System.out.print("Digite o valor de custo : ");
		modelo.vc = sc.nextInt();
		System.out.print("Digite o valor do custo variável : ");
		modelo.cv = sc.nextInt();
		
		System.out.println("A lei da função de primeiro grau é : ' C(n) = "+modelo.cv+" . n + "+modelo.vc+"'");
		

		
		System.out.print("Determine o valor para calcular a produção de uma determinada quantidade de peças : ");
		modelo.vp = sc.nextInt();
		
		modelo.res = modelo.Quantidadepecas();
		
		System.out.print("O Custo da produção de "+modelo.vp+" peça é : "+modelo.res+" Reais");
		
		
		
	}

}
