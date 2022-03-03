package creative.bookrenr.domain;

import creative.bookrenr.enums.RentStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter @Setter
@AllArgsConstructor
public class Book{

    @Id @GeneratedValue
    private Long id;

    private String title;
    private String author;
    private String isbn; //고유 번호

    private String publisher; //출판사
    private Date publicationDate; //출판일

    @Enumerated(value = EnumType.STRING)
    public RentStatus rentStatus; //RENTED, NOT

    @OneToOne(mappedBy = "book")
    public Rent rent;

    protected Book(){

    }

}
