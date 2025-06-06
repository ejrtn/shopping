package com.example.shopping.kakao;

import lombok.Data;

@Data
public class Amount {
    private int total;                  //전체 결제 금액
    private int tax_free;               //비과세 금액
    private int vat;                    //부가세 금액
    private int point;                  //할인 금액
    private int discount;               //사용한 포인트 금액    private int discount;               //사용한 포인트 금액
    private int green_deposit;          //컵 보증금
}
