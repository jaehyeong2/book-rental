package creative.bookrenr.business.service;

import creative.bookrenr.business.domain.book.Category;
import creative.bookrenr.business.dto.book.CategoryDto;
import creative.bookrenr.business.dto.book.CategoryUpdate;
import creative.bookrenr.business.repository.book.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Transactional
@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    public List<String> findCategoryNames(){
        return categoryRepository.findAll().stream()
                .map(c->c.getName())
                .collect(Collectors.toList());
    }

    public String create(CategoryDto dto){
        Category category = Category.create(dto);
        categoryRepository.save(category);
        return "Y";
    }

    public String delete(Long id){
        Category category = getCategory(id);
        category.delete();
        return "Y";
    }

    public String changeName(Long categoryId, CategoryUpdate dto){
        Category category = getCategory(categoryId);
        category.updateName(dto.getName());
        return "Y";
    }

    private Category getCategory(Long id) {
        Category category = categoryRepository.findById(id).orElseThrow(NoSuchElementException::new);
        return category;
    }
}
