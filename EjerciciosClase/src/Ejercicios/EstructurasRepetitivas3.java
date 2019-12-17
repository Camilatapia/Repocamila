package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EstructurasRepetitivas3 {
//NUMEROS DE N A M, MUESTRA MULTIPLOS DE N
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce un numero entero: ");
		
		String num = br.readLine();	
		int N = Integer.parseInt(num);

		System.out.println("ingresa otro numero diferente: ");
		String num2 = br.readLine();
		int M = Integer.parseInt(num2);
		
		if(N<M) {
			for(int i=1; i<=M; i++)
				if(i%N==0) {
				System.out.println(+i);}
				}else {System.out.println("El primer numero debe ser menor que el segundo");}
		
	}

}
