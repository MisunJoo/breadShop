package my.example.breadshop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "product")
@Getter @Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(name = "price")
    private int price;

    @Column(name = "point")
    private int point;

    @Column(name = "nutrient", length = 255)
    private String nutrient;

    @Column(name = "cutting")
    private boolean cutting;

    @Column(name = "stock")
    private int stock;

    @Column(name="regDate", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date regDate;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "product")
    private Set<HistoryProduct> historyProducts;

    @ManyToOne
    @JoinColumn(name = "wish_id")
    private Wish wish;

    @OneToMany(mappedBy = "product")
    private Set<CouponProduct> couponProducts;
}
