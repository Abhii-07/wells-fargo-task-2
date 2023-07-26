package com.wellsfargo.counselor.entity;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private Date purchaseDate;

    @Column(nullable = false)
    private BigDecimal purchasePrice;

    @Column(nullable = false)
    private Integer quantity;


    @Column(nullable = false)
    private BigDecimal currentValue;

    @Column(nullable = false)
    private String currency;

    @Column(nullable = false)
    private String marketExchange;

    @Column(nullable = false)
    private String description;

    @ManyToOne
    private Portfolio portfolio;


    public Security() {
    }

    public Security( String name, String category, Date purchaseDate, BigDecimal purchasePrice, Integer quantity, BigDecimal currentValue, String currency, String marketExchange, String description, Portfolio portfolio) {
        this.name = name;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.currentValue = currentValue;
        this.currency = currency;
        this.marketExchange = marketExchange;
        this.description = description;
        this.portfolio = portfolio;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(BigDecimal currentValue) {
        this.currentValue = currentValue;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getMarketExchange() {
        return marketExchange;
    }

    public void setMarketExchange(String marketExchange) {
        this.marketExchange = marketExchange;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
