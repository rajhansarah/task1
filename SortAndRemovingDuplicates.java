package practicePackage;

import java.util.Arrays;

public class SortAndRemovingDuplicates {

	public static void main(String[] args) {
		int arr[]= {90,23,34,34,34,56,56,56,33,21,11,1};
		int temp2[]=new int[arr.length];
		
		int k=0;
		int counter=0;
		//bubble sort
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				temp2[k++]=arr[i];
				counter++;
			}
		}
		temp2[k++]=arr[arr.length-1];
		for(int j=0;j<counter+1;j++) {
			System.out.print(temp2[j]+" ");
		}
			
	
	
	}

}
