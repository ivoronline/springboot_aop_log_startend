package com.ivoronline.springboot_aop_log_startend.log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogStartEndAspect {

  //========================================================
  // LOG START END
  //========================================================
  @Around("@annotation(LogStartEnd)")
  public Object logStartEnd(ProceedingJoinPoint joinPoint) throws Throwable {

    //GET METHOD PARAMETERS
    String methodName = joinPoint.getSignature().getName();                          //hello
    String className  = joinPoint.getSignature().getDeclaringType().getSimpleName(); //MyController

    //EXECUTE BEFORE METHOD
    System.out.println("STARTED METHOD: " + className + "." + methodName + "()");

    //EXECUTE METHOD
    Object proceed = joinPoint.proceed();

    //EXECUTE AFTER METHOD
    System.out.println("ENDED   METHOD: " + className + "." + methodName + "()");

    //RETURN METHOD RESULT
    return proceed;

  }

}