package someshbose.github.io.liquibase.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import someshbose.github.io.liquibase.model.Book;

@Repository
public interface BookRepository extends CrudRepository<Book,Long> {
}
