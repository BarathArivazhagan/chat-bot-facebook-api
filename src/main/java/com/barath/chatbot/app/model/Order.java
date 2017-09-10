package com.barath.chatbot.app.model;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by barath.arivazhagan on 9/6/2017.
 */
public class Order {

    private AtomicInteger orderId=new AtomicInteger(0);

    private String productName;

    private String locationName;

    private int quantity;

    public AtomicInteger getOrderId() {
        return orderId;
    }

    public void setOrderId(AtomicInteger orderId) {
        this.orderId = orderId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public Order(String productName, String locationName, int quantity) {

        this.productName = productName;
        this.locationName = locationName;
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId.get() +
                ", productName='" + productName + '\'' +
                ", locationName='" + locationName + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
