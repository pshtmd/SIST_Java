package com.sist.main;
class Swap
{
	//Call By Value => 일반 데이터형(int ,long , double, boolean...)
	//특이 => String 
	public void callByValue(int a, int b)
	{
		 System.out.println("a="+a+",b="+b);
		 //a와 b값을 변경 
		 int tmp=a;//값을 swap할 경우 임시변수** 반드시 필요
		 a=b;
		 b=tmp;
		 System.out.println("a="+a+",b="+b);
	}
}

public class MainClass2 {
	public static void main(String[] args) {
		int a=100;
		int b=200;
		System.out.println("a="+a+"b="+b);
		System.out.println("========= Swap을 호출 후 ===========");
		Swap s=new Swap();
		s.callByValue(a, b);;
		System.out.println("호출 후: a="+a+",b="+b);
		
		
	}

}
