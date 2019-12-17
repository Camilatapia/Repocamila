package Ejercicios;

import java.util.Arrays;

public class Abcdario {

	public static void main(String[] args) {
	/*	String cadena="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
		char[] aCaracteres = cadena.toCharArray();
		for (int x=0;x<aCaracteres.length;x++)
			System.out.println(String.valueOf(aCaracteres[aCaracteres.length-x]));*/
for(char x='Z';x>='A';x--) {
		for(char i=x ;i>='A';i--) {
			System.out.print(String.valueOf(i));
		}System.out.println();
		}
		
//imprime ABCdario de Z a A
		for(char y='Z';y>='A';y--) {System.out.print(y);}
		System.out.println();
//imprime ABCdario de A a Z
		for(char y1='A';y1<='Z';y1++) {System.out.print(y1);}
	}

}
