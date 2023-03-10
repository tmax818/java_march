package tyler.daikichi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String asdfasdf(){
        return "index.jsp";
    }
}
