package com.zaman.repository;

import com.zaman.entity.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface QuoteRepository extends JpaRepository <Quote, Long > {
    @Query("SELECT q FROM Quote q ORDER BY FUNCTION('RANDOM') LIMIT 1")
    Optional<Quote> findRandomQuote();
}
