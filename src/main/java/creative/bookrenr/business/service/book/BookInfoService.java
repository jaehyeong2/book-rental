package creative.bookrenr.business.service.book;

import creative.bookrenr.business.domain.book.BookInfo;
import creative.bookrenr.business.domain.book.Category;
import creative.bookrenr.business.domain.book.Publisher;
import creative.bookrenr.business.dto.book.BookInfoDto;
import creative.bookrenr.business.repository.book.BookInfoRepository;
import creative.bookrenr.business.repository.book.BookQueryRepository;
import creative.bookrenr.business.repository.book.CategoryRepository;
import creative.bookrenr.business.repository.book.PublisherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.NoSuchElementException;

@RequiredArgsConstructor
@Transactional
@Service
public class BookInfoService {
    private final BookInfoRepository infoRepository;
    private final BookQueryRepository bookQueryRepository;
    private final CategoryRepository categoryRepository;
    private final PublisherRepository publisherRepository;

    public String save(BookInfoDto dto) {
        isbnCheck(dto.getIsbn());

        Category category = getCategory(dto.getCategoryId());
        Publisher publisher = getPublisher(dto.getPublisherId());

        BookInfo bookInfo = BookInfo.create(dto, category, publisher);

        infoRepository.save(bookInfo);
        return "Y";
    }

    private void isbnCheck(String isbn) {
        bookQueryRepository.IsbnDuplicateCheck(isbn);
    }

    private Category getCategory(Long id) {
        Category category = categoryRepository.findById(id).orElseThrow(NoSuchElementException::new);
        return category;
    }

    private Publisher getPublisher(Long id) {
        Publisher publisher = publisherRepository.findById(id).orElseThrow(NoSuchElementException::new);
        return publisher;
    }
}
