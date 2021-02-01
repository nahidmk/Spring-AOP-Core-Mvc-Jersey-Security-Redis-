package bd.edu.seu;

import org.springframework.stereotype.Component;

@Component
public class Teacher {

    public void Self_teach()
    {
        System.out.println("Hello Student, i am Teacher");
    }

    public int Self_Cont(int a, int b){
        System.out.println("hello i am Teacher, and i have a self count");
        return a+b;
    }
}
