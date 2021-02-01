package bd.edu.seu;


import org.springframework.stereotype.Component;

@Component
public class Student {

    public void  Self_study()
    {
        System.out.println("i am student, i Studying right now");
    }
    public String  Self_concatinate(String a, String b)
    {
        System.out.println("i am student, i Studying right now");
        return a+" "+b;
    }
}
