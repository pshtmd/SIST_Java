package com.sist.main;
/*
 *    page 20
 *    변수 => 한 개의 데이터를 메모리 공간
 *    변수 / 상수
 *    ---   ------변경할 수 없는 값 
 *    변경해서 사용       final int A=10;...상수는 대문자 표기
 *    int a=10;
 *p26  =====================================================
 *    = 클래스명 첫자 대문자*
 *    = 메소드, 변수 소문자
 *    = 상수 모두 대문자
 *    = 두 개의 단어가 합쳐졌을 경우 => 시작하는 단어에 대문자 
 *       fileName || file_name 변수 메소드)   ,    
 *       FileName (클래스)
 *    ====================================================
 *    값을 대입
 *    int a=10; 10을 a에 대입
 *    
 *    변수가 여러 개일 경우
 *    int a;
 *    int b; 
 *    int c;
 *    
 *    ===> int a,b,c;  (데이터 타입 같을 경우 묶어서 선언 가능)
 *    
 *    int a=10;
 *    int b=20;
 *    int c=30;
 *    
 *    ==> int a=10, b=20,c=30;
 *    
 * p25 . 식별자 (구분)
 *    1. 알파벳 시작 ( 대소문자 구분해야한다는 단점), 한글(권장x)=> window/linux
 *      => AWS (운영체제) => linux 
 *      
 *    2. 숫자 사용이 가능 ( 앞에 사용 금지**)
 *    3. 특수문자 사용가능( _   $) ==> _많이 사용ㅇ
 *    4. 키워드 사용 금지*(색상이 자주색 /주황색)
 *       
 * p27  기본데잍형 , 참조데이터(클래스, 배열)
 * p28  기본형 (정수,실수 .. 에느 뭐가 있는지) ==> 도표 => 29page크기(char~논란인 거 제외하구)
 * p32  접미어 구분 
 *      L(l) => long   ,    F(f) => float
 *    		float f=10.8; // 소수점은 컴퓨터는 double로 인식하고 정수는 int 인식함 .. float으로 바꾸려면 float f=10.8f *****
 * p57  \t   \n   \"   \\(경로명 입력하 때 .. 역슬러쉬는 두개 입력해야 제대로 하나 나옴 )
 * p82-3   형변환
 *      String  이 가장 큼
 *      7+""+10.5+""+'A'=="710.5A"
 *      byte < char < int < long < float < double < String 
 *      
 *      
 *32장  ================================================================
 *
 *p87  연산자 종류
 *   	  (type)  =>형변환 연산자 
 *    	  ?  :     => 삼항 연산자 
 *    	 instanceof  => 객체 크기 비교할 때 사용하는 연산자 
 *    
 *    Object obj= new Object();
 *    String s= new String();
 *    StringBuffer sb=new Stringbuffer()
 *    
 *    if(s instanceof Object)          ==> is-a (true)
 *    if(obj instanceof String)        ==> false
 *    if(sb instanceof Object)         ==> true
 *    if(obj instanceof StringBuffer)  ==> false
 *    if(s instanaceof StringBuffer)   ==> 오류 (상속관계를 갖지 않으면 크기 비교를 할 수 없어 에러)
 *    
 *    ***** Object :모든 클래스의 상위 클래스 .... 모든 클래스  Object상속을 받음 (모든 데이터형을 받을 수 있다)
 *   Object a=10
 *   Object a=10.5
 *   Object a=10.5f
 *   Object a='A'
 *   Object a=new MainClass4() ..............모든 걸 다 받을수 있다아아아
 *   
 *   
 * p92  연산처리시 형변환(자동)
 *      ***  int이하 연산산자 (char , byte , short ) => 연산결과가 int 
 *      
 *      
 * p93  증감연산자 
 *      전치 연산자 : 먼저 증가 후 다른 연산 수행 (++a)
 *      후치 연산자 : 다른 연산 수행 후 증가    (a++)
 *      
 * p97  산술 연산자
 *       / =>정수/정수 =정수 , 0으로 나눌 수 없다
 *       % => 결과는 왼쪽 편 부호를 따라간다.
 * p109 비교 연산자 (==  !=  <  >  <=  >= )  ==> true / false
 * p114  논리 연산자 ( &&:직렬연산자   ||:병렬연산자 )
 * p118      => 효율적인 연산 ( false && ... 면 뒤 에 연산 안하는 이미 false결과 결정됨 ㅋㅋ)
 *      
 * p130 삼항연산자 
 * 	    (조건)? 값1: 값2
 * 		  조건이  true면 값1 
 *              false면 값2   
 *              
 * p133 대입 연산자 (=>  +=  -= (여러개를 동시에 증가할 때 )
 *               i++  => 1증가
 *               ++i  => 1증가
 *               i+=2  => 2증가 ...i=i+2
 *               i+=5  => 5증가 ...i=i+5
 * =============================================================================
 * 
 * 4장 
 *      제어문
 *      조건문형식만 
 * p136 if
 * p140 if else
 * p141 if-esle if-else if-else
 * p157 반복문(for 그림)
 * p166 for-each
 * p167 while
 *    break
 *    ==========================================================================
 *  5장  배열 => 
 *  p182 초기값 주는 방법
 *  p183 선언하는 방법 (1차배열**)
 *  ============================================================================
 *  
 * ************************ 6장 7장 8장 ********************** 계속 공부공부공부
 */

public class MainClass4 {
	
	public static void main(String[] args) {
//		float f=10.8; // 소수점은 컴퓨터는 double로 인식하고 정수는 int 인식함 .. float으로 바꾸려면 float f=10.8f *****
		System.out.println("\"홍길동\""); //"홍길동" 따옴표 포함 출력
		
		//효율적 연산 예시
		int a=10;
		int b=9;
		if(a<b&&++b==a)
		{
			System.out.println("처리완료");
		}
		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
    