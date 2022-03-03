package creative.bookrenr.repository;

import creative.bookrenr.domain.Book;
import creative.bookrenr.domain.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentRepository extends JpaRepository<Rent,Long> {
}
