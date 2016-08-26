package org.controlhoras.entity;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HU2 {

	private static  SessionFactory sessionFactory=buildSessionFactory();
	private static ServiceRegistry servReg;
	
	
	private static SessionFactory buildSessionFactory(){
		try {
			//se crea la session factory desde hibernate.cfg.xml
			//return new Configuration().configure().buildSessionFactory();
			
			Configuration configuration = new Configuration();
		    configuration.addResource("empleado.hbm.xml");
			configuration.configure("hibernate.cfg.xml");
		    servReg = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		    sessionFactory = configuration.buildSessionFactory(servReg);
		    return sessionFactory;
						
		}
		
		catch ( Throwable ex) {
			System.err.println("SessionFactory falló" + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
}