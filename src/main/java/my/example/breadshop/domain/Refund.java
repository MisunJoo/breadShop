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

    //구매당시 가격의 snapshot.
    //그러나 refund 테이블의 Row는 항상 생성되는 것이아니다.
    //purchase_product의 origin_price를 읽어오면 되는데
    //관계를 어떻게 설정해줘야 하는가?
    @Column(name = "origin_price")
    private int originPrice;
}
