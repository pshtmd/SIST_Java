package com.sist.main;

public class Movie {
	public static void main(String[] args) {
		//�Է�
		String[] movie= {"A","B","C"};
		double[] jumsu= {4.2, 3.3, 5.0};
		//				4.2, 3.3, 5.0
		double avg=0.0;
		int[] rank= {0,0,0};
		double sum=0;
		
		//���
		for(double i:jumsu) {
			sum +=i;
			avg =sum/jumsu.length;
		}
		System.out.printf("�̹� ���� ��ȭ ������� : %.2f",avg);
		
		//����
		for(int i=0;i<jumsu.length;i++	) {
			for(int j=0;j<jumsu.length;j++){
				if(jumsu[i]<jumsu[j]) {
					rank[i]++;
				}
			}
					
		}
		
	
		//���
		for(int i=0;i<movie.length;i++) {
			for(int j=0;j<jumsu.length;j++) {
				System.out.print(movie[i]+"\t");
				System.out.printf("%.2f",jumsu[j]);
			}			
		}
		
		
	}

}
