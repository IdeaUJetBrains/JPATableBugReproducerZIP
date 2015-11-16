package com.test.bank.account;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;


@Entity
@Table(name = "TBL_BANK_ACCOUNT")
public class Account implements Serializable {

    private static final long serialVersionUID = -5824507170385847717L;

    public Account() {}

    public Account(String accountNumber, Double amount) {
        super();
        this.accountNumber = accountNumber;
        this.amount = amount;
    }

    @Id
    @Column(name = "ACCOUNTNUMBER")
    private String accountNumber;

    @Column(name = "AMOUNT")
    private Double amount;


    @Column(name = "VERSION")
    @Version
    private Long version = 0L;


    public String getAccountNumber() {
        return accountNumber;
    }


    public void setAccountNumber(java.lang.String accountnumber) {
        this.accountNumber = accountnumber;
    }


    public Double getAmount() {
        return amount;
    }


    public void setAmount(Double amount) {
        this.amount = amount;
    }


    public Long getVersion() {
        return version;
    }

}
