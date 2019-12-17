package Ejercicios;

import java.util.*;

public class EstructuralesSecuenciales {

	public static void main(String[] args) {
		double r, v;
		Scanner sc9 = new Scanner(System.in);
		System.out.println("introduce el radio de la esfera: ");
		r=sc9.nextDouble();
		v=(4.0/3)*Math.PI*Math.pow(r, 3);
		System.out.println("el volumen de la esfera es "+v);
		
		double a,b,c,p,area;
		Scanner sc10=new Scanner(System.in);
		System.out.println("introduce un lado del triangulo :");
		a=sc10.nextDouble();
		System.out.println("introduce otro lado del triangulo :");
		b=sc10.nextDouble();
		System.out.println("introduce otro lado del triangulo :");
		c=sc10.nextDouble();
		p=(a+b+c)/2;
		area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println("el area es "+area);
		
		
		
		//int digitos;
	//	digitos= Integer.toString(num).length();
		
		Integer numeroleido;
		Scanner sc11=new Scanner(System.in);
		System.out.println("introduce un numero entero de 3 digitos:");
		numeroleido = sc11.nextInt();
		System.out.println("el numero es "+numeroleido);
	
		    char[] num = numeroleido.toString().toCharArray();
	        for(char digitos: num) {
	            System.out.print(digitos + " ");
	        } // else {
		
	        	//System.out.println("Ingrese un numero correcto");
		//}
	        
		
			
			
		}
		
		
		
	}


