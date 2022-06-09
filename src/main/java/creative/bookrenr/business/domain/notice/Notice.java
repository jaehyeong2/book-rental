package creative.bookrenr.business.domain.notice;

import creative.bookrenr.business.domain.BaseTimeEntity;
import creative.bookrenr.business.dto.notice.NoticeDto;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
public class Notice extends BaseTimeEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String content;

    private Boolean isView;

    @Builder
    public Notice(String title, String content,Boolean isView) {
        this.title = title;
        this.content = content;
        this.isView = isView;
    }

    public static Notice create(NoticeDto dto){
        return builder()
                .title(dto.getTitle())
                .content(dto.getContent())
                .isView(true)
                .build();
    }

    public void deleteNotice() {
        isView = false;
    }

    public void changeTitle(String title) {
        this.title = title;
    }

    public void changeContent(String content) {
        this.content = content;
    }
}
