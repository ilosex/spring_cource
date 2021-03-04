/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 *
 * @author lab
 */
@Component
public class Book {
    @Value("The Book")
    private  String name;

    public String getName() {
        return name;
    }

    @Value("Autor")
    private String author;

    @Value("1800")
    private int yearOfPublication;

    public String getAuthor() {
        return author;
    }

    public int getYersOfPublication() {
        return yearOfPublication;
    }

    public void setName(String name) {
        this.name = name;
    }
}
