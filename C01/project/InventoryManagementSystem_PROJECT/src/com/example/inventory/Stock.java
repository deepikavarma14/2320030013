package com.example.inventory;
public class Stock {
	private int quantity;
    public Stock(int quantity) {
        this.quantity = quantity;
    }
    public void addStock(int amount) {
        quantity += amount;
    }
    public void removeStock(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
        } else {
            throw new IllegalArgumentException("Not enough stock");
        }
    }
    public int getStock() {
        return quantity;
    }
}
