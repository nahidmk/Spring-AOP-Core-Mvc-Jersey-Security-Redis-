package bd.edu.seu;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Car implements veichel{
    @Override
    public void run() {
        System.out.println("Hello i am car ");
    }
}
