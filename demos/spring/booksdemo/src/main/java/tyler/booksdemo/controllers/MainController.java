package tyler.booksdemo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import tyler.booksdemo.models.Book;
import tyler.booksdemo.services.BookService;

@Controller
public class MainController {

    @Autowired BookService bookService;
    
    //! CREATE
    


    //! READ ALL
    @GetMapping("/")
    public String index(Model model){
        List<Book> books = bookService.getAllBooks();
        System.out.println(books);
        model.addAttribute("books", books);
        return "index.jsp";
    }


    //! READ ONE
    @GetMapping("/books/{id}")
    public String show(@PathVariable("id")Long id, Model model){
        Book book = bookService.getOneBook(id);
        System.out.println(book);
        model.addAttribute("book", book);
        return "show.jsp";
    }

    //! UPDATE

    //! DELETE
}
