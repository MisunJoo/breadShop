package my.example.breadshop.domain;

import java.util.Date;

public class Refund {
    //history의 변수명은 어떤가?
    private Long history_id;
    private boolean refundCheck; //환불여부 체크
    private String reason;
    private Date refundDate;


}
