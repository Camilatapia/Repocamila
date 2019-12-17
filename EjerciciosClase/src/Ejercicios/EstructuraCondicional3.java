package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EstructuraCondicional3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce un numero entero: ");
		String num1 = br.readLine();	
		double dividendo = Double.parseDouble(num1);
		
		System.out.print("Introduce otro numero entero: ");
		String num2 = br.readLine();
		double divisor = Double.parseDouble(num2);
		
		if(divisor != 0) {
			System.out.println("la división es "+(dividendo/divisor));
		}else {System.out.println("el divisor es 0, entrega un Complejo");}
		
		
		System.out.println("introduce numero 1: ");
		String numero1 = br.readLine();
		int n1 = Integer.parseInt(numero1);
		System.out.println("introduce numero 2: ");
		String numero2 = br.readLine();
		int n2 = Integer.parseInt(numero2);
		System.out.println("introduce numero 3: ");
		String numero3 = br.readLine();
		int n3 = Integer.parseInt(numero3);
				
		if(n1>n2 && n1>n3) {
			if(n1>n3) {System.out.println("el numero 1 es mayor");}
			else {System.out.println("el numero 3 es mayor");}	
			}	
		if(n2>n1) {
			if(n2>n3) {System.out.println("el numero 2 es mayor");}
			else {System.out.println("el numero 3 es mayor");}
			}	
		/*if(n3>n1) {
			if(n3>n2) {System.out.println("el numero 3 es mayor");}
			else {System.out.println("el numero 2 es mayor");}
			}*/
		if(n1==n2 || n2==n3) {
	if(n2>n3) {System.out.println("el numero 1 y 2 son iguales y mayores");}
			else if(n2>n1) {System.out.println("el numero 2 y 3 son iguales y mayores");}
			else if(n3>n2){System.out.println("el numero 1 y 2 son iguales y el 3 mayor");}
		}else {System.out.println("fin");}
		
	
	}

}
