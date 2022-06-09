package creative.bookrenr.business.repository.book;

import com.querydsl.jpa.impl.JPAQueryFactory;
import creative.bookrenr.business.domain.book.BookInfo;
import creative.bookrenr.global.handler.ex.BusinessException;
import creative.bookrenr.global.handler.ex.ErrorCode;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import static creative.bookrenr.business.domain.book.QBookInfo.bookInfo;
@RequiredArgsConstructor
@Repository
public class BookQueryRepository {
    private final JPAQueryFactory queryFactory;

    public void IsbnDuplicateCheck(String isbn){
        BookInfo result = queryFactory.selectFrom(bookInfo)
                .where(bookInfo.isbn.eq(isbn))
                .fetchOne();

        if(result != null){
            throw new BusinessException(ErrorCode.DUPLICATE_LOGIN_ID);
        }

    }
}
