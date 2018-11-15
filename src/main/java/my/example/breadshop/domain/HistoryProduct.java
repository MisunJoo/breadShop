package my.example.breadshop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "history_product")
@Getter @Setter
public class HistoryProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "refund_check")
    private boolean refundCheck = false;

    @ManyToOne
    @JoinColumn(name = "history_id")
    private History history;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    //환불여부 칼럼
    @OneToOne(mappedBy = "historyProduct")
    private Refund refund;

}
