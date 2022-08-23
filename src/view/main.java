package view;

import controller.fibonnaci;

public class main {
	/*
	 *  Considere a série de Fibonacci:
 	1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ...*/
	
	public static void main(String[] args) {
		
		fibonnaci f = new fibonnaci();
		
		int num = 6;
		
		int soma = f.fibonnaci(num);
		
		System.out.println(soma);
		
	}

}
