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
public class Test1 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext contex =
                new AnnotationConfigApplicationContext(Conf.class);

        Book book = contex.getBean("book", Book.class);

        UniLibrary uniLibrary = contex.getBean("uniLibrary", UniLibrary.class);
        SchoolLibrary schoolLibrary =
                contex.getBean("schoolLibrary", SchoolLibrary.class);

        uniLibrary.getBook();
        uniLibrary.getMagazine();
//        uniLibrary.returnMagazine();
//        uniLibrary.addBook();
//        System.out.println(uniLibrary.returnBook());
//
//        schoolLibrary.getBook();

        contex.close();
    }
}
