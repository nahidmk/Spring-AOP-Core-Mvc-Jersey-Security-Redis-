package bd.edu.seu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args)
    {
        ApplicationContext act = new AnnotationConfigApplicationContext(config.class);
        Student student = act.getBean("student",Student.class);
        Teacher teacher = act.getBean("teacher",Teacher.class);



//        student.Self_study();
//        student.Self_concatinate("Hello", "Nahid");


        teacher.Self_Cont(50,80);


//        teacher.Self_teach();
    }
}
