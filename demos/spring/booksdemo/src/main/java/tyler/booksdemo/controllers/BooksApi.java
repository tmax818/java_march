package tyler.booksdemo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tyler.booksdemo.models.Book;
import tyler.booksdemo.repositories.BookRepository;


@RestController
public class BooksApi {
    
    private final BookRepository bookRepository;
    public BooksApi(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    
    @RequestMapping(value="/api/books", method = RequestMethod.GET)
    public List<Book> allBooks(){
        List<Book> books = bookRepository.findAll();
        return books;
        
    }
}
