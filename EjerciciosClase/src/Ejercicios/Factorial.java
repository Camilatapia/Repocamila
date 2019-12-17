package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce un numero entero: ");
	//	int factorial = 1;
		String num = br.readLine();	
		int N = Integer.parseInt(num);
		for(int i=0; i<=N; i++) {
		int	factorial=1;
			for(int j=1;j<=i; j++) {
		factorial=factorial*(j);}
			System.out.println(String.valueOf(factorial));}
		
		
			
	}

}
