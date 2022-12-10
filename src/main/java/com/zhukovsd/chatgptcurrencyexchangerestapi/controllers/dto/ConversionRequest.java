package com.zhukovsd.chatgptcurrencyexchangerestapi.controllers.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ConversionRequest {
    private String from;
    private String to;
    private BigDecimal amount;
}

