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
		
		//System.out.print(custNames);
		
		double maxAmount = max(custTotals);
		//int maxSpenderIndex = java.util.Arrays.asList(custTotals).indexOf(maxAmount);
		int maxSpenderIndex = 0;
		//int maxSpenderIndex = custTotals.indexOf(maxAmount);
		System.out.println("Biggest: " + custNames[maxSpenderIndex] + " (" + maxAmount + ")");
		
		scan.close();
		
	}
	
	static double min(double[] arr) {
		
		double min = arr[0];
		
		for (int i = 1; i < arr.length; ++i) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		
		return min;
		
	}
	
	static double max(double[] arr) {
		
		double max = arr[0];
		
		for (int i = 1; i < arr.length; ++i) {
			if (arr[i] < max) {
				max = arr[i];
			}
		}
		
		return max;
		
	}
	
	static double sum(double[] arr) {
		
		double sum = 0.0;
		
		for (int i = 0; i < arr.length; ++i) {
			sum += arr[i];
		}
		
		return sum;
	
	}
	
	static double avg(double[] arr) {
		
		double sum = sum(arr);
		return sum / arr.length;
	
	}		

}
