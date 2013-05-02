package random.quick.sort;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");	
		int length = s.nextInt();
		int i = 0;
		int array[] = new int[length];
		System.out.println("Enter values: ");
		while(length!=i){
			array[i++] = s.nextInt();
		}
		RandomQuickSort quickSort = new RandomQuickSort(array);
		array = quickSort.sort();
		for(int values:array)
			System.out.print(values + " ");
	}

}
