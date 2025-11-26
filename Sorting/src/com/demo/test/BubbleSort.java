package com.demo.test;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {65,35,26,13,23,12,91};
		System.out.println("Before Sorting : ");
		System.out.println(Arrays.toString(arr));
		bubble(arr);
		System.out.println("After Sorting : ");
		System.out.println(Arrays.toString(arr));
		

	}
	
	public static void bubble(int [] arr) {
		int n = arr.length;
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-i;j++) {
				if(arr[j-1]>arr[j]) {
					int temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					
					// OR
//					int temp=arr[j];
//					arr[j]=arr[j-1];
//					arr[j-1]=temp;
				}
			}
		}
		
		
	}

}
