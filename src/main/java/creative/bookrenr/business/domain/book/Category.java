package creative.bookrenr.business.domain.book;

import creative.bookrenr.business.domain.BaseTimeEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Getter
public class Category extends BaseTimeEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
