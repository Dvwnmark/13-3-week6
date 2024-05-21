package com.iuh.requestproductservice.dto;

public class BookDto {
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

    public BookDto(int subId, String name, String credit) {
        super();
        SubId = subId;
        this.name = name;
        this.credit = credit;
    }

    public BookDto() {
        super();
    }
}
