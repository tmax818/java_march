package tyler.booksdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import tyler.booksdemo.models.Book;
import tyler.booksdemo.repositories.BookRepository;

@Controller
public class MainController {

    @Autowired BookRepository bookRepository;
    @GetMapping("/")
    public String index(Model model){
        List<Book> books = bookRepository.findAll();
        System.out.println(books);
        model.addAttribute("books", books);
        return "index.jsp";
    }
}
