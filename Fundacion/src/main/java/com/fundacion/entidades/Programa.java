package com.fundacion.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "programa")
public class Programa {
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column (unique = true ,name = "id_programa")
	private String idPrograma;
	@Column (name = "nombre") 
	private String nombre;
	@Column (name = "descripcion") 
	private String descripcion;
	@Column (name = "img") 
	private String img;
	
}
