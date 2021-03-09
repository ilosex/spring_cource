/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author lab
 */
public class test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).
                buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee emp = new Employee("Zaur", "Tregulov", "IT", 1500);
            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
            System.out.println("Done!");
        }
        finally{
            factory.close();


        }
    }
}
