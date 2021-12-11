package com.sist.main;
/*
 * 사용자가 년도 , 월을 입력 ==> 매개변수 (사용자가 입력하면 무조건 매개변수!!)
 *   ..메인에 코드 입력하면 재사용 못 하니깜 메소드로 분리해서 재사용
 * 	달력출력 -> 윤년 ... 로마시대 때 로직 나옴ㅎ (윤년, 암호화)
 * 			- 4년마다 윤년
 * 			- 100년마다 윤년 제외
 * 			- 400년 마다 윤년
 * 
 * 	1. 1년 1월 1일~작년도까지의 총일수
 *  2. 현재 년도의 1월~ 입력한 월 까지  총일수
 *  3. 입력한 달의 1++; 
 *  
 *  ---------------------------------------
 *  	총 일수 % 7 = 요일 ......알고리즘 공부용 ㅋ
 *  ==> Calendar 클래스에서 요일 구하는 거 다 가능 ㅎ....
 *  
 * 
 */

import java.util.*;
//생략 ok => java.lang.* : String , system관련 메소드 ... import없이 사용 가능
/*
 * public class MainClass //extends Object //생략
 * {
 * 		public MainClass()//default 생성자 생략됨
 * 		{ 
 * 		}
 * 		public void display()
 * 		{
 * 			//return //메소드 종료는 return이 있어야 함 . 생략시 컴파일러에 의해 return 생김
 * 		}
 * }
 * 
 */
public class MainClass {
	
	public static void main(String[] args) {
		
		//사용자 입력 완료
		Scanner scan=new Scanner(System.in);//키보드 입력값 scan변쉥 넘겨줘라
		System.out.print("년도를 입력해라:");
		int year=scan.nextInt();
		
		System.out.print("월 입력:");
		int month=scan.nextInt();
		
		//요청한 내용을 가공 => 1일자의 요일 구하기
		// 전년도까지의 총 일수
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100 //윤년 100년마다 제외
				+(year-1)/400;
		
		
		//전 달까지의 합
		int[] lastday= {31,28,31,30,31,30,
						31,31,30,31,30,31};
		
		if((year%4==0&&year%100!=0)||(year%400==0))//윤년 조건(계산식)**************************
		{
			lastday[1]=29;
		}
		else
		{
			lastday[1]=28;
		}
					// 전달까지니가 -1
		for(int i=0;i<month-1;i++) {
			total+=lastday[i]; //전달 까지 총합 
		}//전달까지 구하고
		total++; // 플러스 일 해서 첫날을 구해라
		//요일 구하기
		int week=total%7;
		/////////////////////////////////////////////요일을 구하기 위한 데이터 가공
		//출력
		String[] strWeek= {"일","월","화","수","목","금","토"};
		//요일 출력
		System.out.println(year+"년도 "+month+"월");
		for(int i=0;i<strWeek.length;i++)
		{
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println("\n");//2줄 띄어
		for(int i=1;i<=lastday[month-1];i++)
		{
//			System.out.print(i+"\t");
			if(i==1)//첫 줄이면 
			{
				for(int j=0;j<week;j++)//week 만큼 공백으로 띄고 
				{
					System.out.printf("\t");//공백으로 입력 후
				}
			}
			System.out.printf("%2d\t",i); // 일자 출력 시작
			week++;
			if(week>6)
			{
				week=0;
				System.out.println();
			}
		}
		/*
		 * 문자열을 *입력받아서 꺼꾸로 출력 //String으로 받고
		 * =======================
		 * 그림파일을 *읽어와서 꺼꾸로 출력//그림은 byte로 받고
		 * byte[] buffer=fileReader();
		 * 
		 */
		
	
		
		
		
	}

}
