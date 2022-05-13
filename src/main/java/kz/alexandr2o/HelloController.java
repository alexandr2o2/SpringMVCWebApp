package kz.alexandr2o;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/lol")
    public String lolHello(){
        return "lolHello";
    }
}
