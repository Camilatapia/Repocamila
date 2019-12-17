package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BasicosCondicional {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce la hora en formato 0 a 24 hrs: ");
		
		String num1 = br.readLine();	
		int hora = Integer.parseInt(num1);
		
		
		
		if(0<=hora && hora<=24) {
			System.out.println("introduce minutos 0 a 60 min: ");
			String num2 = br.readLine();
			int minuto = Integer.parseInt(num2);
			if(0<=minuto && minuto<=59) {
				System.out.println("introduce segundos de 0 a 60: ");
				String num3 = br.readLine();
				int segundos = Integer.parseInt(num3);
				if(0<=segundos && segundos<=59) {
					System.out.println("la hora introducida es "+hora+" : "+minuto+" : "+segundos);
				}else {System.out.println("formato de segundos erroneo");}
			}else {System.out.println("formato de minutos erroneo");}
		}else {System.out.println("formato de horas erroneo");}
		
	}

}
