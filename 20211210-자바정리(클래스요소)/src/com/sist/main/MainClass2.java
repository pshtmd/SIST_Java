package com.sist.main;
class Swap
{
	//Call By Value => �Ϲ� ��������(int ,long , double, boolean...)
	//Ư�� => String 
	public void callByValue(int a, int b)
	{
		 System.out.println("a="+a+",b="+b);
		 //a�� b���� ���� 
		 int tmp=a;//���� swap�� ��� �ӽú���** �ݵ�� �ʿ�
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
		System.out.println("========= Swap�� ȣ�� �� ===========");
		Swap s=new Swap();
		s.callByValue(a, b);;
		System.out.println("ȣ�� ��: a="+a+",b="+b);
		
		
	}

}
