package aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component
@Aspect
public class LoggerAspect {

    @Pointcut("@annotation(aop.Logger)")
    public void allSetters(){}

    @Around("allSetters()")
    public Object print(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("Around .........................");
        Object o = null;
        try {
            Object param = (proceedingJoinPoint.getArgs()!=null && proceedingJoinPoint.getArgs().length>0) ? proceedingJoinPoint.getArgs()[0] : "";
            if(param!=null && !"".equals(param))
                System.out.println("around >> params "+param);
            o = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return o;
    }

    @Before(value="allSetters()")
    public void log(JoinPoint joinPoint){
        System.out.println("Before ........................."+joinPoint.getArgs()[0]+".............");
        Object param = (joinPoint.getArgs()!=null && joinPoint.getArgs().length>0) ? joinPoint.getArgs()[0] : "";
        if(param!=null && !"".equals(param)) {
            System.out.println("params " + param);
        }else {
            throw new IllegalArgumentException("illegal argument");
        }
    }

}
