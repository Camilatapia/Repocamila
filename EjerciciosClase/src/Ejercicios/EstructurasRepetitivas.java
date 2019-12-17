package Ejercicios;

public class EstructurasRepetitivas {

	public static void main(String[] args) {
		int x=1;
		while(x<=100) {
			System.out.println("valor de x:"+x);
			x++;
		}
		int y=1;
		do {
			System.out.println("valor de x con do-while:"+y);
			y++;
		}while(y<=100);
		
		for(int i=1; i<=100; i++) 
			System.out.println(+i);
		int a=100;
		while(a>=1) {
			System.out.println("valor de a:"+a);
			a--;
		}
		//DESDE 1 HA1STA N
		/*for(int i=1; i<i+1; i++) {
			System.out.println("hasta n: "+i);
		}*/
		/*int rep1=1;
		while(rep1 <rep1+1){ System.out.println("se repite: "+rep1); rep1++;}*/
		/*int rep2=1;
		do {
			System.out.println("se repite con do-while: "+rep2); rep2++;
		}while(rep2<rep2+1);*/
		
		
		
	}

}
