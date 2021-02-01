package bd.edu.seu;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@EnableAspectJAutoProxy
@Aspect
public class Aspect_config {

////
//    @Before("myPointCut()")
//    public void sleep()
//    {
//        System.out.println("I am human");
//    }
//
//    @Pointcut("execution(public void bd.edu.seu.Student.Self*(..) )")
//    public void myPointCut(){}
//
//    @AfterReturning(pointcut = "execution(int bd.edu.seu.Teacher.Self*(..))",returning = "count")
//    public void return_value(int count){
//        System.out.println("Hello i am Aspect, and i have a value = "+count);
//    }
//
//    @AfterReturning(pointcut = "execution(String bd.edu.seu.Student.Self*(..))",returning = "contatinate")
//    public void return_value(String contatinate){
//        System.out.println("Hello i am Aspect, And i have a value = "+contatinate);
//    }

    @Around("execution(int bd.edu.seu.Teacher.Self_Cont(..))")
    public Object around_advice(ProceedingJoinPoint pj){

        System.out.println("Hello i am Aspect..");
        Object[] obj = pj.getArgs();

        obj[0] = 100;
        obj[1] = 300;

        Object ret = null;
        try {
            ret = pj.proceed(obj);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }

        System.out.println(ret);
        return ret;
    }
}
