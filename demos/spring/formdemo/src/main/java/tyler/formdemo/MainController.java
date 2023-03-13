package tyler.formdemo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    
    @GetMapping("/")
    public String index(){
        return "index.jsp";
    }

    @PostMapping("/routetohandleformdata")
    public String handledata(
        @RequestParam(value = "email") String email, 
		@RequestParam(value = "password")String password,
        HttpSession session
    ){
        session.setAttribute("email", email);
        session.setAttribute("password", password);
        System.out.println(email);
        return "redirect:/";
    }


}
