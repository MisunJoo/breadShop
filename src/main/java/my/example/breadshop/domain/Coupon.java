package my.example.breadshop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "coupon")
@Getter @Setter
public class Coupon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "coupon")
    private Set<MemberCoupon> memberCoupon;

    @OneToMany(mappedBy = "coupon")
    private Set<CouponProduct> couponProducts;

    @Column(name = "name", length = 20, nullable = false)
    private String name;

    @Column(name="expire_date", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date expireDate;

    @Column(name="rate")
    private Double rate;
}
