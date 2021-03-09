/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aop;

import org.springframework.stereotype.Component;

/**
 *
 * @author lab
 */
@Component
public class UniLibrary extends AbstractLibrary{

     public void getBook(){
        System.out.println("Мы берем книгу из UniLibrary");
        System.out.println("-----------------------------------------------");
    }

    public void getMagazine(){
        System.out.println("Мы берем журнал из UniLibrary");
        System.out.println("-----------------------------------------------");
    }

    public String returnBook(){
        int a = 1 / 0;
        System.out.println("Мы возвращаем книгу в UniLibrary");
        return "The Book";
    }

    public void returnMagazine(){
        System.out.println("Мы возвращаем журнал в UniLibrary");
        System.out.println("-----------------------------------------------");
    }

    public void addBook(String person_name, Book book){
        System.out.println("Мы добавляем книгу в UniLibrary");
        System.out.println("-----------------------------------------------");
    }

    public void addMagazine(){
        System.out.println("Мы добавляем журнал в UniLibrary");
        System.out.println("-----------------------------------------------");
    }
}

