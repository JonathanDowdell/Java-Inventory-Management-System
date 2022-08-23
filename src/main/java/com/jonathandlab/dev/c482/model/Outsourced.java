package com.jonathandlab.dev.c482.model;

/**
 * @author Jonathan Dowdell
 */
public class Outsourced extends Part {

    private String companyName;

    public Outsourced(int id, String name, double price, int stock, int min, int max, String companyName) {
        super(id, name, price, stock, min, max);
        this.companyName = companyName;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void setPrice(double price) {
        super.setPrice(price);
    }

    @Override
    public int getStock() {
        return super.getStock();
    }

    @Override
    public void setStock(int stock) {
        super.setStock(stock);
    }

    @Override
    public int getMin() {
        return super.getMin();
    }

    @Override
    public void setMin(int min) {
        super.setMin(min);
    }

    @Override
    public int getMax() {
        return super.getMax();
    }

    @Override
    public void setMax(int max) {
        super.setMax(max);
    }
}
