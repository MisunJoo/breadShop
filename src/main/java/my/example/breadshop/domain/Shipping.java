package my.example.breadshop.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "shipping")
@Getter @Setter
public class Shipping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "history_id")
    PurchaseRecord purchaseRecord;

    @Column(name = "receive_name", length = 20)
    private String receiveName;

    @Column(name = "receive_phone", length = 20)
    private String receivePhone;

    @Column(name = "receive_address", length = 255)
    private String receivceAddress;

    @Column(name = "invoice", length = 20)
    private String invoice;

    @Column(name = "company", length = 20)
    private String company;

    @Column(name = "status", length = 20)
    private String status; //출고준비, 배송중, 배송완료

    @Column(name="receive_date", columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date receiveDate;
}
