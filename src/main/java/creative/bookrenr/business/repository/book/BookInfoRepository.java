package creative.bookrenr.business.repository.book;

import creative.bookrenr.business.domain.book.BookInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookInfoRepository extends JpaRepository<BookInfo,Long> {
}
