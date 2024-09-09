package com.example.inventory;
public class Report {
	private Stock stock;
    public Report(Stock stock) {
        this.stock = stock;
    }
    public String generateReport() {
        return "Current Stock: " + stock.getStock();
    }
}