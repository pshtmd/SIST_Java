package com.sist.main;
//�迭 �ʱ�ȭ 
/*
 * new �̿�
 * int[] arr=new int[5] ==>0
 * double[] arr=new double[5]==>0.0
 * String[] arr=new String[5]==> null( �����ּҰ� ���� ���)
 * 
*/

public class MainClass2 {
	
	public static void main(String[] args) {
		int[] arr=new int[10];
		//�� ���� 
		for(int i=0;i<arr.length;i++) 
		{			
			arr[i]=(int)(Math.random()*100)+1;
			//          ------------------1  0.0 ~ 0.99
			//           0.0 and less than 1.0
			//           0.0 ~ 0.99 => *100 => 0.0 ~ 99.0
			//      ----2  0~99
			//                             ----3   1~100
		}
		for(int i: arr) // arr�̶�� �迭���� �������� ������ �ͼ� i�� ����
		{
		System.out.print(i+"\t");
		}
		System.out.println();
		/*
		 * 	*
		 * 	**
		 * 	***
		 * 	****
		 * 	i(�ټ�)  j(��ǥ)   j=i .. �̻��� �۾�ü�� ���� ���� �� �Ǽ� ij�� ���� ��Կ� ���� -> m n ���� ������ / a b�� ������
		 *    1      1
		 *    2      2
		 *    3      3
		 *    4      4
		 *  ****
		 *  ***
		 *  **
		 *  *
		 *  i(�ټ�)  j(��ǥ)   j=i
		 *   1       4       ���� ��´��Ѵ� i+j=5 => j=5-i
		 *   
		 *   
		 *  
		 */
	
		for(int i=1;i<=4;i++) 
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	
	
		for(int i=1;i<=4;i++) 
		{
			for(int j=1;j<=-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
