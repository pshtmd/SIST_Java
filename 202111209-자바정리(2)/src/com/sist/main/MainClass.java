package com.sist.main;

import java.util.Arrays;

//��� ���
/*
 * �޼ҵ� 
 * ��ü���� ==> ����Ŭ���� 
 * �������� ���α׷�(����ó��)
 * 1~8�� //�̷� ����..�Լ�(�޼ҵ�)�ϱ� ... ������ ���̺귯���� �ܿ� �͸� ���� �ȳ�
 * 
 * 
 * 		���� ���ǹ�
 * 		���� ���ǹ�
 * 
 * 		1~100 == 3��� , 5���, 7����� �� ........�������ǹ� ���
 * 			���� ���ǹ� ��� .. �������� 2���̻�  �ݺ��Ǵ� ��찡 ������(�ߺ������� �����Ұ�� .. )
 * 			���� ���ǹ�( �� �� ���� �� ���������� ���)
 * 
 * 		��� => ���ǹ�
 * ***		���� : && (������ *���ԵǴ� ���) ==> ����¡�� ��� ���� ���(ex"�� ���������� �� ������  ���� ����ض�"')
 * ***		������ :|| (���� ��� ���)
 * 
 * 
 * 		
 * 			45,67,90,34,12
 * 			-  -
 * 
 * 		
 */
public class MainClass {
	
	public static void main(String[] args) {
		//����: �������� , �������� .. �������� �˾Ƶ� �� ..�������� ���� ���ĺ��� ��� ���� �� �� ==> ORDER BY no DESC 
		int[] arr= {45,67,90,34,12};
//		Arrays.sort(arr);// ASC(��������)*, DESC(��������)... �⺻�� ��������
//		for(int i:arr)
//		{
//			System.out.print(i+" ");
//		}
//		
//	
//		System.out.println("\nDESC");
//		for(int i=arr.length-1;i>=0;i--)
//		{
//			System.out.print(arr[i]+" ");
//		}	
		for(int i=0;i<arr.length-1;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]<arr[j]) {//////////////////////
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));//�迭�� ���ڿ��� ���
		
		//////////////////////////////////////////////
		
		
		for(int i=0;i<arr.length-1;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]>arr[j]) {//////////////////////
					int tmp=arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));//�迭�� ���ڿ��� ���
		
		
		
		
		
		
		
		
		
	}
}
