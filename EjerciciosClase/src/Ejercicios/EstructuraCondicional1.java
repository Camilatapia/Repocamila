package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EstructuraCondicional1 {

	public static void main(String[] args) throws IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.print("Introduce un numero entero: ");
	
	String num = br.readLine();	
	int numeroEv = Integer.parseInt(num);
	System.out.println("el numero es "+numeroEv);
	
		if(numeroEv%2 == 0) {
		System.out.println("El numero es par");
		} else {
		System.out.println("el numero es impar");
		}
	
	System.out.print("Introduce un segundo numero entero: ");
	String num2 = br.readLine();
	int numeroEv2 = Integer.parseInt(num2);
	System.out.println("el numero es "+numeroEv2);
	
		if(numeroEv2%10 == 0) {
		System.out.println("Y si es multiplo de 10");
		} else {System.out.println("y no es multiplo de 10");
		}
	
	}
}

