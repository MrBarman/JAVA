		
		/*****	It is the simplest Sorting Algorithm. It works by iterating the input array from
		 	the first element to last,comparing each element to the last *****/

import java.util.*;
class BubbleSort{

/* BUBBLE SORT Method */
public static void sort(int[] a,int b){
	for(int i=0;i<b-1;i++)
		{
			for(int j=0;j<b-i-1;j++)
				{
					if(a[j]>a[j+1])
						{
							int temp = a[j];
							a[j] = a[j+1];
							a[j+1] = temp;
						}
				}
		}
		System.out.print("The sorted array is: ");
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
