package com.zhukovsd.chatgptcurrencyexchangerestapi.repositories;

import com.zhukovsd.chatgptcurrencyexchangerestapi.models.Rate;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RateRepository extends CrudRepository<Rate, Integer> {
    @Query("SELECT DISTINCT (r) FROM Rate r JOIN Currency f ON r.fromCurrencyId = f.id " +
            "JOIN Currency t ON r.toCurrencyId = t.id " +
            "WHERE f.code = :from AND t.code = :to")
    Optional<Rate> findByFromAndTo(String from, String to);
}