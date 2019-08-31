package a1;

import java.util.Arrays;
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
		
		
		//System.out.print(Arrays.toString(custNames));
		//System.out.print(Arrays.toString(custTotals));
		
		double maxAmount = max(custTotals);
		int maxSpenderIndex = indexOfArr(custTotals, maxAmount);
		System.out.println("Biggest: " + custNames[maxSpenderIndex] + " (" + maxAmount + ")");
		
		double minAmount = min(custTotals);
		int minSpenderIndex = indexOfArr(custTotals, minAmount);
		System.out.println("Smallest: " + custNames[minSpenderIndex] + " (" + minAmount + ")");
		
		double average = avg(custTotals);
		System.out.println("Average: " + average);
		
		scan.close();
		
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
