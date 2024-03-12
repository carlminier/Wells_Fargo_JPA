package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long portfolioId;

    @Column(nullable = false)
    private String creationDate;

    protected Portfolio() {

    }

    public Advisor(String creationDate) {
        this.creationDate = creationDate;
    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getCreationDate() {
        return creationDate; }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}