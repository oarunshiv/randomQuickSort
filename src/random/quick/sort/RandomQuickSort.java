package random.quick.sort;

import random.number.generator.RandomNumber;

public class RandomQuickSort {
	private RandomNumber randomNumber = new RandomNumber();
	private int a[];

	public RandomQuickSort(int array[]) {
		a = array;
	}

	public int[] sort()
	{
		sort(0, a.length - 1);
		return a;
	}    
	
	private void sort(int low, int high)
	{
		if (low >= high) return;
		int r = randomNumber.getRandomNumber(low, high);
		System.out.println("r: " + r);
		swap(low,r);
		System.out.print("after swapping, the array: ");
		for(int values:a)
			System.out.print(values + " ");
		System.out.println("\nrandPivot: " + a[low]);
		int p = partition(low, high);
		System.out.println("After partition: ");
		for(int values:a)
			System.out.print(values + " ");
		System.out.println();
		System.out.println("p: " + a[p]+" Low: " + low +"High: " + high);
		System.out.println();
		sort(low, p);
		sort(p + 1, high);
	}

	private int partition(int low, int high)
	{
		int pivot = a[low];
		int i = low - 1;
		int j = high + 1;
		while (i < j)
		{
			i++; 
			while (a[i] < pivot) 
				i++;
			j--; 
			while (a[j] > pivot) 
				j--;
			if (i < j) 
				swap(i, j);
		}
		return j;
	}

	private void swap(int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
}
