package com.wellsfargo.counselor.entity;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    private Client client;

    @Column(nullable = false)
    private Date creationDate;

    @Column(nullable = false)
    private Date lastUpdated;

    @Column(nullable = false)
    private BigDecimal totalValue;

    @Column(nullable = false)
    private String currency;

    @Column(nullable = false)
    private String riskLevel;

    @Column(nullable = false)
    private String description;


    @OneToMany(mappedBy = "portfolio")
    private List<Security> securities;

    public Portfolio() {
    }

    public Portfolio(Client client, Date creationDate, Date lastUpdated, BigDecimal totalValue, String currency, String riskLevel, String description, List<Security> securities) {
        this.client = client;
        this.creationDate = creationDate;
        this.lastUpdated = lastUpdated;
        this.totalValue = totalValue;
        this.currency = currency;
        this.riskLevel = riskLevel;
        this.description = description;
        this.securities = securities;
    }

    public Integer getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}
