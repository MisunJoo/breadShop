package my.example.breadshop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "history")
@Getter @Setter
public class History {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //주문번호

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToOne(mappedBy = "history")
    private Shipping shipping;

    @OneToOne(mappedBy = "history")
    private Payment payment;

    @OneToMany(mappedBy = "history" )
    private Set<HistoryProduct> historyProducts;

}
