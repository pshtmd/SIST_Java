package com.sist.method;
/*
 * ���� �߱�����
 * =========
 * ���� => 3�� �߻�... 3 4 5
 * ����� �Է� => 3��   5 6 7  ==> 0S-1B ==> 3S
 * ��ĥ������ �ϴ� �Ŵϱ�  for������ while�� 
 * while => Ƚ�� ���� ���� ���
 * 
 */
import java.util.*;

public class MainClass2 {
	public static void main(String[] args) {
		//���� ����
		int[] com= {5,8,3};//�ߺ� ���� ���� => �Ǹ��°�
		//����� �Է�
		int[] user=new int[3];
		
		//�Է� ��û
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			//����� �Է�
			System.out.println("���ڸ� ������ �Է��ϼ���:");
			int input=scan.nextInt();
			//���ڸ� ������ �ƴ� ��쿡 ó�� 
//			if(input>99 && input<1000) // &&������ �� ��� 
//			{
//				
//			}
			if(input<100 || input>999) //����(���� => ||)
			{
				System.out.println("���ڸ� ������ �Է� �����մϴ�.");
				continue;//���ǹ����� �̵�	=> ó������ �ٽ� ���� 
				
				/*
				 * "continue""""
				 * while==> while�� ���ǹ����� �̵�
				 * for ==> ���������� �̵�
				 */
			}
			 //user[]�� ���� 123=> 1 987/100 ==>9
			// 987 % 100 => 87/10 => 8
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			//����ó��
			if(user[0]==user[1] ||user[1]==user[2] ||user[0]==user[2])
			{
				System.out.println("�ߺ��� ���ڴ� ����� �� �����ϴ�!");
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0) 
			{
				System.out.println("�ߺ��� ���ڴ� ����� �� �����ϴ�!");
				continue;
			}
			//��Ʈ
			int s=0; // �ڸ��� + ���� ������ ���
			int b=0; // ���ڸ� ������ ��� (�ڸ��� ���� ����)
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					if(com[i]==user[j]) //���� ���� �ִ��� ����
					{
						if(i==j)//���� �ڸ������ 
							s++;
						else // �ٸ� �ڸ���� 
							b++;						
					}
				}
			}
			//��Ʈ
			System.out.printf("Input Number: %d,Result: %ds-%dB\n",
					input,s,b);
			
			//���� ���� ==> break 
			if(s==3)
			{
				System.out.println("Game Over!!");
				break;//����
				
			}
		}
		
		
	}

}
