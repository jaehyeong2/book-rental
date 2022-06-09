package creative.bookrenr.business.repository.book;

import creative.bookrenr.business.domain.book.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher,Long> {
}
