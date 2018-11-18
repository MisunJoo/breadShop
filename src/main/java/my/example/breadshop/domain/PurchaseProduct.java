package my.example.breadshop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "purchase_product")
@Getter @Setter
public class PurchaseProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //환불여부 칼럼
    @Column(name = "refund_check", columnDefinition = "boolean default false")
    private boolean refundCheck;

    //구매당시 상품 가격의 snapshot
    @Column(name = "origin_price")
    private int originPrice;

    @ManyToOne
    @JoinColumn(name = "purchase_record_id")
    private PurchaseRecord purchaseRecord;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @OneToOne(mappedBy = "purchaseProduct")
    private Refund refund;
}
