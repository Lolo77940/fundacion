package com.fundacion.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.annotations.GenericGenerator;

import com.fundacion.enumeraciones.Rol;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Usuario {
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")	
	protected String idUsuario;
	@Column(unique = true,name = "email")
	protected String email;	
	@Column(name = "nombre")
	protected String nombre;
	@Column(name = "estado")
	protected Boolean estado;
	@Enumerated(EnumType.STRING)
	protected Rol rol;
}
