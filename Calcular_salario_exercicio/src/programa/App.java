package programa;

import java.util.Locale;
import java.util.Scanner;

import entidade.Modelo;

public class App {
    public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);
            Modelo modelo = new Modelo();

            System.out.print("Nome :");
            modelo.Nome = sc.nextLine();

            System.out.println("Salario Bruto");
            modelo.SalarioBruto = sc.nextDouble();

            System.out.println("Imposto");
            modelo.imposto = sc.nextDouble();
            System.out.println("--------------------------");

            System.out.println("Salario Liguido do empregado :"+modelo.calSalario());
            System.out.println("--------------------------");

            System.out.println("Porcentagem do aumento salarial :");
            modelo.porc = sc.nextDouble();
            

            System.out.println(modelo.aumentoSalario());
            sc.close();

        }
}
