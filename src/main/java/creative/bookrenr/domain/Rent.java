package creative.bookrenr.domain;

import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
public class Rent {

    @Id
    @GeneratedValue
    private Long id;

    @JoinColumn(name = "user_id")
    @ManyToOne(fetch = FetchType.LAZY)
    public User user;

    @JoinColumn(name = "board_id")
    @OneToOne(fetch = FetchType.LAZY)
    public Book book;


    // 대여일자
    public LocalDateTime rentDate;

    public void rentDate(){
        this.rentDate = LocalDateTime.now();
    }
}
