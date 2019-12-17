package com.ipartek.formacion.ejemploaccesodatos.entidades;

import com.ipartek.formacion.ejemploaccesodatos.accesodatos.Crudable;

public class Persona {
	private static final String REGEX_NOMBRE = "[\\p{L} ]+";//"[a-zA-Z;
	private static final String REGEX_APELLIDOS = "[\\p{L} ']+";
	
	private Long id;
	private String nombre, apellidos;
	
	public Persona(Long id, String nombre, String apellidos) {
		super();

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
	if(nombre==null || nombre.trim().length()==0) {
		throw new EntidadesExcepcion("nombre es obligatorio");	}
	if(!nombre.matches(REGEX_NOMBRE)) {
		throw new EntidadesExcepcion("solo se admiten caracteres de letras y espacios");
	}
	this.nombre=nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		if(apellidos==null || apellidos.trim().length()==0) {
			throw new EntidadesExcepcion("apellidos es obligatorio");	}
		if(!apellidos.matches(REGEX_APELLIDOS)) {
			throw new EntidadesExcepcion("solo se admiten caracteres de letras y espacios");
		}
		this.apellidos = apellidos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidos == null) ? 0 : apellidos.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (apellidos == null) {
			if (other.apellidos != null)
				return false;
		} else if (!apellidos.equals(other.apellidos))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}

	
	
	
}
