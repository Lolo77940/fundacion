package com.fundacion.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table(name = "administrador")
@Data

public class Administrador extends Usuario{
	@Column(name = "username")
	private String username;
	@Column(name = "password")
	private String password;
}
