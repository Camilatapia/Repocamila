package com.ipartek.formacion.ejemploaccesodatos.accesodatos;

import java.util.TreeMap;

import com.ipartek.formacion.ejemploaccesodatos.entidades.Persona;

public class PersonaMemoria implements Crudable<Persona> {
	//podriaser private ArrayList<Alumno> alumnos = new ArrayList();
	
	private TreeMap<Long, Persona> personas = new TreeMap<>();//en este caso el TreeMap debe recibir un tipo de dato de Persona
	//T no puede ser primitivo
	//SINGLETON: es para que no cree mas de uno de este tipo
	
	private PersonaMemoria() {
		personas.put(1L, new Persona(1L, "Javier", "Lete"));
		personas.put(2L, new Persona(2L, "Pepe", "Pérez"));
		//esto como para crear datos iniciales, pero los metodos deben funcionar en la PresentacionConsola
	}
	//private final AlumnoArrayList INSTANCIA = new AlumnoArrayListo();
	private final static PersonaMemoria INSTANCIA = new PersonaMemoria();
	
	public static PersonaMemoria getInstancia() {
		return INSTANCIA;
	}
	
	//FIN SINGLETON
	//public Iterable <Alumno> obtenerTodos(): metodo que yo creare, se hace automatico
	@Override
	public Iterable<Persona> getAll() {
		return personas.values();
	}

	@Override
	public Persona getById(Long id) {
	return personas.get(id);
			
	}

	@Override
	public Persona insert(Persona persona) {
	
		personas.put(persona.getId(), persona);
		return persona;
	}

	@Override
	public Persona update(Persona persona) {
	personas.replace(persona.getId(), persona);
	return persona;
	}

	@Override
	public Persona delete(Persona persona) {
		
	personas.remove(persona.getId(), persona);
	return persona;
	}

	@Override
	public Persona delete(Long id) {
		return personas.remove(id);
		
	}


	

}
