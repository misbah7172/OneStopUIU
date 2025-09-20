package com.example.onestopuiu.util;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class CartManager {
    private static CartManager instance;
    private ObservableList<Object> canteenCartItems;
    private double canteenTotalAmount;

    private CartManager() {
        canteenCartItems = FXCollections.observableArrayList();
        canteenTotalAmount = 0.0;
    }

    public static CartManager getInstance() {
        if (instance == null) {
            instance = new CartManager();
        }
        return instance;
    }

    public ObservableList<Object> getCanteenCartItems() {
        return canteenCartItems;
    }

    public void setCanteenCartItems(ObservableList<Object> items) {
        this.canteenCartItems = items;
    }

    public double getCanteenTotalAmount() {
        return canteenTotalAmount;
    }

    public void setCanteenTotalAmount(double amount) {
        this.canteenTotalAmount = amount;
    }

    public void clearCanteenCart() {
        canteenCartItems.clear();
        canteenTotalAmount = 0.0;
    }
} 