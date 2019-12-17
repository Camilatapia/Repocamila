package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EstructurasRepetitivas4 {
	public static void main(String[] args) throws IOException {
		int N; 
			
		do {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Introduce un numero entero distinto de 0: ");
			String num = br.readLine();	
			 N = Integer.parseInt(num);
		} while (N==0);

			
		//IDENTIFICA POSITIVO/NEGATIVO Y PAR/IMPAR	
		/*if(N>0) {System.out.println("es un numero positivo");
				if(N%2==0) {
				System.out.println(+N+" y ademas es par");}else {System.out.println(+N+" y es impar");}
				
				}
		else if(N==0){System.out.println("es 0");}
		else {System.out.println("es un numero negativo");
			if(N%2==0) {System.out.println("y ademas es par");}else{System.out.println("y ademas es impar");}}*/
			
		if(N !=0) {
		double KM=N*1.609;
		System.out.println("corresponde a "+KM+" km");}else {System.out.println("introduce un numero entero distinto de 0");}
		
	}
	
}
