package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numCustomers = scan.nextInt();
		
		for (int i = 0; i < numCustomers; ++i) {
			
			String name = scan.next().charAt(0) + ". " + scan.next();
			int numItems = scan.nextInt();
			
			double total = 0.0;		
			for (int j = 0; j < numItems; ++j) {	
				int quantity = scan.nextInt();
				scan.next();
				double price = scan.nextDouble();
				total += price * quantity;
			}
			
			System.out.println(name + ": " + String.format("%.2f", total));
			
		}
		
	}
}
