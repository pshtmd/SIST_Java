package com.sist.main;

public class starSort {
	public static void main(String[] args) {
		
		
		/*
		 * 		*
		 * 		**
		 * 		***
		 */
		for(int i=1;i<4;i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * 		***
		 * 		**
		 * 		*		 
		 */		
		for(int i=4;i>0;i--) {
			for(int j=1;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
				
	}

}
