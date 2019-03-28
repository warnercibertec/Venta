package com.venta.entities;

// Generated Jan 15, 2013 11:21:45 AM by Hibernate Tools 3.6.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Corte generated by hbm2java
 */
@Entity
@Table(name = "CORTE")
public class Corte implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Long idCorte;
	private Empleado empleado;
	private Date fechaInicio;
	private Date fechaFinal;

	public Corte() {
	}

	public Corte(Empleado empleado) {
		this.empleado = empleado;
	}

	public Corte(Empleado empleado, Date fechaInicio, Date fechaFinal) {
		this.empleado = empleado;
		this.fechaInicio = fechaInicio;
		this.fechaFinal = fechaFinal;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ID_CORTE", unique = true, nullable = false)
	public Long getIdCorte() {
		return this.idCorte;
	}

	public void setIdCorte(Long idCorte) {
		this.idCorte = idCorte;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "ID_EMPLEADO", nullable = false)
	public Empleado getEmpleado() {
		return this.empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECHA_INICIO", length = 19)
	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "FECHA_FINAL", length = 19)
	public Date getFechaFinal() {
		return this.fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

}
