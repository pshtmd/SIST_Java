package com.sist.main;
//�޼ҵ� ��ɺ��� ������
//��� ���ϱ�
/*...������ /��� ����...����ü���� , Ŭ����
 * 
 * 3�� �л�
 * ����  ����  ���� => ����, ���, ���
 */
import java.util.*;
public class MainClass3 {
	public static void main(String[] args) {
		
		//2���� �迭 [3][6]
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		double[] avg=new double[3];
		int[] rank=new int[3];
		//double[3][6]  hab=new double[3][6]... �δ� 6��==> 
		//3���̻� => �������� ������ "�迭" , ������ �ٸ��� "Ŭ����"
		//int ,String , int
		/*
		 * class A
		 * { int
		 * 	String
		 * 	int
		 * }

		 */
		Scanner scan=new Scanner(System.in);
								//: "Ű����" �Է°� �����ؼ� �Ѱ���� 
		for(int i=0;i<3;i++) {
			System.out.print((i+1)+"���� �������� �Է�: ");
			kor[i]=scan.nextInt();
			System.out.print((i+1)+"���� �������� �Է�: ");
			eng[i]=scan.nextInt();
			System.out.print((i+1)+"���� �������� �Է�: ");
			math[i]=scan.nextInt();
			
			
			total[i]=(kor[i]+eng[i]+math[i]);
			avg[i]=total[i]/3.0;
	
		}
		//��� ���ϱ� 
		for(int i=0;i<3;i++) 
		{
			rank[i]=1;
			for(int j=0;j<3;j++) {
				if(total[i]<total[j]) {
					rank[i]++;
				}
			}
		}
		//���
		for(int i=0;i<3;i++)
		{										//�Ҽ��� ��°�ڸ������� ���
			System.out.printf("%-5d%-5d%-5d%-5d%-8.2f%-5d\n"
				,kor[i],eng[i],math[i],total[i],avg[i],rank[i]);
		}
	
	}

}
