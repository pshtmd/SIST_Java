package com.sist.method;
/*
 * �޼ҵ� ���
 * ==== ���� +������+���
 * 	������: ����(++, --) , ��� , �� , �� 
 * 		============= ��ġ / ��ġ 
 * 					++a    a++
 * int a = 10;
 * int b = ++a  + a++ + a++ + ++a
 * 			==   ==		==	  ==
 * 			11   11    12	  14 ==> 48
 * int a=10
 * int b=++a  + ++a + ++a + ++a
 * 		  ==    ==    ==    ===
 * 		  11    12    13    14   => 50
 * 
 * int a=10;
 * int b=++a
 * 		  ==
 * 		   1
 *       ==
 *       2
 * 
 * int b=a++;
 * 	  ==
 *    1
 *       ====
 *        2
 * 
 * 
 * 
 */
public class MainClass3 {

	public static void main(String[] args) {
		int a=10;
		int b=++a  + ++a + ++a + ++a;
		System.out.println(b);
	}
}
