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

    @Column(name = "name", length = 20, nullable = false)
    private String name;

    @Column(name="expire_date", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date expireDate;

    @Column(name="rate")
    private Double rate;

    //쿠폰의 총 개스ㅜ
    @Column(name = "total_num")
    private int totalNum;

    @ManyToMany
    @JoinTable(name = "coupon_product",
            joinColumns = @JoinColumn(name = "coupon_id", referencedColumnName = "id",nullable = false) ,
            inverseJoinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id",nullable = false) )
    private Set<Product> CouponProducts;
}
