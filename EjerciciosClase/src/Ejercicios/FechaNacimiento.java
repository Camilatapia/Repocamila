package Ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.TemporalAccessor;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;


public class FechaNacimiento {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Introduzca la fecha con formato dd/mm/yyyy: ");
             String fecha = br.readLine();
             String [] parts=fecha.split("/");
             String part1 = parts[0];
             String part2 = parts[1];
             String part3 = parts[2];
             
             System.out.println(Arrays.toString(parts));
             int año = Integer.parseInt(part3);
             int mes = Integer.parseInt(part2);
             int dia = Integer.parseInt(part1);
             
             int suma1=0, suma2=0, suma3= 0;
             int suma11=0, suma22=0, suma33=0;
        /*obtener fecha como String, aplicarle Split() y em entrega un array String[] parts = [20,04,1989]
         * el 20 sera el parts[0], el 04 sera el parts[1], el año 1989 parts[2]. despues redefino cada posicion
         * con dia, mes y año y los transformo a int y sumo por separado.
         * 
         */

		while(año!=0) {
			suma1=suma1+(año%10);
			año=año/10;
			suma2=suma2+(mes%10);
			mes=mes/10;
			suma3=suma3+(dia%10);
			dia=dia/10;
					}
		System.out.println("la suma de año mes y dia es "+suma1+" "+suma2+" "+suma3);
		while(suma1!=0) {
			suma11=suma11+(suma1%10);
			suma1=suma1/10;
			suma22=suma22+(suma2%10);
			suma2=suma2/10;
			suma33=suma33+(suma3%10);
			suma3=suma3/10;
		}
		int sumaTotal=suma11+suma22+suma33;
		System.out.println("su numero de la suerte es "+String.valueOf(sumaTotal));
	}

}
