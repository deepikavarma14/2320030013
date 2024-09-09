package com.example.inventory;
public class Order {
	private Stock stock;
    public Order(Stock stock) {
        this.stock = stock;
    }
    public void processOrder(int orderQuantity) {
        stock.removeStock(orderQuantity);
    }
}