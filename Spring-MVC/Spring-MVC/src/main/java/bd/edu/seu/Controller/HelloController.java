package bd.edu.seu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller

public class HelloController {

    @RequestMapping("/add")
    public ModelAndView addNumber(@RequestParam("t1") int n, @RequestParam("t2") int m)
    {
        System.out.println("i am runing");
        ModelAndView mv = new ModelAndView();
        int sum = n+m;
        System.out.println("sum : "+sum);
        mv.setViewName("display.jsp");
        mv.addObject("result",sum);
        return mv;
    }
}
