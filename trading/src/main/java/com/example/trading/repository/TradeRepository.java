package com.example.trading.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.trading.model.Trade;

@Repository
public interface TradeRepository extends JpaRepository<Trade, Long> {
    // Define custom query methods if needed
}
