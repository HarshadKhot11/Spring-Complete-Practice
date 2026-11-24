package com.example.model;

public class Products {
    private int ProductId;
    private String ProductName;
    private double Price;

    public Products(int ProductId, String ProductName, double Price)
    {
        this.ProductId = ProductId;
        this.ProductName = ProductName;
        this.Price = Price;
    }

    public void setId(int ProductId)
    {
        this.ProductId = ProductId;
    }

    public int getId()
    {
        return ProductId;
    }

    public void setProductName(String ProductName)
    {
        this.ProductName = ProductName;
    }
    public String getProductName()
    {
        return ProductName;
    }

    public void setPrice(double Price)
    {
        this.Price = Price;
    }

    public double getPrice()
    {
        return Price;
    }
}
