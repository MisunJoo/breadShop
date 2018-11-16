package my.example.breadshop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "refund")
@Getter @Setter
public class Refund {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "purchase_product_id") //실제테이블에 어떤 이름으로 들어갈 것인지.
    private PurchaseProduct purchaseProduct;

    @Column(name = "refund_check")
    private boolean refundCheck; //환불여부 체크

    @Column(name = "reason", length = 255)
    private String reason; //환불사유

    @Column(name="refund_date", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date refundDate;
}
