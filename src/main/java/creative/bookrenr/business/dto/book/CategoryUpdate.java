package creative.bookrenr.business.dto.book;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class CategoryUpdate {
    private String name;

    @Builder
    public CategoryUpdate(String name) {
        this.name = name;
    }
}
