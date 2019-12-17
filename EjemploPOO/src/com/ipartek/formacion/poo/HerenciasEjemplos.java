package com.ipartek.formacion.poo;

import java.io.ObjectInputStream.GetField;

public class HerenciasEjemplos {

	public static void main(String[] args) {
		Persona p= new Persona();
		//Empleado e=(Empleado) p; //no funciona y no se puede castear
		Empleado e2=new Empleado();
		Persona p2=e2;
		//este caso significa que todo empleado es una persona
		//pero no todo persona es un empleado
		System.out.println(p2==e2);
		System.out.println(p2.getClass());//dice que es Empleado, porque una vz wue lo declaras,  ununca ddja de derlo
		Empleado e3= (Empleado) p2; //esta se puede castear poque p2 ya era empleado, no se hizo con new Persona
		System.out.println(e3.getSueldo()); //ahora si puedo preguntar el sueldo y no dice error
		//¿cuantos objetivos hay? solo 2, los que llevan "new"
		//¿cuantos empleados hay? solo 1 que es el objeto de tipo empleado
		//¿cuantas referencias hay? hay 4 son todas las declaraciones
		
	}

}
