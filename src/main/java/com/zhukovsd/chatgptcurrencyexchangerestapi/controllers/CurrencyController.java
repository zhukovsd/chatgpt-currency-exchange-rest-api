package com.zhukovsd.chatgptcurrencyexchangerestapi.controllers;


import com.zhukovsd.chatgptcurrencyexchangerestapi.models.Currency;
import com.zhukovsd.chatgptcurrencyexchangerestapi.repositories.CurrencyRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/currencies")
public class CurrencyController {

    private final CurrencyRepository currencyRepository;

    public CurrencyController(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    @GetMapping
    public Iterable<Currency> getCurrencies() {
        Iterable<Currency> all = currencyRepository.findAll();
        return all;
    }

    @GetMapping("/{code}")
    public Currency getCurrency(@PathVariable String code) {
        return currencyRepository.findByCode(code).orElse(null);
    }
}