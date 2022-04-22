package com.fundacion.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "visitante")
@Data
@EqualsAndHashCode(callSuper = true)
public class Visitante extends Usuario {

	@Column(name = "telefono")
	private long telefono;

	@Column(name = "provincia")
	private String provincia;

	@Column(name = "localidad")
	private String localidad;

	@Column(name = "codigoPostal")
	private String codigoPostal;

}
