
package com.example.model;

public class Customer {

    private int customerId;
    private String customerName;
    private String email;
    private long mobileNumber;

    public Customer(int customerId, String customerName, String email, long mobileNumber) {

        System.out.println("Customer class created");

        this.customerId = customerId;
        this.customerName = customerName;
        this.email = email;
        this.mobileNumber = mobileNumber;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

}
yala git la push karun pude jaych ahe