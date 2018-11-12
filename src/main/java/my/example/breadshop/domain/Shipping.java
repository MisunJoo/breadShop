package my.example.breadshop.domain;

import java.util.Date;

public class Shipping {
    //구매내역 id
    private Long history_id;
    private String receiveName;
    private String receivePhone;
    private String receivceAddress;
    private String invoice;
    private String company;
    private String status; //출고준비, 배송중, 배송완료
    private Date receiveDate;

}
