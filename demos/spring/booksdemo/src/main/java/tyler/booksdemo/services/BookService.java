package tyler.booksdemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tyler.booksdemo.models.Book;
import tyler.booksdemo.repositories.BookRepository;

@Service
public class BookService {

    @Autowired BookRepository bookRepository;

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }

    public Book getOneBook(Long id){
        Optional<Book> optionalbook = bookRepository.findById(id);
        Book book = optionalbook.orElse(null);
        return book;
    }

    public void createBook(Book book) {
        bookRepository.save(book);
    }
    
}
