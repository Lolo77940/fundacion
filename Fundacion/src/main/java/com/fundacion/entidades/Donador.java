package com.fundacion.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fundacion.enumeraciones.TipoDonacion;
import com.fundacion.enumeraciones.TipoDonante;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table(name = "donador")
@Data
@EqualsAndHashCode(callSuper = true)
public class Donador extends Visitante {

	@Column(name = "monto")
	protected Double monto;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fecha")
	protected Date fecha = new Date();

	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_donacion")
	protected TipoDonacion tipoDonacion;

	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_donante")
	protected TipoDonante tipoDonante;
}
