package someshbose.github.io.liquibase.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Book
 */
@Entity
@Table(name = "LQ_BOOK")
@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Book{

    @Id
    @SequenceGenerator(name = "LQ_BOOK_SEQ", sequenceName = "LQ_BOOK_SEQ", allocationSize = 5)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LQ_BOOK_SEQ")
    private Long id;

    private String title;

    private String author;
}


