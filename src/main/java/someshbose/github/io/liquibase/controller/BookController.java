package someshbose.github.io.liquibase.controller;

import Someshbose.github.io.liquibase.api.BookApi;
import Someshbose.github.io.liquibase.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import someshbose.github.io.liquibase.repository.BookRepository;
import java.util.List;

@RestController
public class BookController implements BookApi {

    private final BookRepository repository;

    @Autowired
    protected BookController(BookRepository repository){
        this.repository=repository;
    }

    @Override
    public ResponseEntity addBook(Book book) {
        repository.save(book);
        return ResponseEntity.ok(book);
    }

    @Override
    public ResponseEntity<List<Book>> getBooks() {
        List<Book> bookList = (List<Book>) repository.findAll();
        return ResponseEntity.ok(bookList);
    }
}
