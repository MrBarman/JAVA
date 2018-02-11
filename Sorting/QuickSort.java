			
			/***** QUICK SORT algorithm uses the DIVIDE & CONQUER algorithm for sorting.
					Here an element is picked as PIVOT element(In this program the last element)
					and the sorting is done depending that element. First the elements are splitted 
					based on the pivot that is smaller elements than pivot are on one side and
					larger than pivot elements are another side. The same procedure is followed on 
					the side of smaller elements as well as the side of larger elements *****/ 

import java.util.*;
class QuickSort{

/* This methot splits the elements */
public static int partition(int arr[],int start,int end)
	{
		int pivot=arr[end];
		int i=start;
		for(int j=start;j<end;j++)
			{
				if(arr[j]<=pivot)
					{
						int temp=arr[j];
						arr[j]=arr[i];			
						arr[i]=temp;
						i++;
					}
			}
		int temp=arr[i];
		arr[i]=arr[end];
		arr[end]=temp;
		return i;
	}

/* QuickSort method */
public static void sort(int[] a,int start,int end)
	{
		int p;
		if(start<end)
			{
				p=partition(a,start,end); //p stores the pivot returned by partition
				sort(a,start,p-1); // repeats the same process on elements smaller than pivot 
				sort(a,p+1,end); // repeats the same process on elements larger than pivot
			}
		
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
		sort(arr,0,n-1);
		System.out.print("Sorted list is: ");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		System.out.println("");
		
	}
}
