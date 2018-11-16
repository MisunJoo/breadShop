package my.example.breadshop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "purchase_record")
@Getter @Setter
public class PurchaseRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //주문번호

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToOne(mappedBy = "purchaseRecord")
    private Shipping shipping;

    @OneToOne(mappedBy = "purchaseRecord")
    private Payment payment;

    @OneToMany(mappedBy = "purchaseRecord" )
    private Set<PurchaseProduct> purchaseProducts;

}
