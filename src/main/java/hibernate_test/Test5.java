/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate_test;

import hibernate_test.entity.Employee;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author lab
 */
public class Test5 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).
                buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee emp = session.get(Employee.class, 1);
//            session.delete(emp);
            session.createQuery("delete Employee where "
                    + "firstname = 'Name5' or "
                    + "firstname = 'Name4'").executeUpdate();

            session.getTransaction().commit();

            System.out.println("Done!");
        }
        finally{
            factory.close();


        }
    }
}

