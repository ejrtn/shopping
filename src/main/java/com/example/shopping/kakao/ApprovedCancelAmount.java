package com.example.shopping.kakao;

import lombok.Data;

@Data
public class ApprovedCancelAmount {
    private int total;
    private int tax_free;
    private int vat;
    private int point;
    private int discount;
    private int green_deposit;
}
