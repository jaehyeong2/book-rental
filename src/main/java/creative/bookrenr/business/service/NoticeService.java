package creative.bookrenr.business.service;

import creative.bookrenr.business.domain.notice.Notice;
import creative.bookrenr.business.dto.notice.NoticeContentChangeReq;
import creative.bookrenr.business.dto.notice.NoticeDto;
import creative.bookrenr.business.dto.notice.NoticeTitleChangeReq;
import creative.bookrenr.business.repository.notice.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@RequiredArgsConstructor
@Transactional
@Service
public class NoticeService {
    private final NoticeRepository noticeRepository;

    public String create(NoticeDto dto){
        Notice notice = Notice.create(dto);
        noticeRepository.save(notice);
        return "Y";
    }

    public String delete(Long id){
        Notice notice = noticeRepository.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("조회실패");
        });
        notice.deleteNotice();
        return "Y";
    }

    public String changeTitle(Long id, NoticeTitleChangeReq dto){
        Notice notice = noticeRepository.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("조회실패");
        });
        notice.changeTitle(dto.getTitle());

        return "Y";
    }

    public String changeContent(Long id, NoticeContentChangeReq dto){
        Notice notice = noticeRepository.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("조회실패");
        });
        notice.changeContent(dto.getContent());
        return "Y";
    }
}
