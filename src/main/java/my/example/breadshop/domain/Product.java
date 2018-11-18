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

    @Column(name = "name", length = 255, nullable = false)
    private String name;

    @Column(name = "detail", length = 255)
    private String detail;

    @Column(name = "price")
    private int price;

    @Column(name = "point")
    private int point;

    @Column(name = "nutrition", length = 255)
    private String nutrition;

    @Column(name = "hit", columnDefinition = "integer default 0")
    private int hit;

    @Column(name = "deleted", columnDefinition = "bit default 0")
    private boolean deleted;

    @Column(name = "cutting")
    private boolean cutting;

    @Column(name = "stock")
    private int stock;

    @Column(name="reg_date", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date regDate;

    @Column(name="update_date", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date updateDate;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany(mappedBy = "product")
    private Set<PurchaseProduct> purchaseProducts;

    @OneToMany
    @JoinColumn(name = "product_id")
    private Set<ProductFile> productFiles;
}
