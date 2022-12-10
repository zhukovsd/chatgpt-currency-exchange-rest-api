package com.zhukovsd.chatgptcurrencyexchangerestapi.controllers.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class ConversionResult {
    private String from;
    private String to;
    private BigDecimal amount;
    private BigDecimal rate;
    private BigDecimal convertedAmount;
}