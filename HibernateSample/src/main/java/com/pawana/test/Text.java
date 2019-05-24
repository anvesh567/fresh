package com.pawana.test;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class Text {
	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure().addAnnotatedClass(Employee1.class);
		SessionFactory sf=cfg.buildSessionFactory();

		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Employee1 emp=new Employee1(0, "anvesh","hyd","26");
		Employee1 emp1=new Employee1(1,"leela","bang","24");
		
		session.save(emp);
		session.save(emp1);
		tx.commit();
		
		session.close();
		
	}

}
