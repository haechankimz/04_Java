package eud.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);


	public void practice1() {
		
		int arr[] = new int[9];
		int sum = 0;
		
		for(int i = 0; i < arr.length ; i++) {
			arr[i] = i + 1; 
			System.out.print(arr[i] + " ");
			
			if(arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println();
		
		System.out.print("짝수 번째 인덱스 합 : " + sum);
	}

	
	
	public void practice2() {
			
			int arr[] = new int[9];
			int sum = 0;
			
			for(int i = 8; i >= 0 ; i--) {
				arr[i] = i + 1; 
				System.out.print(arr[i] + " ");
				
				if(arr[i] % 2 == 1) {
					sum += arr[i];
				}
			}
			System.out.println();
			
			System.out.print("홀수 번째 인덱스 합 : " + sum);
		}
	
	
	public void practice3() {
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i = 0; i < input ; i++) {
			arr[i] = i + 1;
		}
		System.out.print(Arrays.toString(arr) + " ");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
