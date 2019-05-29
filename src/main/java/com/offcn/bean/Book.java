package com.offcn.bean;

import java.io.Serializable;

public class Book implements Serializable {

    private Integer bid;
    private String bname;
    private String author;
    private double price;
    public Book() {
        super();
    }
    public Book(String bname, String author, double price) {
        super();
        this.bname = bname;
        this.author = author;
        this.price = price;
    }
    public Integer getBid() {
        return bid;
    }
    public void setBid(Integer bid) {
        this.bid = bid;
    }
    public String getBname() {
        return bname;
    }
    public void setBname(String bname) {
        this.bname = bname;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Book [bid=" + bid + ", bname=" + bname + ", author=" + author + ", price=" + price + "]";
    }

}
