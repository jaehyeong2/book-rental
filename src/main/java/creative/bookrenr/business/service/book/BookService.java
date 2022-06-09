package creative.bookrenr.business.service.book;

import creative.bookrenr.business.domain.book.Book;
import creative.bookrenr.business.domain.book.BookInfo;
import creative.bookrenr.business.domain.book.Category;
import creative.bookrenr.business.domain.book.Publisher;
import creative.bookrenr.business.dto.book.BookInfoDto;
import creative.bookrenr.business.repository.book.BookInfoRepository;
import creative.bookrenr.business.repository.book.BookRepository;
import creative.bookrenr.business.repository.book.CategoryRepository;
import creative.bookrenr.business.repository.book.PublisherRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.NoSuchElementException;

@RequiredArgsConstructor
@Transactional
@Service
public class BookService{
    private final BookRepository bookRepository;
    private final CategoryRepository categoryRepository;
    private final BookInfoRepository infoRepository;
    private final PublisherRepository publisherRepository;


    public List<Book> getAllBooks(){
        List<Book> books = bookRepository.findAll();
        return books;
    }
}
