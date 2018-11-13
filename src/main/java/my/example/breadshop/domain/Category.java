package my.example.breadshop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "category")
@Getter @Setter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="classification1")
    private String classification1;

    @Column(name="classification2")
    private String classification2;

    @OneToMany(mappedBy = "category")
    protected Set<Product> products;
}
