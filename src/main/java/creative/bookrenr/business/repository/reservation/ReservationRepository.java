package creative.bookrenr.business.repository.reservation;

import creative.bookrenr.business.domain.reservation.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
