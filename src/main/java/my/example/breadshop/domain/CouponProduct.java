package my.example.breadshop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "coupon_product")
@Getter @Setter
public class CouponProduct {

    @Id
    @OneToMany
    @JoinColumn(name = "coupon_id")
    private Coupon coupon;

    @OneToMany
    @JoinColumn(name = "product_id")
    private Product product;
}
