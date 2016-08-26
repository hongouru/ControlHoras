package org.controlhoras.entity;



//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;


//@Entity
//@Table(name="EMPLEADOS")
public class Empleado{
	
//	@Id
//	@GeneratedValue
//	@Column(name="idEmp")
	private Integer idEmpleado;
	
	public Integer getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Integer idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNomEmpleado() {
		return nomEmpleado;
	}

	public void setNomEmpleado(String nomEmpleado) {
		this.nomEmpleado = nomEmpleado;
	}
	
//	@Column(name="Nombre")
	private String nomEmpleado;
	
	public Empleado()
	{
		
	}
	
	public Empleado(Integer idEmp, String nomEmp)
	{
		this.idEmpleado = idEmp;
		this.nomEmpleado = nomEmp;
	}

}
