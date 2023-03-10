package tyler.hopper.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import tyler.hopper.models.Item;

@Controller
public class MainController {

    @GetMapping("/")
    public String index(Model model) {
        
        String name = "Grace Hopper";
        // String itemName = "Copper wire";
        // double price = 5.25;
        // String description = "Metal strips, also an illustration of nanoseconds.";
        // String vendor = "Little Things Corner Store";
    
    	// Your code here! Add values to the view model to be rendered
    
        model.addAttribute("name", name);
        // model.addAttribute("itemName", itemName);
        // model.addAttribute("price", price);
        // model.addAttribute("description", description);
        // model.addAttribute("vendor", vendor);

        ArrayList<Item> items = new ArrayList<>();
        items.add(new Item("Copper wire", 5.25, "Metal strips, also an illustration of nanoseconds.","Little Things Corner Store" ));
        items.add(new Item("Copper wire 984ft", 50.25, "Copper wire, also an illustration of microseconds.","Little Things Corner Store" ));
        model.addAttribute("items", items);
        return "index.jsp";
    }
    
}
