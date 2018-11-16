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

    @Column(name="name", nullable = false)
    private String name;

    @Column(name="parent_id", columnDefinition = "int default 0")
    private int parentId;

    @Column(name = "ordering")
    private int ordering;

    @OneToMany(mappedBy = "category")
    protected Set<Product> products;
}
