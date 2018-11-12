package my.example.breadshop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "product")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String name;

    private int price;
    private int point;
    private String nutrient;
    private boolean cutting;
    private int stock;

    @Column(name="regDate", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date regDate;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @OneToMany
    



}
