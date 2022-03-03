package creative.bookrenr.repository;

import creative.bookrenr.domain.Book;
import creative.bookrenr.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
