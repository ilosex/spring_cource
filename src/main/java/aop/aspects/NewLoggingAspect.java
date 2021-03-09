/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 *
 * @author lab
 */
@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution (public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint
            proceedingJoinPoint) throws Throwable{
        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку"
                + " пытаются вернуть книгу");

        Object targetMethodResult = null;
        try{
            targetMethodResult = proceedingJoinPoint.proceed();
        }
        catch (Exception e){
            System.out.println("aroundReturnBookLoggingAdvice: было поймано "
                    + "исключение " + e);
            throw e;
        }

        System.out.println("aroundReturnBookLoggingAdvice: в библиотеку"
                + " успешно вернули книгу");

        return targetMethodResult;
    }
}
