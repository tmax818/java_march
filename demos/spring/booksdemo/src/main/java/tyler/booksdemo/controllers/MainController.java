package tyler.booksdemo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tyler.booksdemo.models.Book;
import tyler.booksdemo.services.BookService;

@Controller
public class MainController {

    @Autowired BookService bookService;


    
    //! CREATE

    @GetMapping("/books/new")
    public String newBook(@ModelAttribute("book")Book book){
        return "books/new.jsp";
    }

    @PostMapping("/books")
    public String createBook(
        @ModelAttribute("book")Book book
        // @RequestParam("title")String title,
        // @RequestParam("author")String author,
        // @RequestParam("pages")Integer pages
        ){
        // Book book = new Book(author, title, pages); 
        bookService.createBook(book);
        return "redirect:/";
    }
    


    //! READ ALL
    @GetMapping("/")
    public String index(Model model){
        List<Book> books = bookService.getAllBooks();
        System.out.println(books);
        model.addAttribute("books", books);
        return "books/index.jsp";
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
