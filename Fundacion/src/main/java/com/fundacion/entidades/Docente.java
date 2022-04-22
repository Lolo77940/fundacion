package com.fundacion.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "docente")
@Data
@EqualsAndHashCode(callSuper = true)
public class Docente extends Usuario {

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;
}
