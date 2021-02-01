package bd.edu.seu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Road {

    @Autowired
    veichel ve;

    public veichel getVe() {
        return ve;
    }

    public void setVe(veichel ve) {
        this.ve = ve;
    }

    public void running()
    {
        System.out.println("veichel are running on the road");
        ve.run();
    }
}
