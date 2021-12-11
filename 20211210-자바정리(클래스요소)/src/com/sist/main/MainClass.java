package com.sist.main;
/*
 * 	클랜스의 구성요소
 * 	============================================================================================================
 * 	1. 변수=데이터저장 장소
 * 		= 인스턴스 변수 : 객체 생성시 따로 생
 *      = 지역 변수 (루프 변수, 플로그 변수 , 누적변수 ) => 메소드 안에서만 처리 
 *                =======
 *                for(int i=0;i<10;i++)
 *                int sum=0;
 *                
 * 	============================================================================================================
 * 2. 생성자 : 멤버변수의 초기화  
 *           생성자는 여러 개 제작이 가능하다 ( 오버로딩)
 *             오버로딩
 *               1. 같은 클래스 안에서
 *               2. 같은 메소드 명으로 사용
 *               3. 매개변수의 개수나 데이터형이 다르다
 *               4. 리턴형은 관계없다
 *           생성자는 반드시 필요한 것이 아니다(생성자가 없는 경우 
 *           						  자동으로 생성 => default 생성자' )
 *           특징>
 *           	리턴형이 존재하지 않는다.
 *                class A
 *                {
 *                  A(){}
 *                  A(int a){}
 *                            // 생성자 
 *                  void A(double d){} => 일반 멤버  .. 생성자 아님
 *                }
 *             클래스명과 동일하다          _ _ _ _ _드라이버 연결 시
 *               사용처 => 네트워크, 윈도우, 데이터베이스
 *               		=======  -----화면 UI
 *                      서버 구동할 때 사용
 *               => 시작과 동시에 한 번만 호출하기 대문에 많이 사용
 *                  => 생성자를 여러 개 호출 ==객체를 여러개 생성하겠다는 말!(.. 객체 하나에 생성자 하나임)
 *                  => 상속 예외 조건 
 * 	============================================================================================================
 *   기능설정 :** 메소드 **
 *   	=> 구조화 프로그램 (관련된 명령문을 모아서 한 번에 처리할 목적 )
 *     => 반복 제거하고자 하는 경우 주로 사용
 *     => 한 가지 기능만 수행할 수 있게 만듦
 *     => 재사용시 주로 이용 
 *     => 요청을 받아서 요청 처리 결과값응 보내주는 역할 !!
 *        =-======      ===============
 *        매개변수            리턴형---한 개만 사용 가능  => 여러개 보내느 경우 클래스 / 배열 로 
 *        ------ 여러개 사용이 가능 (매개변수는 3개 이상 초과 금지)..초과되면 배열이나 클래스로 넘겨서 처리하기
 *        ===> 1 , 2 , 3 ==> 가변 매개변수 
 *                          ----------
 *                          int...
 *                          (1)
 *                          (1,2)
 *                          (1,2,3)..
 *                          printf("%d",1)
 *                          printf("%d%d%d",5,4,5)
 *    => 메소드 매개변수 전송 방식
 *       = Call By Value (값에 의한 전송) => 복사본 넘김..기존값 변경 x
 *       = Call By Reference(주소에 의한 전송)=> 원본을 넘김 --> 클래스 , 배열을 이용하는 경우만 가능 (예외: String은 아무리 전송해도 값이 바뀌지 않음 . call by value 에 해당됨!!)
 * 	================================================================================================================
 */
//생성자: 시작과 동시에 처리하는 내용 / 변수 초기화 => 객체 1개당 1번만* 호출 가능
//객체 저장시에 반드시 생성자가 호출되어야 한다. 
//생성자는 호출시에 반드시 new를 사용한다.
/*
 *    class A
 *    {
 *    }
 *    
 *    A a; =>  주소가 없는 상태 (null)
 *    A(); => X
 *    new A(); => O
 *    
 */
class Sawon
{
	//멤버변수 
	int sabun=(int)(Math.random()*100)+1; //0 => 명시적 초기값
	String name; //null
	String dept; // null ... double => 0.0 , char => '\0'
	
	//초기값
	//기능 추가 => 오버로딩
	public Sawon()//디폴트 생성자
	{
		name="홍길동";// this. 생략 .... 변수가 충돌 되지 않는 경우 생략 ㅎ
		dept="개발부";
		//쓰레드 구동, 오라클 연결, 서버연결, 자동로그인		
	}
	
	//사용자로부터 입력을 받아서 저장
	public Sawon(String name, String dept) //overloading
	{
		this.name=name;
		this.dept=dept;
		//this.==> static 생성되는 시점(Sawon s=new Sawon())
		//JVM ==> this=s ==> 상위 클래스 super
	}
	//변수 찾는 경우 =순서=> 1.지역변수(지역변수, 매개변수) ==> 2. 멤버변수 
	public void display() 
	{
		System.out.println("이름:"+name+",부서: "+dept);
	}
	
	public void Sawon()//리턴형* 존재->일반메소드!!(생성자 아님..생성자는 리턴형 없음) 호출하려면 s1.Sawon();이렇게 호출해야!!
	{
		System.out.println("Sawon Call");
	}
	
	//생성자는 필요한 클래스에서 언제든지 호출이 가능(접근지정어:public)
}
//사용법, 호출 방법***(생성자)  호출할 때 new가 붙어있는 경우...new가 붙어있으면 아 저건 생성자구나!!!!!
public class MainClass {
	public static void main(String[] args) {
		Sawon s1=new Sawon();//디폴트 생성자 (생성자를 구현하지 않은 경우 => 자동생ㅅ어)
		System.out.println("이름:"+s1.name+",부서:"+s1.dept);
		Sawon s2=new Sawon("박문수","영업부");
		System.out.println("이름:"+s2.name+",부서: "+s2.dept);
		s2.display();
		s1.display();
		
		new Sawon().display();//생성자를 이용해서 다이렉트로 출력 가능 //newSawon이 s1 변수 같은 역할 ..주소 저장 후 따로 활용(호출)하는 경우 아니고 바로 호출가능
		new Sawon("이순신","기획부").display();;// 
		
		
		
		
//		System.out.printf();//String,Object... : 모든 데이터를 받을 수 있다.
	}

}
