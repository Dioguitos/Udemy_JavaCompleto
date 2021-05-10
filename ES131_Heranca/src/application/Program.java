package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data:");
			
			System.out.print("Common, Used or Imported (c/u/i)? ");
			char c = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			
			switch (c) {
			case 'c': 
				list.add(new Product(name, price));
				break;
			case 'i':
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
				break;
			case 'u':
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureData = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, manufactureData));
				break;
			default:
				System.out.println("Valor inválido, considerando simples produto!");
				list.add(new Product(name, price));
				break;
			}
			
		}
		
		sc.close();
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for (Product p : list) {
			System.out.println(p.priceTag());
		}
		
	}

}
