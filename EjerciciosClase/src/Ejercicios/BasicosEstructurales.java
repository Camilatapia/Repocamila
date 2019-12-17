package Ejercicios;

import java.util.*;

public class BasicosEstructurales {

	public BasicosEstructurales() {
	}

	public static void main(String[] args) {
		double f,f1;
	
		Scanner sc4 = new Scanner(System.in);
		System.out.println("introduce grados: ");
		f=sc4.nextDouble();
		f1=32+(9*f/5);
		System.out.println("los "+f+" grados celsius , equivalen a "+f1+" grados Farenheit ");
		
		double r,l,a;
		Scanner sc5 = new Scanner(System.in);
		System.out.println("introduce el radio de la circunferencia: ");
		r=sc5.nextDouble();
		l=2*Math.PI*r;
		a=Math.PI*Math.pow(r, 2);
		System.out.println("la longitud es "+l+" y el area es "+a);
		
		double vkm,vmt;
		Scanner sc6=new Scanner(System.in);
		System.out.println("introduce velocidad en km/hr: ");
		vkm=sc6.nextDouble();
		vmt=vkm*10/36;
	
		System.out.println("la velocidad en mt/s es: "+vmt);
		
		double cat1,cat2,hip;
		Scanner sc7=new Scanner(System.in);
		Scanner sc8=new Scanner(System.in);
		System.out.println("introduce un cateto: ");
		cat1 = sc7.nextDouble();
		System.out.println("introduce el otro catero del triangulo: ");
		cat2 = sc8.nextDouble();
		hip = Math.sqrt(Math.pow(cat1,2)+Math.pow(cat2, 2));
		System.out.println("la longitud de la hipotenusa es: "+hip);
		
		
	}

}
