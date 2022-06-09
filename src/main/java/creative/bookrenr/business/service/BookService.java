package creative.bookrenr.business.service;

import creative.bookrenr.business.domain.book.Book;
import creative.bookrenr.business.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Transactional
@Service
public class BookService{

    private final BookRepository bookRepository;


    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public void deleteById(Long id) {
        bookRepository.deleteById(id);
    }

    public Book update() {
        return null;
    }

    public List<Book> getAllBooks(){
        List<Book> books = bookRepository.findAll();
        return books;
    }
}