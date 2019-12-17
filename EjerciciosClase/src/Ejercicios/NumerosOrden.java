package Ejercicios;

import java.util.Scanner;

public class NumerosOrden {

	public static void main(String[] args) {
		int numeroleido;
		Scanner sc11=new Scanner(System.in);
		System.out.println("introduce un numero entero de 5 digitos:");
		numeroleido = sc11.nextInt();
		System.out.println("el numero es "+numeroleido);
	
		System.out.println(+numeroleido/10000);
		System.out.println(+numeroleido/1000);
		System.out.println(+numeroleido/100);
		System.out.println(+numeroleido/10);
		System.out.println(+numeroleido);
		
		int numeroleido2;
		Scanner sc12=new Scanner(System.in);
		System.out.println("introduce un numero entero de 5 digitos:");
		numeroleido2 = sc11.nextInt();
		System.out.println("el numero es "+numeroleido2);
	
		System.out.println(+numeroleido2%10);
		System.out.println(+numeroleido2%100);
		System.out.println(+numeroleido2%1000);
		System.out.println(+numeroleido2%10000);
		System.out.println(+numeroleido2);

	}

}
