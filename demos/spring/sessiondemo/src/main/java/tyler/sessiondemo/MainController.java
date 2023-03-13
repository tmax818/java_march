package tyler.sessiondemo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(HttpSession session){
        session.setAttribute("name", "Richie");
        return "index.jsp";
    }

}
