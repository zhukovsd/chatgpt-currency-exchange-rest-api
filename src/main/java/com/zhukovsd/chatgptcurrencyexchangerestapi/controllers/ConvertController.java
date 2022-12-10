package com.zhukovsd.chatgptcurrencyexchangerestapi.controllers;

import com.zhukovsd.chatgptcurrencyexchangerestapi.controllers.dto.ConversionRequest;
import com.zhukovsd.chatgptcurrencyexchangerestapi.controllers.dto.ConversionResult;
import com.zhukovsd.chatgptcurrencyexchangerestapi.models.Rate;
import com.zhukovsd.chatgptcurrencyexchangerestapi.repositories.RateRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Optional;

@RestController
@RequestMapping("/convert")
public class ConvertController {
    private final RateRepository rateRepository;

    public ConvertController(RateRepository rateRepository) {
        this.rateRepository = rateRepository;
    }

    @PostMapping
    public ResponseEntity<ConversionResult> convert(@RequestBody ConversionRequest request) {
        String from = request.getFrom();
        String to = request.getTo();
        BigDecimal amount = request.getAmount();

        Optional<Rate> rate = rateRepository.findByFromAndTo(from, to);
        if (rate.isPresent()) {
            BigDecimal convertedAmount = amount.multiply(rate.get().getRate());
            ConversionResult result = new ConversionResult(from, to, amount, rate.get().getRate(), convertedAmount);
            return ResponseEntity.ok(result);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
