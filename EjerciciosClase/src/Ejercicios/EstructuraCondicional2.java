package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EstructuraCondicional2 {

	public static void main (String[] args) throws IOException {
		
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/*EVALUAR MAYUSCULA Y MINUSCULA DE CHARS: LEE SOLO UN CARACTER!*/
	System.out.println("introduce un caracter: ");
	char caracter = br.readLine().charAt(0);
	//char caracter = (char) System.in.read ();
	System.out.println("el char es "+caracter);
		if(Character.isLowerCase(caracter)) {
		System.out.println(caracter+" es minuscula");
		}else if(Character.isUpperCase(caracter)){
		System.out.println(caracter+" es mayuscula");
		} else {//USAR PARA CUANDO LEA MAS DE UN CHAR
		System.out.println("tiene mayus y minus");
		}
	

	System.out.println("introduzca un caracter: ");
	char car1 = br.readLine().charAt(0);
	System.out.println("introduzca otro caracter: ");
	char car2 = br.readLine().charAt(0);
	
	if(car1 == car2) {
		System.out.println("son iguales");
	} else {
		System.out.println("no son iguales");
		}
	
	System.out.println("introduzca un caracter: ");
	char car3 = br.readLine().charAt(0);
	System.out.println("introduzca otro caracter: ");
	char car4 = br.readLine().charAt(0);
	
	
	if(Character.isLowerCase(car3)) {
		if(Character.isLowerCase(car4)) {
		System.out.println("los dos son minusculas");
	}else{
		System.out.println("uno es mayuscula y el otro es minuscula");
		}
		}else {System.out.println("ambos son mayusculas");}
	
	
	System.out.println("introduce un caracter: ");
	char dig = br.readLine().charAt(0);
	if(Character.isDigit(dig)==true) {
		System.out.println("el caracter es un numero");
	}else {System.out.println("el caracter no es un numero");}
	
	}
	
/*	public static boolean esMayuscula(String s) {
		
		// Regresa el resultado de comparar la original con su versión mayúscula
		return s.equals(s.toUpperCase());
	}

	public static boolean esMinuscula(String s) {
		// Regresa el resultado de comparar la original con su versión minúscula
		return s.equals(s.toLowerCase());
	}*/
	
	
	}

