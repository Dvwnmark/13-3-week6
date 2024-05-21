package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int SubId;
    private String name;
    private String credit;

    public int getSubId() {
        return SubId;
    }

    public void setSubId(int subId) {
        SubId = subId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public Book(int subId, String name, String credit) {
        super();
        SubId = subId;
        this.name = name;
        this.credit = credit;
    }

    public Book() {
        super();
    }

}
