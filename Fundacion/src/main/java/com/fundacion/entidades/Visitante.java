package com.fundacion.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "visitante")
@Data
public class Visitante extends Usuario {
	@Column(name = "telefono")
	private long telefono;
	@Column(unique = true,name = "dni")
	private String dni;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "provincia")
	private String provincia;
	@Column(name = "localidad")
	private String localidad;
	@Column(name = "codigoPostal")
	private String codigoPostal;
		
}
