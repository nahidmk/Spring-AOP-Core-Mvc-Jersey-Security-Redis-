package bd.edu.seu.springsecurity.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AppController {
    @GetMapping("/")
    public String Home_Controller()
    {
        return "home.jsp";
    }

    @GetMapping("/login")
    public String login_page(){
//        return "src/main/WebApp/Sliding-Sign-In-Sign-Up-Form-master/index.html";
        return "login.jsp";
    }

    @GetMapping("/logout-success")
    public String logout_success()
    {
        return "logout.jsp";
    }
    @GetMapping("/user")
    public String user()
    {
        return "<h1>Back to user </h1>";
    }
    @GetMapping("/admin")
    public String admin()
    {
        return "<h1> hello i am admin</h1>";
    }
}
