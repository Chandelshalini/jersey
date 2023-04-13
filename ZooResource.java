package com.demo.restdemo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;

@Path("zoo")

public class ZooResource {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Zoo getData() {
		
	Zoo obj=new Zoo();
	
	
//	obj.setId(10);
//	obj.setZooid(10);
//	obj.setName("ziraffe");
//	obj.setLocation("chandigarh");
	
	Configuration con= new Configuration().configure().addAnnotatedClass(Zoo.class);
//	ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
	SessionFactory sf=con.buildSessionFactory();
	Session session=sf.openSession();
	Transaction tx=session.beginTransaction();
	
//	for fetching the data from the database
	obj=(Zoo)session.get(Zoo.class, 9);
	
//	for viewing the data
//	session.persist(obj);
	tx.commit();
	System.out.println(obj);
	session.close();
	return(obj);
	}
	
}
  