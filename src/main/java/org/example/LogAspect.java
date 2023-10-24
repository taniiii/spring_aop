package org.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Before("execution(* *(..))") //any return type, any method, any parameters
    public void logBefore(){                    //logBefore() - advice
        System.out.println("logging before method being executed....");
    }
}
