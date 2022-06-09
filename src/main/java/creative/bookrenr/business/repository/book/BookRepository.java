package creative.bookrenr.business.repository.book;

import creative.bookrenr.business.domain.book.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
