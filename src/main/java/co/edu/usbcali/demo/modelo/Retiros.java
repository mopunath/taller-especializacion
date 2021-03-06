package co.edu.usbcali.demo.modelo;
// Generated 22/04/2016 07:50:35 PM by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.NotNull;

/**
 * Retiros generated by hbm2java
 */
public class Retiros implements java.io.Serializable {

	@NotNull
	private long retCodigo;
	
	@NotNull
	private String cueNumero;

	@NotNull
	private Usuarios usuarios;
	
	private Cuentas cuentas;

	@NotNull
	private BigDecimal retValor;
	
	@NotNull
	private Date retFecha;
	
	@NotNull
	private String retDescripcion;

	public Retiros() {
	}

	public Retiros(long retCodigo, String cueNumero, Cuentas cuentas, BigDecimal retValor, Date retFecha, String retDescripcion) {
		this.retCodigo = retCodigo;
		this.cueNumero = cueNumero;
		this.cuentas = cuentas;
		this.retValor = retValor;
		this.retFecha = retFecha;
		this.retDescripcion = retDescripcion;
	}

	public Retiros(long retCodigo, String cueNumero, Usuarios usuarios, Cuentas cuentas, BigDecimal retValor, Date retFecha,
			String retDescripcion) {
		this.retCodigo = retCodigo;
		this.cueNumero = cueNumero;
        this.usuarios = usuarios;
		this.cuentas = cuentas;
		this.retValor = retValor;
		this.retFecha = retFecha;
		this.retDescripcion = retDescripcion;
	}
	
	public long getRetCodigo() {
		return this.retCodigo;
	}

	public void setRetCodigo(long retCodigo) {
		this.retCodigo = retCodigo;
	}

	public String getCueNumero() {
		return this.cueNumero;
	}

	public void setCueNumero(String cueNumero) {
		this.cueNumero = cueNumero;
	}


	public Usuarios getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	public Cuentas getCuentas() {
		return this.cuentas;
	}

	public void setCuentas(Cuentas cuentas) {
		this.cuentas = cuentas;
	}

	public BigDecimal getRetValor() {
		return this.retValor;
	}

	public void setRetValor(BigDecimal retValor) {
		this.retValor = retValor;
	}

	public Date getRetFecha() {
		return this.retFecha;
	}

	public void setRetFecha(Date retFecha) {
		this.retFecha = retFecha;
	}

	public String getRetDescripcion() {
		return this.retDescripcion;
	}

	public void setRetDescripcion(String retDescripcion) {
		this.retDescripcion = retDescripcion;
	}

}
