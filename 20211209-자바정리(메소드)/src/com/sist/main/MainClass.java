package com.sist.main;
/*
 * ����ڰ� �⵵ , ���� �Է� ==> �Ű����� (����ڰ� �Է��ϸ� ������ �Ű�����!!)
 *   ..���ο� �ڵ� �Է��ϸ� ���� �� �ϴϱ� �޼ҵ�� �и��ؼ� ����
 * 	�޷���� -> ���� ... �θ��ô� �� ���� ���Ȥ� (����, ��ȣȭ)
 * 			- 4�⸶�� ����
 * 			- 100�⸶�� ���� ����
 * 			- 400�� ���� ����
 * 
 * 	1. 1�� 1�� 1��~�۳⵵������ ���ϼ�
 *  2. ���� �⵵�� 1��~ �Է��� �� ����  ���ϼ�
 *  3. �Է��� ���� 1++; 
 *  
 *  ---------------------------------------
 *  	�� �ϼ� % 7 = ���� ......�˰��� ���ο� ��
 *  ==> Calendar Ŭ�������� ���� ���ϴ� �� �� ���� ��....
 *  
 * 
 */

import java.util.*;
//���� ok => java.lang.* : String , system���� �޼ҵ� ... import���� ��� ����
/*
 * public class MainClass //extends Object //����
 * {
 * 		public MainClass()//default ������ ������
 * 		{ 
 * 		}
 * 		public void display()
 * 		{
 * 			//return //�޼ҵ� ����� return�� �־�� �� . ������ �����Ϸ��� ���� return ����
 * 		}
 * }
 * 
 */
public class MainClass {
	
	public static void main(String[] args) {
		
		//����� �Է� �Ϸ�
		Scanner scan=new Scanner(System.in);//Ű���� �Է°� scan���� �Ѱ����
		System.out.print("�⵵�� �Է��ض�:");
		int year=scan.nextInt();
		
		System.out.print("�� �Է�:");
		int month=scan.nextInt();
		
		//��û�� ������ ���� => 1������ ���� ���ϱ�
		// ���⵵������ �� �ϼ�
		int total=(year-1)*365
				+(year-1)/4
				-(year-1)/100 //���� 100�⸶�� ����
				+(year-1)/400;
		
		
		//�� �ޱ����� ��
		int[] lastday= {31,28,31,30,31,30,
						31,31,30,31,30,31};
		
		if((year%4==0&&year%100!=0)||(year%400==0))//���� ����(����)**************************
		{
			lastday[1]=29;
		}
		else
		{
			lastday[1]=28;
		}
					// ���ޱ����ϰ� -1
		for(int i=0;i<month-1;i++) {
			total+=lastday[i]; //���� ���� ���� 
		}//���ޱ��� ���ϰ�
		total++; // �÷��� �� �ؼ� ù���� ���ض�
		//���� ���ϱ�
		int week=total%7;
		/////////////////////////////////////////////������ ���ϱ� ���� ������ ����
		//���
		String[] strWeek= {"��","��","ȭ","��","��","��","��"};
		//���� ���
		System.out.println(year+"�⵵ "+month+"��");
		for(int i=0;i<strWeek.length;i++)
		{
			System.out.print(strWeek[i]+"\t");
		}
		System.out.println("\n");//2�� ���
		for(int i=1;i<=lastday[month-1];i++)
		{
//			System.out.print(i+"\t");
			if(i==1)//ù ���̸� 
			{
				for(int j=0;j<week;j++)//week ��ŭ �������� ��� 
				{
					System.out.printf("\t");//�������� �Է� ��
				}
			}
			System.out.printf("%2d\t",i); // ���� ��� ����
			week++;
			if(week>6)
			{
				week=0;
				System.out.println();
			}
		}
		/*
		 * ���ڿ��� *�Է¹޾Ƽ� ���ٷ� ��� //String���� �ް�
		 * =======================
		 * �׸������� *�о�ͼ� ���ٷ� ���//�׸��� byte�� �ް�
		 * byte[] buffer=fileReader();
		 * 
		 */
		
	
		
		
		
	}

}
