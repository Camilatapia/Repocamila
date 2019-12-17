package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EstructurasRepetitivas2 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce un numero entero: ");
		
		String num = br.readLine();	
		int N = Integer.parseInt(num);
		
		/*for(int i=N; i>0; i--) {
			System.out.println(+i);
		}*/

		/*while(N>=1) {
			System.out.println("valor de a:"+N);
			N--;
		}*/
		
		/*do {System.out.println("decrede con do-while: "+N); N--;}
		while(N>0);*/
		
		System.out.println("ingresa otro numero diferente: ");
		String num2 = br.readLine();
		int N2 = Integer.parseInt(num2);
	
		//NUMEROS DESDE EL MENOS AL MAYOR
		/*if(N2>=N) {
		for(int i=N; i<=N2; i++) 
			System.out.println(+i);}
		else if(N>=N2) {
			for(int i=N2; i<=N; i++) 
				System.out.println(+i);}
		else {System.out.println("numeros iguales vuelva a ingresar");}*/
		if(N2>N) {
		for(int i=N; i<=N2; i++)	
		if(i%2==0) {
		System.out.println(+i);	
		}}
		else if(N>=N2) {
			System.out.println("El primero debe ser menos que el segundo numero");
			}else {System.out.println("El primero debe ser menos que el segundo numero");}
		
		
		
	}

}
