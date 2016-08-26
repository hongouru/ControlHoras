package org.controlhoras.dao;

import java.util.List;

import org.controlhoras.entity.Empleado;


public interface EmpleadoDAO {
	
	public void addEmpleado(Empleado empleado);
	
	public List<Empleado> listEmpleado();
	
	public void removeEmpleado(Integer idEmpleado);
	
	public void updateEmpleado(Empleado empleado);
	
}
