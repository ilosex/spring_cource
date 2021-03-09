/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author lab
 */
public class Tetst3 {
    public static void main(String[] args) {
        System.out.println("Method main starts");
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);
        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
        String bookName = library.returnBook();
        System.out.println("В библиотеку вернули  книгу " + bookName);
        
        context.close();
        System.out.println("Method main ends");
    }
}
