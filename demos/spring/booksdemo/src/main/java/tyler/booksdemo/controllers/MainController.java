package tyler.booksdemo.controllers;

// java/spring imports
import java.util.List;

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

import tyler.booksdemo.models.Book;
import tyler.booksdemo.services.BookService;

// tells Spring that this java class will be a controller
@Controller
public class MainController {
    
    // connects our controller to our servcie
    // BookService = the class or data type
    // bookService = instance of the class
    @Autowired BookService bookService;


    
    //! CREATE
    // displays the new book/create form
    // @ModelAttribute = data binding sends an empty book to the form to be filled out
    @GetMapping("/books/new")
    public String newBook(@ModelAttribute("book")Book book){
        return "books/new.jsp";
    }
    // handles the form data form the method above
    // passes data to service
    // @ModelAttribute = data binding returns a full book to send to the service.
    @PostMapping("/books")
    public String createBook(@Valid @ModelAttribute("book")Book book, BindingResult results){
        if(results.hasErrors()){
            return "books/new.jsp";
        } else {
            bookService.createBook(book);
            return "redirect:/";
        }

    }
    


    //! READ ALL
    
    @GetMapping("/")
    public String index(Model model){
        // invokation of the getAllBooks method in the service
        List<Book> books = bookService.getAllBooks();
        System.out.println(books);
        // sends data from the DB to the view 
        model.addAttribute("books", books);
        // redirect to the show all/index page
        return "books/index.jsp";
    }


    //! READ ONE
    @GetMapping("/books/{id}")
    public String show(@PathVariable("id")Long id, Model model){
        //call to the service method for one book
        Book book = bookService.getOneBook(id);
        System.out.println(book);
        // sends DB data to the view
        model.addAttribute("book", book);
        // return the view one page.
        return "show.jsp";
    }

    //! UPDATE

    @GetMapping("/books/edit/{id}")
    public String edit(@PathVariable("id")Long id, Model model){
        Book book = bookService.getOneBook(id);
        model.addAttribute("book", book);
        return "books/edit.jsp";
    }
    
    @PutMapping("/books/{id}")
    public String update(@PathVariable("id")Long id, @Valid @ModelAttribute("book")Book book, BindingResult results, Model model){
        if(results.hasErrors()){
            // Book ebook = bookService.getOneBook(id);
            // model.addAttribute("book", ebook);
            System.out.println(results.getAllErrors());
            return "books/edit.jsp";
        } else {
            bookService.updateBook(book);
            return "redirect:/";
        }
    }

    //! DELETE

    @DeleteMapping("/books/{id}")
    public String destroy(@PathVariable("id")Long id){
        Book book = bookService.getOneBook(id);
        bookService.deleteBook(book);
        return "redirect:/";
    }
}
