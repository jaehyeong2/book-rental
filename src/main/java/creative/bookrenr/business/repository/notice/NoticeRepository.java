package creative.bookrenr.business.repository.notice;

import creative.bookrenr.business.domain.notice.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepository extends JpaRepository<Notice,Long> {
}
