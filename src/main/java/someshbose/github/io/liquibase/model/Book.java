package someshbose.github.io.liquibase.model;

import javax.persistence.*;

/**
 * Book
 */
@Entity
@Table(name = "Book")
public class Book{

    @Id
    @SequenceGenerator(name = "BOOK_SEQ", sequenceName = "BOOK_SEQ", allocationSize = 5)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BOOK_SEQ")
    private Long id;

    private String title;

    private String author;
}


