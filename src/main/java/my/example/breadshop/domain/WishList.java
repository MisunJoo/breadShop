package my.example.breadshop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "wishlist")
@Getter
@Setter
public class WishList {

    @Id
    @OneToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @OneToMany
    @JoinColumn(name = "product_id")
    private Product product;

    @Column(name = "product_name", length = 255)
    String productName;
}
