package com.example.shopping.kakao;

import lombok.Data;

@Data
public class KakaoApproveResponse {
    private String aid;                 //요청 고유번호
    private String tid;                 //결제 고유번호
    private String cid;                 //가맹점 코드
    private String sid;                 //정기결제용 id
    private String partner_order_id;    //가맹점 주문번호, 최대 100자
    private String partner_user_id;     //가맹점 회원 id, 최대 100자
    private String payment_method_type; //결제수단, CARD 또는 MONEY 중 하나
    private Amount amount;              //결제금액 정보
    private CardInfo card_info;         //결제 상세 정보
    private String item_name;           //상품이름, 최대 100자
    private String item_code;           //상품 코드, 최대 100자
    private Long quantity;              //상품 수량
    private String created_at;          //결제 준비 요청 시각
    private String approved_at;         //결제 승인 시간
    private String payload;             //결제 승인 요청에 대한 저장 값
}
