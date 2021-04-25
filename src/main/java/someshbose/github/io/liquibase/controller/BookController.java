package someshbose.github.io.liquibase.controller;

import Someshbose.github.io.liquibase.api.BookApi;
import Someshbose.github.io.liquibase.dao.BookDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import someshbose.github.io.liquibase.model.Book;
import someshbose.github.io.liquibase.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController implements BookApi {

    private final BookRepository repository;

    private ModelMapper modelMapper;

    @Autowired
    protected BookController(BookRepository repository, ModelMapper modelMapper){
        this.repository=repository;
        this.modelMapper=modelMapper;
    }

    @Override
    public ResponseEntity addBook(BookDto bookDto) {
        Book book = convertToEntity(bookDto);
        repository.save(book);
        return ResponseEntity.ok(book);
    }

    @Override
    public ResponseEntity<List<BookDto>> getBooks() {
        List<Book> bookList = (List<Book>) repository.findAll();
        List<BookDto> bookDtoList= covertToList(bookList);
        return ResponseEntity.ok(bookDtoList);
    }

    private BookDto convertToDto(Book book) {
        BookDto bookDto = modelMapper.map(book, BookDto.class);
        return bookDto;
    }

    private Book convertToEntity(BookDto bookDto) {
        Book book = modelMapper.map(bookDto, Book.class);
        return book;
    }

    private List<BookDto> covertToList(List<Book> bookList){
        List<BookDto> listReturn= new ArrayList<>();
        for(Book book:bookList){
            listReturn.add(convertToDto(book));
        }
        return listReturn;
    }

}
