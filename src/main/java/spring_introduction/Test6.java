/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author lab
 */
public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(Conf.class);

//        Pet myCat = context.getBean("catBean", Cat.class);
//        Pet yourCat = context.getBean("catBean", Cat.class);
//
//        System.out.println(myCat);
//        System.out.println(yourCat);
//        System.out.println(yourCat == myCat);
//        myCat.say();

        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getAge());
        System.out.println(person.getSurname());
        person.callYourPet();

        context.close();
    }
}
