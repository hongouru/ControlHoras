package org.controlhoras.app;

import java.util.Date;

import org.controlhoras.dao.EmpleadoDAO;
import org.controlhoras.dao.EmpleadoDAOImpl;
import org.controlhoras.entity.Empleado;
import org.controlhoras.entity.HibernateUtil;
import org.controlhoras.entity.Jornal;
import org.hibernate.Session;

public class Main {

	public static void main(String[] args) {
		System.out.println("##########################################");
		System.out.println("########CONTROL HORAS APPLICACTION########");
		System.out.println("##########################################");
		System.out.println();
		System.out.println();

		EmpleadoDAO emp = new EmpleadoDAOImpl();
		String noms = "Ashly Muszynski  ,"
				+ "Joesph Ines  ,"
				+ "Phyliss Rago  ,"
				+ "Kira Applebee  ,"
				+ "Ami Mull  ,"
				+ "Janae Ganser  ,"
				+ "Harlan Hysmith  ,"
				+ "Ryan Casagrande  ,"
				+ "Jonelle Wright  ,"
				+ "Tori Friedrich  ,"
				+ "Angelena Coelho  ,"
				+ "Mellisa Veitch  ,"
				+ "Rayford Askins  ,"
				+ "Shirl Skeete  ,"
				+ "Celeste Secord  ,"
				+ "Anjelica Glessner  ,"
				+ "Janiece Montemayor  ,"
				+ "Chadwick Furguson  ,"
				+ "Emilee Davenport  ,"
				+ "Leonor Sloss";
		String[] lista = noms.split(",");
		for (int i = 0; i < 20; i++) {
			Empleado e = new Empleado();
			e.setNomEmpleado(lista[i]);
			System.out.println(lista[i]);
			emp.addEmpleado(e);
		}

//		Session s3 = HibernateUtil.getSessionFactory().openSession();
		
		
		HibernateUtil.getSessionFactory().close();

	}

}
