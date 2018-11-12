package my.example.breadshop.domain;

import java.util.Date;

public class Payment {
    private Long history_id;
    private String payBy; //결제방식 : 신용카드, 무통장입금, 카카오페이
    private String price;
    private Date payDate; //결제한 날짜
    private boolean deposit; //입금여부

}
