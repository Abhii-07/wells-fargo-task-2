package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private String phoneNumber;
    @Column(nullable = false)
    private String address;

    @ManyToOne
    private FinancialAdvisor financialAdvisor;

    @Column(nullable = false)
    private Date dateOfBirth;

    @Column(nullable = false)
    private String maritalStatus;

    @Column(nullable = false)
    private String employmentStatus;

    @Column(nullable = false)
    private BigDecimal totalAssets;

    @Column(nullable = false)
    private String riskAppetite;

    @ElementCollection
    private List<String> investmentGoals;


    public Client() {
    }

    public Client( String name, String email, String phoneNumber, String address, FinancialAdvisor financialAdvisor, Date dateOfBirth, String maritalStatus, String employmentStatus, BigDecimal totalAssets, String riskAppetite, List<String> investmentGoals) {

        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.financialAdvisor = financialAdvisor;
        this.dateOfBirth = dateOfBirth;
        this.maritalStatus = maritalStatus;
        this.employmentStatus = employmentStatus;
        this.totalAssets = totalAssets;
        this.riskAppetite = riskAppetite;
        this.investmentGoals = investmentGoals;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public FinancialAdvisor getFinancialAdvisor() {
        return financialAdvisor;
    }

    public void setFinancialAdvisor(FinancialAdvisor financialAdvisor) {
        this.financialAdvisor = financialAdvisor;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(String employmentStatus) {
        this.employmentStatus = employmentStatus;
    }

    public BigDecimal getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssets(BigDecimal totalAssets) {
        this.totalAssets = totalAssets;
    }

    public String getRiskAppetite() {
        return riskAppetite;
    }

    public void setRiskAppetite(String riskAppetite) {
        this.riskAppetite = riskAppetite;
    }

    public List<String> getInvestmentGoals() {
        return investmentGoals;
    }

    public void setInvestmentGoals(List<String> investmentGoals) {
        this.investmentGoals = investmentGoals;
    }
}
