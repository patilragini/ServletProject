package com.bridgelabz.SimpleMaven;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;


public class StoreData {
	/*private static SessionFactory sessionFactory;
    
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            // loads configuration and mappings
            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
            ServiceRegistry serviceRegistry
                = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build();
             
            // builds a session factory from the service registry
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);           
        }
         
        return sessionFactory;
    }*/
	public static void main(String[] args) {

		// creating configuration object
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");// populates the data of
		System.out.println("configured!!! "); // the configurationfile

		// creating seession factory object
		//System.out.println(configuration.buildSessionFactory());
		
		SessionFactory sfactory = null;
		System.out.println(sfactory);
		try{
			sfactory= configuration.buildSessionFactory();
		}catch (Exception e) {
		System.out.println("catch");
			e.printStackTrace();
			
		}
		
		System.out.println("Session Factory:"+sfactory);
		/*creating session object
		open session: it always create new Session object afresh and give it to you.
		You need to explicitly flush and close these session objects.*/
		//Session session = (Session) factory.openSession();
	
		Session  session = sfactory.openSession();
		
		System.out.println("session:"+session);
		
		Employee e1 = new Employee();
		// creating transaction object
		Transaction t = session.beginTransaction();
		
		e1.setId(0);
		e1.setFirstName("geeta");
		e1.setLastName("patil");

		session.persist(e1);// persisting the object

		t.commit();// transaction is commited
		session.close();

		System.out.println("successfully saved");

	}
}