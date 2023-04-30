package com.kodilla.good.patterns.food2door;

public class User {
    private String companyName;
    private int countProduct;
    private String kindOfProduct;

    public User(String companyName, int countProduct, String kindOfProduct) {
        this.companyName = companyName;
        this.countProduct = countProduct;
        this.kindOfProduct = kindOfProduct;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getCountProduct() {
        return countProduct;
    }

    public String getKindOfProduct() {
        return kindOfProduct;
    }
}
