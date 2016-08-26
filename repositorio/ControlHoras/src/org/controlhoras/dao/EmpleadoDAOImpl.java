package org.controlhoras.dao;

import java.util.ArrayList;
import java.util.List;

import org.controlhoras.entity.Empleado;
import org.controlhoras.entity.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

public class EmpleadoDAOImpl implements EmpleadoDAO{
	
	@Override
	public void addEmpleado(Empleado empleado)
	{
		try{
		//Session s = HibernateUtil.getSessionFactory().openSession();
		Session s = HibernateUtil.getSessionFactory().openSession();
		s.beginTransaction();
		s.save(empleado);
		s.getTransaction().commit();
		s.close();
		
		System.out.println("addEmpleado()");
		}catch(HibernateException he)
		{
			he.printStackTrace();
			System.exit(0);
		}
	}
	
	@Override
	public List<Empleado> listEmpleado()
	{
		System.out.println("listEmpleado()");
		return new ArrayList<Empleado>();
	}
	
	@Override
	public void removeEmpleado(Integer idEmpleado)
	{
		System.out.println("removeEmpleado()");
	}
	
	@Override
	public void updateEmpleado(Empleado empleado)
	{
		System.out.println("updateEmpleado()");
	}
	
	
	
	
}
