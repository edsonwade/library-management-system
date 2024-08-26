package code.with.vanilson.libraryapplication.librarian;

import code.with.vanilson.libraryapplication.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * BookRepository
 *
 * @author vamuhong
 * @version 1.0
 * @since 2024-08-26
 */
@Repository
public interface LibrarianRepository extends JpaRepository<Librarian, Long> {
}
