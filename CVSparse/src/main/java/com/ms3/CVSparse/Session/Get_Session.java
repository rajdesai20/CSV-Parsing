package com.ms3.CVSparse.Session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ms3.CVSparse.Model.Col_Data;

public class Get_Session {

	public static Session getSession(String filename) {
		
		//Configuring the hibernate to create database and table
		Configuration cong = new Configuration().configure().addAnnotatedClass(Col_Data.class);
		cong.setProperty("hibernate.connection.url", "jdbc:sqlite:"+ filename +".db");
		SessionFactory sf = cong.buildSessionFactory();
		Session session = sf.openSession();
		return session;
	}
}
