package controller;

public class fibonnaci {

	public fibonnaci() {
		super();
	}
	
	public int fibonnaci(int n) { //fun��o recursiva
		if(n == 0)//condi��o de parada
	        return 0;
	    else if(n == 1)
	      return 1;
	   else
	      return fibonnaci(n - 1) + fibonnaci(n - 2);//calculo realizado
	}
}
