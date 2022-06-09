package creative.bookrenr.business.repository.rent;

import creative.bookrenr.business.domain.rent.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentRepository extends JpaRepository<Rent,Long> {
}
