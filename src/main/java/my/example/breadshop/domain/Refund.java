package my.example.breadshop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "refund")
@Getter @Setter
public class Refund {

    @Id
    @OneToOne(mappedBy = "refund")
    private HistoryProduct historyProduct;

    @Column(name = "refund_check")
    private boolean refundCheck; //환불여부 체크

    @Column(name = "reason", length = 255)
    private String reason; //환불사유

    @Column(name="refund_date", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date refundDate;
}
