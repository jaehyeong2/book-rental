package creative.bookrenr.service;

import creative.bookrenr.domain.Book;
import creative.bookrenr.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
@Service
public class BookService{

    private final BookRepository bookRepository;


    public void create(Book book) {

    }


    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }


    public Book update() {
        return null;
    }
}
