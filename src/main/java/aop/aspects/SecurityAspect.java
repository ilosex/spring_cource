/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 *
 * @author lab
 */
@Component
@Aspect
@Order(20)
public class SecurityAspect {

    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddSecurityAdvice(){
        System.out.println("beforeGetSecurityAdvice: проверка прав на "
                + "получекние книги/журнала");
        System.out.println("-----------------------------------------------");
    }
}
