package tyler.daikichi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/daikichi")
public class DaikichiController {
    String home = "<a href=\"/\">home</a>";
    String today = "<a href=\"/daikichi/today\">today</a>";

    @RequestMapping("")
    public String welcome(){
        return today;
    }
    
    @RequestMapping("/{pathvar}")
    public String index(@PathVariable("pathvar")String pv){
        System.out.println(pv.equals("today"));
        if(pv.equals("today")){
            return "Today you will find luck in all your endeavors!";
        }
        if(pv.equals("tomorrow")){
            return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
        } 

        return "What are you talking about?";

    }
}
