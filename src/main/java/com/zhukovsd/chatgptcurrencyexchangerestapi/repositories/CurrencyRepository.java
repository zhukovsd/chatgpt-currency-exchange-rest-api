package com.zhukovsd.chatgptcurrencyexchangerestapi.repositories;

import com.zhukovsd.chatgptcurrencyexchangerestapi.models.Currency;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CurrencyRepository extends CrudRepository<Currency, Integer> {
    Optional<Currency> findByCode(String code);
}