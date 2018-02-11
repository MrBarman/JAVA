			/***** Merge sort algorithm uses divide and conquer algorithm. First Divide the 
					unsorted list into n sublists, each containing 1 element. Then Repeatedly
					merge sublists to produce new sorted sublists until there is only 1 sublist 
					remaining *****/

import java.util.*;
class MergeSort{

public static void merge(int ar[],int first,int middle, int last)
	{
		int len1=middle-first+1;
		int len2=last-middle;
		int left[]=new int[len1];
		int right[]=new int[len2];
		for(int i=0;i<len1;i++)
			left[i]=ar[first+i];
		for(int j=0;j<len2;j++)
			right[j]=ar[middle+1+j];
		int i=0,j=0,k=first;
			while(i<len1 && j<len2)
				{
					if(left[i]<=right[j])
						ar[k]=left[i++];
					else
						ar[k]=right[j++];
					k++;
				}
			while(i<len1)
				{
					ar[k]= left[i++];
					k++;
				}
			while(j<len2)
				{
					ar[k]=right[j++];
					k++;
				}
		
	}

public static void sort(int[] a,int start,int end)
	{
		int mid;
		if(start<end)
			{
				mid = (start+end)/2;
				sort(a,start,mid);
				sort(a,mid+1,end);
				merge(a,start,mid,end);
			}
	}

public static void main(String... args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no of elments to be sorted: ");
		int n= sc.nextInt();
		int[] arr = new int[n];
		System.out.print("Enter the elements: ");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		sort(arr,0,n-1);
		System.out.print("The sorted array: ");
		for(int i=0;i<n;i++)
			{
				System.out.print(arr[i]+" ");
			}
		System.out.println("");
	}
}
