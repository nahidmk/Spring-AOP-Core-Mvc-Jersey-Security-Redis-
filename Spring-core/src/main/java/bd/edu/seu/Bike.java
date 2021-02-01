package bd.edu.seu;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Bike implements veichel {
    @Override
    public void run() {
        System.out.println("Hello i am Bike");
    }
}
