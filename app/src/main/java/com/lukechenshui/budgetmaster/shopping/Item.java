package com.lukechenshui.budgetmaster.shopping;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.ritaja.xchangerate.util.Currency;

import java.math.BigDecimal;

/**
 * Created by luke on 10/16/16.
 */
@Table(name = "Items")
public class Item extends Model {
    @Column(name = "Currency")
    private Currency currency;
    @Column(name = "Price")
    private BigDecimal price;
    @Column(name = "Name")
    private String name;
    @Column(name = "Picture")
    private byte[] picture;

    public Item() {
        super();
    }

    public Item(Currency currency, BigDecimal price, String name, byte[] picture) {
        super();
        this.currency = currency;
        this.price = price;
        this.name = name;
        this.picture = picture;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Price: " + getPrice() + " Currency: " + getCurrency();
    }
}