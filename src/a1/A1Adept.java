package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int numItems = scan.nextInt();
		String[] itemNames = new String[numItems];
		double[] itemPrices = new double[numItems];
		
		for (int i = 0; i < numItems; ++i) {
			itemNames[i] = scan.next();
			itemPrices[i] = scan.nextDouble();
		}
		
		int numCustomers = scan.nextInt();
		String[] custNames = new String[numCustomers];
		double[] custTotals = new double[numCustomers];
		
		for (int j = 0; j < numCustomers; ++j) {
			
			custNames[j] = scan.next() + " " + scan.next();
			int itemsBought = scan.nextInt();
			double total = 0.0;
			
			for (int k = 0; k < itemsBought; ++k) {
				int numOfItem = scan.nextInt();
				String itemName = scan.next();
				int itemIndex = java.util.Arrays.asList(itemNames).indexOf(itemName);
				total += numOfItem * itemPrices[itemIndex];
			}
			
			custTotals[j] = total;
			
		}	 
			
		
		
		
		scan.close();
		
	}
}
