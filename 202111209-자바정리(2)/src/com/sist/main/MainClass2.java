package com.sist.main;

import java.util.Arrays;

//���� ������ ���� �ٸ��� �������̽� ���
//**���� ���� ��� .. 
/*
// ���� ����   --> ��Ƚ�� : arr.length-1
 *	 45,67,90,34,12
 *
 *	
 */
public class MainClass2 {

	public static void main(String[] args) {
		int[] arr= {45,67,90,34,12};
		System.out.println("���� ��: ");
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) { //i�� arr.length -1��ŭ �����ϱ�...-1-i
				
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				
			}
		}
		System.out.println("���� ��: ");
		System.out.println(Arrays.toString(arr));
	}
}
