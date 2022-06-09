package creative.bookrenr.business.domain.book;

import creative.bookrenr.business.domain.BaseTimeEntity;
import creative.bookrenr.business.dto.book.CategoryDto;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
public class Category extends BaseTimeEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @Builder
    public Category(String name) {
        this.name = name;
    }

    public void updateName(String name) {
        this.name = name;
    }

    public static Category create(CategoryDto dto){
        return builder()
                .name(dto.getName())
                .build();
    }
}
