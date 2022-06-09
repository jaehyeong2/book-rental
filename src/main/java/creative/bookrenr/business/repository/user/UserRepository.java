package creative.bookrenr.business.repository.user;

import creative.bookrenr.business.domain.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User findByPhone(String phone);
}
