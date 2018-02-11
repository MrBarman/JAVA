		

		/***** INSERTION SORT ALGORITHM-->> In each iteration, an element is removed from the
			input data and get iserted into correct position in the list being sorted *****/

import java.util.*;
class InsertionSort{

public static void sort(int[] a,int siz)
	{
		int key;
		int j;
		for(int i=1;i<siz;i++)
			{
				key=a[i];
				j=i-1;
				while(j>=0 && a[j]>key)
					{
						a[j+1] = a[j];
						j--;
					}
				a[j+1]=key;
			}
		System.out.print("The sorted array: ");
		for(int i=0;i<siz;i++)
			{
				System.out.print(a[i]+" ");
			}
		System.out.println("");
	}

public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of elements: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("Enter the elements: ");
		for(int i= 0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
		sort(arr,n);
		
		
	}
}
