package tyler.dojoninja.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import tyler.dojoninja.models.Dojo;
import tyler.dojoninja.models.Ninja;
import tyler.dojoninja.services.DojoService;
import tyler.dojoninja.services.NinjaService;

@Controller
public class MainController {

    @Autowired DojoService dojoService;
    @Autowired NinjaService ninjaService;

    @GetMapping("/dojos/new")
    public String newDojo(@ModelAttribute("dojo")Dojo dojo){
        return "dojos/index.jsp";
    }
    
    @PostMapping("/dojos")
    public String createDojo(@ModelAttribute("dojo")Dojo dojo){
        dojoService.createDojo(dojo);
        return "redirect:/";
    }

    @PostMapping("/ninjas")
    public String createNinja(@ModelAttribute("ninja")Ninja ninja){
        ninjaService.createNinja(ninja);
        return "redirect:/";
    }

    @GetMapping("/ninjas/new")
    public String newNinja(@ModelAttribute("ninja")Ninja ninja, Model model){
        List<Dojo> dojos = dojoService.getAllDojos();
        System.out.println(dojos);
        model.addAttribute("dojos", dojos);
        return "ninjas/index.jsp";
    }



}