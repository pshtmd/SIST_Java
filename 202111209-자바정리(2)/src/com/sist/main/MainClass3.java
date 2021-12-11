package com.sist.main;
//메소드 기능별로 나눠서
//등수 구하기
/*...연산자 /제어문 정리...개개체지향 , 클래스
 * 
 * 3명 학생
 * 국어  영어  수학 => 총점, 평균, 등수
 */
import java.util.*;
public class MainClass3 {
	public static void main(String[] args) {
		
		//2차원 배열 [3][6]
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] math=new int[3];
		int[] total=new int[3];
		double[] avg=new double[3];
		int[] rank=new int[3];
		//double[3][6]  hab=new double[3][6]... 인당 6개==> 
		//3개이상 => 데이터형 같으면 "배열" , 데잍형 다르면 "클래스"
		//int ,String , int
		/*
		 * class A
		 * { int
		 * 	String
		 * 	int
		 * }

		 */
		Scanner scan=new Scanner(System.in);
								//: "키보드" 입력값 저장해서 넘겨줘라 
		for(int i=0;i<3;i++) {
			System.out.print((i+1)+"번재 국어점수 입력: ");
			kor[i]=scan.nextInt();
			System.out.print((i+1)+"번재 영어점수 입력: ");
			eng[i]=scan.nextInt();
			System.out.print((i+1)+"번재 수학점수 입력: ");
			math[i]=scan.nextInt();
			
			
			total[i]=(kor[i]+eng[i]+math[i]);
			avg[i]=total[i]/3.0;
	
		}
		//등수 구하기 
		for(int i=0;i<3;i++) 
		{
			rank[i]=1;
			for(int j=0;j<3;j++) {
				if(total[i]<total[j]) {
					rank[i]++;
				}
			}
		}
		//출력
		for(int i=0;i<3;i++)
		{										//소수점 둘째자리까지만 출력
			System.out.printf("%-5d%-5d%-5d%-5d%-8.2f%-5d\n"
				,kor[i],eng[i],math[i],total[i],avg[i],rank[i]);
		}
	
	}

}
