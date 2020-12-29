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
public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
//        Dog myDog = context.getBean("myPet", Dog.class);
//        Dog yourDog = context.getBean("myPet", Dog.class);

//        myDog.setName("One");
//        yourDog.setName("Two");
//
//        System.out.println(myDog.getName());
//        System.out.println(yourDog.getName());

//        System.out.println(myDog);
//        System.out.println(yourDog);
//
//        System.out.println(myDog == yourDog);
    context.close();
    }
}
