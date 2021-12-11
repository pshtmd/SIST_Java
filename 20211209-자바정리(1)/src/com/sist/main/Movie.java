package com.sist.main;

public class Movie {
	public static void main(String[] args) {
		//입력
		String[] movie= {"A","B","C"};
		double[] jumsu= {4.2, 3.3, 5.0};
		//				4.2, 3.3, 5.0
		double avg=0.0;
		int[] rank= {0,0,0};
		double sum=0;
		
		//평균
		for(double i:jumsu) {
			sum +=i;
			avg =sum/jumsu.length;
		}
		System.out.printf("이번 시즌 영화 평균점수 : %.2f",avg);
		
		//순위
		for(int i=0;i<jumsu.length;i++	) {
			for(int j=0;j<jumsu.length;j++){
				if(jumsu[i]<jumsu[j]) {
					rank[i]++;
				}
			}
					
		}
		
	
		//출력
		for(int i=0;i<movie.length;i++) {
			for(int j=0;j<jumsu.length;j++) {
				System.out.print(movie[i]+"\t");
				System.out.printf("%.2f",jumsu[j]);
			}			
		}
		
		
	}

}
