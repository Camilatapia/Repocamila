package Ejercicios;

import java.util.*;

public class Basicos {

	
	public Basicos() {
		
	}

	public static void main(String[] args) {
		int a,b;
		//lee dos enteros
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce numero:");
		a = sc.nextInt();
		System.out.println("el numero es " + a);
		System.out.println("introduce otro numero:");
		b=sc.nextInt();
		System.out.println("el numero es "+ b);
		//lee un/unos nombres 
		String nombre;
		Scanner sc2 = new Scanner(System.in);
		System.out.println("dime tu nombre: ");
		nombre = sc2.nextLine();
		System.out.println("Buenos días "+nombre);
		
		int c,c1,c2;
		Scanner sc3 = new Scanner(System.in);
		System.out.println("dime un numero: ");
		c=sc3.nextInt();
		c1=c*2;
		c2=c*3;
		System.out.println("el doble del numero es "+c1+" y el triple del numero es "+c2);
		
				
		
	}
	

}
