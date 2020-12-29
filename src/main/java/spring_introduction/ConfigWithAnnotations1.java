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
public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");


        Person persn = context.getBean("personBean", Person.class);
        persn.callYourPet();

        System.out.println(persn.getSurname());
        System.out.println(persn.getAge());
//        Cat myCat = context.getBean("cat", Cat.class);
//        myCat.say();
        context.close();
    }
}
