package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Generales1 {

	public static void main(String[] args) throws IOException {
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce un numero entero: ");
		String num = br.readLine();	
		int A = Integer.parseInt(num);
		
		System.out.print("Introduce otro numero entero: ");
		String num1 = br.readLine();	
		int B = Integer.parseInt(num1);*/
		
	//	int digitos = (int)(Math.log10(num)+1);
		//System.out.println("el numero tiene "+ num.length());
		int division;
		int divisor;
		int suma=0;
		
	/*	for(divisor=1; divisor<A; divisor++) {
		if(A%divisor==0) {
			suma=suma+divisor;
		}}*/
	int x,divisor1,suma1;
		
		for( x=1; x<=1000; x++) {
			suma1=0;
				for( divisor1=1; divisor1<x; divisor1++) {
					
				if(x%divisor1==0) {
					
					suma1=suma1+divisor1;
				}}
				if(suma1==x) {System.out.println(String.valueOf(x));}
				
			}
			
		}

	}


