package creative.bookrenr.business.service;

import creative.bookrenr.business.domain.book.Category;
import creative.bookrenr.business.dto.book.CategoryDto;
import creative.bookrenr.business.dto.book.CategoryUpdate;
import creative.bookrenr.business.repository.book.CategoryRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@Transactional
@SpringBootTest
class CategoryServiceTest {

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    CategoryService categoryService;

    @Test
    void findCategoryNames() {
        //given
        Category 호러 = Category.builder().name("호러").build();
        Category 멜로 = Category.builder().name("멜로").build();
        categoryRepository.save(호러);
        categoryRepository.save(멜로);

        //when
        List<String> categoryNames = categoryService.findCategoryNames();

        //then
        assertThat(categoryNames).containsExactly("호러","멜로");
    }

    @Test
    void create() {
        //given
        CategoryDto 호러 = new CategoryDto("호러");

        //when
        categoryService.create(호러);
        List<String> categoryNames = categoryRepository.findAll().stream()
                .map(c -> c.getName()).collect(Collectors.toList());
        //then
        assertThat(categoryRepository.count()).isEqualTo(1);
        assertThat(categoryNames).containsExactly("호러");
    }

    @Test
    @DisplayName("카테고리명 변경")
    void changeName() {
        //given
        Category 호러 = Category.builder().name("호러").build();
        categoryRepository.save(호러);

        CategoryUpdate req = CategoryUpdate.builder().name("바껴라!").build();
        //when
        String result = categoryService.changeName(호러.getId(),req);

        assertThat(result).isEqualTo("Y");
        assertThat(호러.getName()).isEqualTo("바껴라!");

    }
}