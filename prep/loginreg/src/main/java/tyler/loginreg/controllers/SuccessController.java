package tyler.loginreg.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuccessController {
    @GetMapping("/home")
    public String home(){
        return "you did it!!!";
    }
}
