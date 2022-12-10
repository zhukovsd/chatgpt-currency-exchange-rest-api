package com.zhukovsd.chatgptcurrencyexchangerestapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "rates")
public class Rate {
    @Id
    @GeneratedValue
    @Getter
    @Setter
    @JsonIgnore
    private int id;

    @Getter
    @Setter
    @JsonIgnore
    private int fromCurrencyId;

    @Getter
    @Setter
    @JsonIgnore
    private int toCurrencyId;

    @Getter
    @Setter
    private BigDecimal rate;
}