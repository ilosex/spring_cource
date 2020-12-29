/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author lab
 */
public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

//        Person person = context.getBean("personBean", Person.class);
        Dog myDog = context.getBean("dogBean", Dog.class);
        myDog.say();
//        Dog yourDog = context.getBean("dogBean", Dog.class);
//
//        System.out.println(myDog);
//        System.out.println(yourDog);




        context.close();
    }
}
