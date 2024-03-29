package tyler.yoga.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import tyler.yoga.models.Yoga;
import tyler.yoga.services.UserService;
import tyler.yoga.services.YogaService;

@Controller
public class YogaController {

    @Autowired YogaService yogaService;
    @Autowired UserService userService;

    //! CREATE
    @GetMapping("/yogas/new")
    public String newYoga(@ModelAttribute("yoga")Yoga yoga){
        return "yogas/new.jsp";
    }

    @PostMapping("/yogas")
    public String createYoga(@Valid @ModelAttribute("yoga")Yoga yoga, BindingResult result){

        yogaService.createYoga(yoga);
        return "redirect:/yogas";
    }
    
    //! READ ALL
    @GetMapping("/yogas")
    public String yogas(Model model, HttpSession session){
        if(session.getAttribute("userId") == null){
            return "redirect:/logout";
        }
        List<Yoga> yogas = yogaService.getAllYogas();
        model.addAttribute("yogas", yogas);
        return "yogas/yogas.jsp";
    }


    //! READ ONE
    @GetMapping("/yogas/{id}")
    public String show(@PathVariable("id")Long id, Model model){
        Yoga yoga = yogaService.getOneYoga(id);
        model.addAttribute("yoga", yoga);
        return "yogas/show.jsp";
    }

    //! UPDATE

    @GetMapping("/yogas/edit/{id}")
    public String edit(@PathVariable("id")Long id, Model model){
        Yoga yoga = yogaService.getOneYoga(id);
        model.addAttribute("yoga", yoga);
        return "yogas/edit.jsp";
    }
    
    @PutMapping("/yogas/{id}")
    public String update(@ModelAttribute("yoga")Yoga yoga){
        yogaService.updateYoga(yoga);
        return "redirect:/yogas";
    }
    
    //! DELETE

    @DeleteMapping("/yogas/delete/{id}")
    public String destroy(@PathVariable("id")Long id, HttpSession session){
        // if(session.getAttribute("userId") == null){
            //     return "redirect:/logout";
            // }
            yogaService.destroyYoga(id);
            return "redirect:/yogas";
        }
        
   
    
}
