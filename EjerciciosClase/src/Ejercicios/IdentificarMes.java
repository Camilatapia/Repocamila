package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IdentificarMes {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce un mes: ");
		
		String num1 = br.readLine();	
		int mes = Integer.parseInt(num1);
		
		
		if(1<=mes && mes<=12) {
		switch(mes) {
		case 1: mes=1;
		System.out.println("el mes es enero");
		break;
		case 2: mes=2;
		System.out.println("el mes es febrero");
		break;
		case 3: mes=3;
		System.out.println("el mes es marzo");
		break;
		case 4: mes=4;
		System.out.println("el mes es abril");
		break;
		case 5: mes=5;
		System.out.println("el mes es mayo");
		break;
		case 6: mes=6;
		System.out.println("el mes es junio");
		break;
		case 7: mes=7;
		System.out.println("el mes es julio");
		break;
		case 8: mes=8;
		System.out.println("el mes es agosto");
		break;
		case 9: mes=9;
		System.out.println("el mes es septiembre");
		break;
		case 10: mes=10;
		System.out.println("el mes es octubre");
		break;
		case 11: mes=11;
		System.out.println("el mes es noviembre");
		break;
		case 12: mes=12;
		System.out.println("el mes es diciembre");
		break;
		} 
		}else{System.out.println("ingreso incorrecto del mes");}
		
		if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {System.out.println("el mes tiene 31 dias ");}
		else if(mes==2) {System.out.println("el mes tiene 28 dias");}
		else if(mes==4 || mes==6 || mes==9 || mes==11){System.out.println("el mes tiene 30 dìas");}
		else {System.out.println("ingresar nuevamente el mes de 1 a 12");}
	}

}
