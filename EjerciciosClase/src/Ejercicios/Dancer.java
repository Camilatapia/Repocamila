package Ejercicios;

import java.util.Arrays;

public class Dancer {

	public static void main(String[] args) {
		
		int[] numeros = new int [] {3,0,1,8,7,2,5,4,6,9};
		System.out.println("Arreglo a ordenar"+ Arrays.toString(numeros));
	
		int[] numerosAsc = rotar(numeros);
		System.out.println("arreglo ordenado ascendentemente: "+Arrays.toString(numerosAsc));

		

	}
	public static int[] rotar(int[] num){

		int i;
		boolean linea = true;
		int aux;
		
		while(linea) {
			linea=false;
		for( i= 0; i<num.length-1; i++) {
			if(num[i]>num[i+1]) {	
				aux=num[i];
			num[i] = num[i+1];
			num[i+1]= aux;
			linea = true;
			

			}
			
			}
		System.out.println(Arrays.toString(num));
		}
		
		return num;
		
	}
}
