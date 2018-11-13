package my.example.breadshop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "option")
@Getter @Setter
public class Option {
    @Id
    @ManyToOne
    @JoinColumn(name="product_id")
    private Product product;

    @Column(name = "type", nullable = false)
    private String type; //옵션 타입

    @Column(name="add_price")
    private int addPrice; //추가 금액

}
