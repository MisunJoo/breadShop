package my.example.breadshop.domain;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class WishList {
    private Long member_id;
    private Long product_id;
    String product_name;

    @OneToOne
    @JoinColumn(name = "member_id")
    private Member member;
}
