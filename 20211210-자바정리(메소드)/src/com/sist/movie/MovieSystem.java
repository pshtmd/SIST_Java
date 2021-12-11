package com.sist.movie;
//영화 시스템 ==> 메소드 
//1. 데이터를 수집==> 공통으로 사용(static)
//
import java.util.*;
import java.io.*;
public class MovieSystem {//데이터 공용해서 어떻게 하는지
	//공유할 데이터 선언
	private static MovieVO[] movie_data=new MovieVO[1938]; // 데이터 수집
//***사용자 정의 클래스 => 일반 데이터형과 동일하게 사용한다
	//class=> 데이터를 모아서 관리 
	//클래스 배열, String[] => 객체 배열
	//movie_dataa=> 값을 첨부
	static// static변수 초기화 하려면 static영역 만들어야 함 !!{}
	{
		// 초기화 블럭
		try {
			FileReader fr=new FileReader("c:\\javaDev\\movie.txt");
			//파일 읽기
//			String totalFile="";
			StringBuffer sb=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1)//한글자씩 아스키(유니코드)값을 읽어서 i에 들어감
			{						// -1 (EOF => end of file)//한 글자씩 문자 끝날때까지 읽어라
//				totalFile +=String.valueOf((char)i);//숫자로 읽으니까 캐랙터형으로 형변화
				sb.append(String.valueOf((char)i));//위 코드보다 속도 빠름 ..데이터 모아놈
			}
//			System.out.println(sb.toString());
			String movie=sb.toString();
			String[] m=movie.split("\n");//한줄씩 배열요소에 집어넣음
			for(int j=0;j<m.length;j++)
			{
				String[] rm=m[j].split("\\|");//Split => 정규식 ( ^ , $, +, * | , . ) 을 출력하려면 앞에 역슬래쉬 2번 입력해야 함. // AI(형태분석)에서 사용됨ㅋㅋ
				MovieVO vo=new MovieVO();
//아래 코드로		vo.setNo(rm[0]);
				vo.setNo(Integer.parseInt(rm[0]));//String==> int
				//INteger.lparseInt ==> Wrapper( 각 데이터형 별로 클래스가 만들어져 있다.)
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
	//메소드 (영화 관련)
	//1.찾기(제목,출연,장르)=>결과를 받아서 출력 / 메소드 안에 출력
	// 메소드 안에서 결과값을 출력=> void 
	public void titleFind(String title)
	{		
		for(MovieVO vo:movie_data)
		{
			if(vo.getTitle().contains(title))
			{
				//contains(title) => 포함 => 오라클 (LIKE)
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
				//contains(title) => 포함 => 오라클 (LIKE)
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
				//contains(title) => 포함 => 오라클 (LIKE)
				System.out.println(vo.getGenre());
			}
		}
	}
	
	public static void main(String[] args) {
		MovieSystem ms=new MovieSystem();
		Scanner scan=new Scanner(System.in);
		
		System.out.println("영화 제목 입력: ");
		String tile=scan.next();
		ms.titleFind(tile);//사용자가 입력한 건 매개변수로 들어가야 한다 ***
		
		System.out.print("주인공 이름 일력: ");
		String actor=scan.next();
		ms.actorFind(actor);
		
		System.out.println("장르 입력: ");
		String genre=scan.next();
		ms.genreFind(genre);
	}
	
	
	
//	public static void main(String[] args) {
//		for(MovieVO vo:MovieSystem.movie_data) {
//			System.out.println("제목 : "+vo.getTitle());
//			System.out.println("장르: "+vo.getGenre());
//			System.out.println("===================================");
//		}
//	}
}
