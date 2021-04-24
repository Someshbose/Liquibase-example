package someshbose.github.io.liquibase.controller;

import Someshbose.github.io.liquibase.api.BookApi;
import Someshbose.github.io.liquibase.dao.Book;
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
    public ResponseEntity addBook(Book bookDao) {
        someshbose.github.io.liquibase.model.Book book = someshbose.github.io.liquibase.model.Book.builder().author(bookDao.getAuthor()).title(bookDao.getTitle()).build();
        repository.save(book);
        return ResponseEntity.ok(book);
    }

    @Override
    public ResponseEntity getBooks() {
        List<someshbose.github.io.liquibase.model.Book> bookList = (List<someshbose.github.io.liquibase.model.Book>) repository.findAll();
        return ResponseEntity.ok(bookList);
    }
}
