package com.sist.main;

import java.util.Arrays;

//종류 같은데 내용 다르면 인터페이스 사용
//**변수 적게 사용 .. 
/*
// 버블 정렬   --> 비교횟수 : arr.length-1
 *	 45,67,90,34,12
 *
 *	
 */
public class MainClass2 {

	public static void main(String[] args) {
		int[] arr= {45,67,90,34,12};
		System.out.println("정렬 전: ");
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) { //i가 arr.length -1만큼 갔으니까...-1-i
				
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
		System.out.println("정렬 후: ");
		System.out.println(Arrays.toString(arr));
	}
}
