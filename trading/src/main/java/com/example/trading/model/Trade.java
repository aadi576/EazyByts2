package com.example.trading.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Trade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // other fields, getters, setters, etc.

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
