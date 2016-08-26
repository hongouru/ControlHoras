package org.controlhoras.entity;


import java.io.Serializable;
import java.util.Date;

public class Jornal implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//private int idJornal;
	private Date fechaJornal;
	private Empleado empleado;
	private Date horaEntrada;
	private Date horaSalida;
	
	
	public Date getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(Date horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public Date getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}

	
	
	/*public int getIdJornal() {
		return idJornal;
	}

	public void setIdJornal(int idJornal) {
		this.idJornal = idJornal;
	}
*/
	public Date getFechaJornal() {
		return fechaJornal;
	}

	public void setFechaJornal(java.util.Date date) {
		this.fechaJornal = date;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Jornal j2 = (Jornal)obj;
		if(this.getFechaJornal().equals(j2.getFechaJornal()) && 
				this.getEmpleado().getIdEmpleado() == j2.getEmpleado().getIdEmpleado())
					return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {

		return super.hashCode();
	}
	
}
