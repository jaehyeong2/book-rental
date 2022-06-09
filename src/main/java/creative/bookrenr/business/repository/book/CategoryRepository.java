package creative.bookrenr.business.repository.book;

import creative.bookrenr.business.domain.book.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
