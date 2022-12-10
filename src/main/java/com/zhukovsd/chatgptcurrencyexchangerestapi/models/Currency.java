package com.zhukovsd.chatgptcurrencyexchangerestapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;

@Entity
@Table(name = "currencies")
public class Currency implements Serializable {
    @Id
    @GeneratedValue
    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    @JsonProperty("code")
    private String code;

    @Getter
    @Setter
    @JsonProperty("name")
    private String name;
}
