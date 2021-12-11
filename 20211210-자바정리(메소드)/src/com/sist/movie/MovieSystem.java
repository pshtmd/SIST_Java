package com.sist.movie;
//��ȭ �ý��� ==> �޼ҵ� 
//1. �����͸� ����==> �������� ���(static)
//
import java.util.*;
import java.io.*;
public class MovieSystem {//������ �����ؼ� ��� �ϴ���
	//������ ������ ����
	private static MovieVO[] movie_data=new MovieVO[1938]; // ������ ����
//***����� ���� Ŭ���� => �Ϲ� ���������� �����ϰ� ����Ѵ�
	//class=> �����͸� ��Ƽ� ���� 
	//Ŭ���� �迭, String[] => ��ü �迭
	//movie_dataa=> ���� ÷��
	static// static���� �ʱ�ȭ �Ϸ��� static���� ������ �� !!{}
	{
		// �ʱ�ȭ ��
		try {
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			//���� �б�
//			String totalFile="";
			StringBuffer sb=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1)//�ѱ��ھ� �ƽ�Ű(�����ڵ�)���� �о i�� ��
			{						// -1 (EOF => end of file)//�� ���ھ� ���� ���������� �о��
//				totalFile +=String.valueOf((char)i);//���ڷ� �����ϱ� ĳ���������� ����ȭ
				sb.append(String.valueOf((char)i));//�� �ڵ庸�� �ӵ� ���� ..������ ��Ƴ�
			}
//			System.out.println(sb.toString());
			String movie=sb.toString();
			String[] m=movie.split("\n");//���پ� �迭��ҿ� �������
			for(int j=0;j<m.length;j++)
			{
				String[] rm=m[j].split("\\|");//Split => ���Խ� ( ^ , $, +, * | , . ) �� ����Ϸ��� �տ� �������� 2�� �Է��ؾ� ��. // AI(���ºм�)���� ���ʤ���
				MovieVO vo=new MovieVO();
//�Ʒ� �ڵ��		vo.setNo(rm[0]);
				vo.setNo(Integer.parseInt(rm[0]));//String==> int
				//INteger.lparseInt ==> Wrapper( �� �������� ���� Ŭ������ ������� �ִ�.)
				vo.setTitle(rm[1]);
				vo.setGenre(rm[2]);
				vo.setPoster(rm[3]);
				vo.setActor(rm[4]);
				vo.setRegdate(rm[5]);
				vo.setGenre(rm[6]);
				vo.setDirector(rm[7]);

				movie_data[j]=vo;
			}
		}catch(Exception ex) {}
		
	}
	//�޼ҵ� (��ȭ ����)
	//1.ã��(����,�⿬,�帣)=>����� �޾Ƽ� ��� / �޼ҵ� �ȿ� ���
	// �޼ҵ� �ȿ��� ������� ���=> void 
	public void titleFind(String title)
	{		
		for(MovieVO vo:movie_data)
		{
			if(vo.getTitle().contains(title))
			{
				//contains(title) => ���� => ����Ŭ (LIKE)
				System.out.println(vo.getTitle());
			}
		}
	}
	public void actorFind(String name)
	{
		for(MovieVO vo:movie_data)
		{
			if(vo.getActor().contains(name))
			{
				//contains(title) => ���� => ����Ŭ (LIKE)
				System.out.println(vo.getTitle());
			}
		}
	}
	public void genreFind(String genre)
	{
		for(MovieVO vo:movie_data)
		{
			if(vo.getGenre().contains(genre))
			{
				//contains(title) => ���� => ����Ŭ (LIKE)
				System.out.println(vo.getGenre());
			}
		}
	}
	
	public static void main(String[] args) {
		MovieSystem ms=new MovieSystem();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("��ȭ ���� �Է�: ");
		String tile=scan.next();
		ms.titleFind(tile);//����ڰ� �Է��� �� �Ű������� ���� �Ѵ� ***
		
		System.out.print("���ΰ� �̸� �Ϸ�: ");
		String actor=scan.next();
		ms.actorFind(actor);
		
		System.out.println("�帣 �Է�: ");
		String genre=scan.next();
		ms.genreFind(genre);
	}
	
	
	
//	public static void main(String[] args) {
//		for(MovieVO vo:MovieSystem.movie_data) {
//			System.out.println("���� : "+vo.getTitle());
//			System.out.println("�帣: "+vo.getGenre());
//			System.out.println("===================================");
//		}
//	}
}
