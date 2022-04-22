package com.fundacion.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import com.fundacion.enumeraciones.TipoDonacion;
import com.fundacion.enumeraciones.TipoDonante;

import lombok.Data;

@Entity
@Data 
@Table(name = "donador")
public class  Donador extends Visitante {
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")	
	protected String idDonador;
	@Column(name = "monto")
	protected Double monto;
	@Column(name = "fecha")
	@Temporal(TemporalType.TIMESTAMP)	
	protected Date fecha = new Date();
	@Column(name = "tipo_donacion")
	@Enumerated(EnumType.STRING)
	protected TipoDonacion tipoDonacion;
	@Column(name = "tipo_donante")
	@Enumerated(EnumType.STRING)
	protected TipoDonante tipoDonante;
}
