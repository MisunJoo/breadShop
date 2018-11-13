package my.example.breadshop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "payment")
@Getter @Setter
public class Payment {
    @Id
    @OneToOne
    @JoinColumn(name = "history_id")
    private History history;

    @Column(name = "pay_by", nullable = false)
    private String payBy; //결제방식 : 신용카드, 무통장입금, 카카오페이

    @Column(name = "price", nullable = false)
    private int price;

    @Column(name="pay_date", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date payDate; //결제한 날짜

    @Column(name = "deposit")
    private boolean deposit; //입금여부

}
