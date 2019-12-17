package com.ipartek.formacion.ejemploaccesodatos.presentacionconsola;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import com.ipartek.formacion.ejemploaccesodatos.accesodatos.Crudable;
import com.ipartek.formacion.ejemploaccesodatos.accesodatos.PersonaMemoria;
import com.ipartek.formacion.ejemploaccesodatos.entidades.Persona;

public class PresentacionConsola {

	public static void main(String[] args) throws IOException {
		//DAO: Data Access Object
		Crudable<Persona> dao = PersonaMemoria.getInstancia();

	/*Siempre sera un objeto dao, este objeto recibe todos los metodos porque esta en PersonaMemoria
	que tiene explicito cada metodo, el remove, put son los metodos propios de un TreeMap, pero si fuese
	un arrayList en vez de put seria add.
	*/		
		
		BufferedReader br0 = new BufferedReader(new InputStreamReader(System.in));
	//	boolean bandera;
		System.out.println("[1lListado" + "\n" + "[2]Buscar" + "\n" + "[3]Crear" + "\n" + "[4]Modificar" + "\n" + "[5]Eliminar"+ "\n" + "[6]Eliminar por rut"+"\n" + "[7]Exportar"+ "\n" +"[8]Guardar");
				        System.out.println("\n Seleccione una opcion");
		String opcion = br0.readLine();		        
		if(opcion.compareTo("1")==0) {
			for(Persona persona: dao.getAll()) {
				System.out.println(persona);
			}
			
		}else if(opcion.compareTo("2")==0) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("Para buscar introduce el rut de la persona: ");

			String rut = br.readLine();	
			Long rutlong = Long.valueOf(rut);
			if(rutlong>0) {
				System.out.println("los datos de la persona son: "+dao.getById(rutlong));
			}else {System.out.println("la persona no se encuentra");}
			
		}else if(opcion.compareTo("3")==0) {
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("para ingresar un nuevo dato introduce el rut: ");
			String rutNuevo = br1.readLine();
			Long rutLongNuevo = Long.valueOf(rutNuevo);
			System.out.println(("introduce nombre: "));
			String nombreNuevo = br1.readLine();
			System.out.println("introduce apellido: ");
			String apellidoNuevo = br1.readLine();
			
			if(rutLongNuevo>0) {dao.insert(new Persona(rutLongNuevo,nombreNuevo,apellidoNuevo));}
			else {System.out.println("datos incorrectos, no se puede INGRESAR");}
			
		}else if(opcion.compareTo("4")==0) {
			BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("para modificar datos de persona introduce el rut: ");
			String rutM = br2.readLine();
			Long rutModif = Long.valueOf(rutM);
			System.out.println(("introduce nombre: "));
			String nombreModif = br2.readLine();
			System.out.println("introduce apellido: ");
			String apellidoModif = br2.readLine();
			
			if(rutModif>0) {dao.update(new Persona(rutModif,nombreModif,apellidoModif));}
			else {System.out.println("datos incorrectos, no se puede MODIFICAR");}
		
		}else if(opcion.compareTo("5")==0) {
			BufferedReader br3 = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("para eliminar datos de persona introduce el rut: ");
			String rutEl = br3.readLine();
			Long rutElim = Long.valueOf(rutEl);
			if(rutElim>0) {dao.delete(rutElim); 
				System.out.println("Dato eliminado correctamente");}
			else {System.out.println("datos no encontrado");}
			
		}
		
		
		//System.out.println("Selecciona la opción que desee realizar: \n 1. Listado \n2. Buscar \n3.Crear \n4.Modificar \n5.Eliminar \n6. Eliminar por rut \n7. Exportar \n8.Guardar");
		
			
		
			//System.out.println(dao.getById(3L)); //BUSCAR DATOS A CAPELA
		
		//System.out.println(dao.insert(new Persona(3L, "Nuevo", "Nuevez"))); //CREAR DATOS A SECAS
		//Ojo con el orden de los Println. Porque el for es el que muestra todos los datos
		//una vez aplicado el delete o los metodos que sean.
		//dao.delete(1L);
		//dao.update(new Persona(2L,"PepeModificar","Perezzz"));
		
	
		for(Persona persona: dao.getAll()) {
			System.out.println(persona);
		}
		
		
		// TODO Menú con opciones numéricas (1. Listado, 2. Crear ... 0. Salir)
		// TODO Exportación/Importación Excel
		// TODO Guardar/Cargar
	}

}
