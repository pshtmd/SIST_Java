package com.sist.movie;
//�����͸� ���� => ��ȭ 1����
/*
 * 1|
 * ���ũ Ż��|
 * ���|
 * https://movie-phinf.pstatic.net/20160119_278/14531650465287bcuk_JPEG/movie_image.jpg?type=m77_110_2|�� �κ�(�ص� ��������), ��� ������(������ ���̵� ���� ����)|2016 .02.24 �簳��, 1995 .01.28 ����|15�� ������|����ũ �ٶ�Ʈ

 */
//����� ���� ��������
//�⺻ �������� (����, �Ǽ�, ��,����...)
/*
 * 1. �ٸ� ���������� ��Ƽ� ����(����� ���� ��������)
 * 2. ����� ������ �ִ� Ŭ���� (��ȭ) ���, �˻�, �⿬�� ��ȭ��...
 * 
 */
//�������� Ŭ���� => ĸ��ȭ ��� (�����͸� ��ȣ) => ������ �޼ҵ�
//�������� (�б� getter  /���� setter )
//ĸ��ȭ 
public class MovieVO { // ������ ����ִ� ���
	private int no;
	private String title;
	private String genre;
	private String poster;
	private String actor;
	private String regdate;
	private String grade;
	private String director;
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	
	
	
}
