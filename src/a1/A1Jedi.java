package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int numItems = scan.nextInt();
		String[] itemNames = new String[numItems];
		double[] itemPrices = new double[numItems];
		int[] custPerItem = new int[numItems];
		int[] totalBought = new int[numItems];

		for (int i = 0; i < numItems; ++i) {
			itemNames[i] = scan.next();
			itemPrices[i] = scan.nextDouble();
			custPerItem[i] = 0;
			totalBought[i] = 0;
		}
			
		int numCustomers = scan.nextInt();
		String[] custNames = new String[numCustomers];
		double[] custTotals = new double[numCustomers];
		
		//
		for (int j = 0; j < numCustomers; ++j) {
			
			custNames[j] = scan.next() + " " + scan.next();
			int itemsBought = scan.nextInt();
			//double total = 0.0;
			
			for (int k = 0; k < itemsBought; ++k) {
				
				int numOfItem = scan.nextInt();
				String itemName = scan.next();
				int itemIndex = java.util.Arrays.asList(itemNames).indexOf(itemName);
				totalBought[itemIndex] += numOfItem;
				custPerItem[itemIndex] += 1;
				
				//total += numOfItem * itemPrices[itemIndex];
			
			}
			
			//custTotals[j] = total;
			
		}
		//
		
		for (int i = 0; i < numItems; ++i) {
			
			if (custPerItem[i] == 0) {
				System.out.println("No customers bought " + totalBought[i] + " " + itemNames[i]);
			} else {
				System.out.println(custPerItem[i] + " customers bought " + totalBought[i] + " " + itemNames[i]);
			}
			
		}		
		
		
	}
	
	static int indexOfArr(double[] arr, double key) {
	    
		int index = -1;
		
	    for (int i = 0; i < arr.length; ++i) {
	        if (key == arr[i]) {
	            index = i;
	            break;
	        }
	    }
	    
	    return index;
	    
	}	
		
}
