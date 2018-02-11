		
		/***** In this algorithm, smallest element from the unsorted list is selected
			and swap it with the element in the begining *****/

import java.util.*;
class SelectionSort{

/* SELECTION SORT Method */
public static void sort(int []a, int b){
for(int i=0;i<b-1;i++)
	{
		int min=i;
		for(int j=i+1;j<b;j++)
			{
				if(a[min]>a[j])
				min=j;
			}
			
			{
				int temp= a[min];
				a[min] = a[i];
				a[i] = temp;
			}
			
	}
	display(a);

}

/* Method for PRINTING the elements */
public static void display(int[] a){
	for(int i: a)
		{
			System.out.print(i+" ");
		}
		System.out.println("");
	}

public static void main(String... args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the size of the array:");
	int n=sc.nextInt();
	int arr[]= new int[n];
	System.out.println("Enter the elements");
	for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
	sc.close();
	sort(arr,n);

	}

}
