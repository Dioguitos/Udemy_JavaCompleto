package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuintes> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char c = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String nome = sc.nextLine();
			
			System.out.print("Anual Income: ");
			Double rendaAnual = sc.nextDouble();
			
			switch (c) {
				case 'i':
					System.out.print("Health expenditures: ");
					Double gastosSaude = sc.nextDouble();
					list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
					break;
				
				case 'c':
					System.out.print("Number of employees: ");
					Integer nFuncionarios = sc.nextInt();
					list.add(new PessoaJuridica(nome, rendaAnual, nFuncionarios));
					break;
					
				default:
					System.out.println("Invalid value, cadastring an Individual");
					System.out.print("Health expenditures: ");
					Double gastosSaude1 = sc.nextDouble();
					list.add(new PessoaFisica(nome, rendaAnual, gastosSaude1));
					break;
				}
		}
		
		sc.close();
		
		System.out.println();
		System.out.println("TAXES PAID");
		
		double sum = 0.0;
		for (Contribuintes c : list) {
			System.out.println(c.toString());
			sum += c.imposto();
		}
		
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f%n", sum);
		
		}

}
