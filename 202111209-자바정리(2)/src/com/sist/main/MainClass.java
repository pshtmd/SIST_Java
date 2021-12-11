package com.sist.main;

import java.util.Arrays;

//제어문 사용
/*
 * 메소드 
 * 객체지향 ==> 내부클래스 
 * 오류없는 프로그램(예외처리)
 * 1~8장 //이론 공부..함수(메소드)암기 ... 나머지 라이브러리는 외울 것만 따로 안내
 * 
 * 
 * 		단일 조건문
 * 		다중 조건문
 * 
 * 		1~100 == 3배수 , 5배수, 7배수의 합 ........단일조건문 사용
 * 			단일 조건문 사용 .. 여러개를 2번이상  반복되는 경우가 있으니(중복적으로 수행할경우 .. )
 * 			다중 조건문( 한 번 수행 후 빠져나가는 경우)
 * 
 * 		제어문 => 조건문
 * ***		포함 : && (범위에 *포함되는 경우) ==> 페이징할 경우 많이 사용(ex"몇 페이지부터 몇 페이지  까지 출력해라"')
 * ***		미포함 :|| (범위 벗어날 경우)
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
		//정렬: 선택정렬 , 버블정렬 .. 이정도만 알아도 ㅎ ..웹페이지 에선 정렬보단 요거 많이 씀 ㅎ ==> ORDER BY no DESC 
		int[] arr= {45,67,90,34,12};
//		Arrays.sort(arr);// ASC(오름차순)*, DESC(내림차순)... 기본값 오름차순
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
		System.out.println(Arrays.toString(arr));//배열을 문자열로 출력
		
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
		System.out.println(Arrays.toString(arr));//배열을 문자열로 출력
		
		
		
		
		
		
		
		
		
	}
}
