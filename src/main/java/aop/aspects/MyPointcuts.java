/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author lab
 */
public class MyPointcuts {

    @Pointcut("execution (* abc*(..))")
    public void allAddMethods(){}

}
