package creative.bookrenr.business.service;

import creative.bookrenr.business.domain.book.Category;
import creative.bookrenr.business.dto.book.CategoryDto;
import creative.bookrenr.business.repository.book.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@RequiredArgsConstructor
@Transactional
@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public String create(CategoryDto dto){
        Category category = Category.create(dto);
        categoryRepository.save(category);
        return "Y";
    }

    public String delete(Long id){
        categoryRepository.deleteById(id);
        return "Y";
    }


    public String changeName(Long id,CategoryDto dto){
        Category category = categoryRepository.findById(id).orElseThrow(() -> {
            throw new NoSuchElementException("조회실패");
        });
        category.updateName(dto.getName());
        return "Y";
    }
}
