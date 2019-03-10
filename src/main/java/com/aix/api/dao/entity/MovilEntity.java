package com.aix.api.dao.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="movil")
public class MovilEntity {
	@Id
	private String id;
	private String nombre;
	private String marca;
	private String descripcion;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "MovilEntity [id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", descripcion=" + descripcion
				+ "]";
	}
	
}
