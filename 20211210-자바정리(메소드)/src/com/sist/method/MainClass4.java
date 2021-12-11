package com.sist.method;//클래스요소 , 상속, 오버로딩 
/*
 * 
 * 제어문
 * ====형식
 * 조건문 : 단일 조건문(if), 선택 조건문(if~else)
 * 		  형식) if(조건문) ==> 조건문(true /false)  => 부정연산자
 * 												 논리연산자 , 비교 연산자
 * 				{
 * 					조건이 true일 때 수행
 * 				}
 * 				=> 필요한 내용만 출력 가능
 * 
 * 				if(조건문)
 * 				{
 * 					조건 true일 때 
 * 				}			
 *				else
 *				{
 *					조건 false일 때
 *				}
 *				====================웹 (삼항 연산자)
 *
 * 반복문 : for , while(데이터베이스, 네트워크 )
 * 		===== for-each 
 * 
 * 		for
 *      ==> 일반 for
 *      	     1   ->  2    4
 *          for(초기값 ; 조건식; 증감식)
 *          {           
 *          	실행문장 3
 *          }
 *          1 -> 2 -> 3 -> 4
 *          초기값 => 조건 (true) => 실행문자 => 증가
 *              2 -> 3 -> 4
 *              2 -> 3 -> 4
 *              2 -> 3 -> 4
 *              ==false면 종료
 *      ==> for-each (웹에서 출력)
 *          for(데이터형 변수: 배열(컬렉션)) => 형변환
 *          {	========= 저장된 데이터보다 크면 상관없다.
 *          		=> 배열이나 컬렉션에 저장된 데이터를 대입
 *          }
 *          
 *          while: 무한루프 => while(true) : 반드시 종료 조건을 처리
 *          형식) 
 *          	초기화 ----------1
 *          	while(조건문)----2 => false면 종료
 *          	{
 *          		반복 수행문장--3
 *                  증감식-------4 ==> 2(조건식으로 이동)
 *              }
 *              
 * 반복제어문 : break  : 반복을 중단하는 경우 사용.
 */
import java.util.*;
public class MainClass4 {
	
	public static void main(String[] args) {
		String[] result= {"가위","바위","보"};
		//모든 프로그램은 ==>가상으로 나오는 거
		//컴퓨터가  가위 바위 보 => 선택 
		int com=(int)(Math.random()*3);//0,1,2
		//사용자가 가위 바위 보 => 선택
		Scanner scan =new Scanner(System.in);
		int user=scan.nextInt();
		System.out.println("가위(0),바위(1),보(2) 입력: ");
		System.out.println("============결과==============");
		System.out.println("컴퓨터:"+result[com]);
		System.out.println("사용자: "+result[user]);
		int r=com-user;
		if(r==-1 || r==2)
		{
			System.out.println("사용자 Win!!");
				
		}
		else if(r==-2 || r==1)
		{
			System.out.println("컴퓨터 Win!!");
			
		}
		else //r==0
		{
			System.out.println("비겼다!!");
		}
		//비교
		/*
		 *   컴퓨터    사용자           com-user
		 *   가위 0    가위 0   S         0
		 *   		  바위 1   U			-1
		 *            보  2   C			-1
		 *            
		 *   바위 1    가위 0   C			1
		 *   		  바위 1  S			0
		 *            보  2   U			-1
		 *                     
		 *    보 2    가위 0   U			2
		 *   		  바위 1   C			1
		 *            보  2   S     		0
		 *    ===============================
		 *    user => -1, 2
		 *    com => -2, 1
		 *    
		 *            
		 */
		
	}

//	public static void main(String[] args) {
//		int[] arr= {1,2,3,4,5};// 배열이 int 타입이니까 for-each도 같은 타입으로 받는 것이 좋지만
//									//int보다 작지만 않으면 상관은 없다
//		for(int a: arr)
//		{
//		
//		}
//		for(double d: arr)
//		{
//			
//		}
//		for(long l: arr)
//		{
//			
//		}
//		for(char s: arr)// 큰 거는 상관 없는데 작은 형은 문제가 생긴다.
//		{
//			
//		}
//		}
//	}
}
