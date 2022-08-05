package creative.bookrenr.business.controller.book;

import creative.bookrenr.business.dto.book.CategoryDto;
import creative.bookrenr.business.dto.book.CategoryUpdate;
import creative.bookrenr.business.service.CategoryService;
import creative.bookrenr.global.dto.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/categories")
@RequiredArgsConstructor
@RestController
public class CategoryApi {
    private final CategoryService categoryService;

    @PostMapping("")
    public ApiResponse<String> create(@RequestBody CategoryDto dto){
        return new ApiResponse<>(categoryService.create(dto));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<String> delete(@PathVariable Long id){
        return new ApiResponse<>(categoryService.delete(id));
    }

    @PutMapping("/{id}")
    public ApiResponse<String> changeName(@RequestBody CategoryUpdate dto, @PathVariable Long id){
        return new ApiResponse<>(categoryService.changeName(id,dto));
    }
}
