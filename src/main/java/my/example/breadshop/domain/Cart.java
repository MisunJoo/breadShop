package my.example.breadshop.domain;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Cart {
    private Long member_id; //user의 idex값
    private Long product_id;
    private String product_name;
    private int count; //물건의 개수. default가 1이겠지?

    @OneToOne
    @JoinColumn(name = "member_id")
    private Member member;
}
