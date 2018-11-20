package my.example.breadshop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "member")
@Getter @Setter
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 20, nullable = false)
    private String name;

    @Column(name = " member_id", length = 20, nullable = false, unique = true)
    private String memberId;

    @Column(name = "password", length = 255, nullable = false)
    private String password;

    @Column(name = "gender", nullable = false)
    private String gender; // 본인의 성별 입력

    @Column(name = "email", length = 255, nullable = false, unique = true)
    private String email;

    @Column(name = "phone", length = 255, nullable = false, unique = true)
    private String phone;

    @Column(name = "zipcode", length = 255, nullable = false)
    private String zipcode;

    @Column(name= "address", length = 255, nullable = false)
    private String address;

    @Column(name= "address_detail", length = 255)
    private String addressDetail;

    @Column(name = "receive_email", nullable = false)
    private boolean receiveEmail;

    @Column(name = "receive_sms", nullable = false)
    private boolean receiveSMS;

    @Column(name = "point", columnDefinition = "integer default 0")
    private int point;

    @OneToMany(mappedBy = "member")
    private Set<CartProduct> cartProducts;

    @OneToMany(mappedBy = "member")
    private Set<PurchaseRecord> purchaseRecords;

    @ManyToMany
    @JoinTable(name = "wish_product",
            joinColumns = @JoinColumn(name = "member_id", referencedColumnName = "id",nullable = false) ,
            inverseJoinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id",nullable = false) )
    private Set<Product> wishProducts;

    @ManyToMany
    @JoinTable(name = "member_coupon",
            joinColumns = @JoinColumn(name = "member_id", referencedColumnName = "id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "coupon_id", referencedColumnName = "id", nullable = false))
    private Set<Coupon> coupons;

    @ManyToMany
    @JoinTable(name = "member_role",
            joinColumns = @JoinColumn(name = "member_id", referencedColumnName = "id", nullable = false),
            inverseJoinColumns = @JoinColumn (name = "role_id", referencedColumnName = "id", nullable = false))
    private Set<Role> roles;


}
