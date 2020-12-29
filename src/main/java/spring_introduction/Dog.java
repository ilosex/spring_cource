package spring_introduction;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("dogBean")
//@Scope("singleton")
public class Dog implements Pet{
//    private String name;

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }

    @PostConstruct
    public void init(){
        System.out.println("Class Dog: Init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Class Dog: Destroy");
    }

    @Override
    public void say(){
        System.out.println("Bow-Wow");
    }
}
