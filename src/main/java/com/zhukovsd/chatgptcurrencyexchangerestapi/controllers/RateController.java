package com.zhukovsd.chatgptcurrencyexchangerestapi.controllers;

import com.zhukovsd.chatgptcurrencyexchangerestapi.controllers.dto.ConversionResult;
import com.zhukovsd.chatgptcurrencyexchangerestapi.models.Rate;
import com.zhukovsd.chatgptcurrencyexchangerestapi.repositories.RateRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rate")
public class RateController {

    private final RateRepository rateRepository;

    public RateController(RateRepository rateRepository) {
        this.rateRepository = rateRepository;
    }

    @GetMapping("/{from}/{to}")
    public Rate getRate(
            @PathVariable String from,
            @PathVariable String to
    ) {
        return rateRepository.findByFromAndTo(from, to).orElse(null);
    }
}