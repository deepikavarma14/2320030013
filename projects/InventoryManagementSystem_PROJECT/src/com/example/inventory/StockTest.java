package com.example.inventory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class StockTest {
	@Test
    void testAddStock() {
        Stock stock = new Stock(100);
        stock.addStock(50);
        assertEquals(150, stock.getStock());
    }
    @Test
    void testRemoveStock() {
        Stock stock = new Stock(100);
        stock.removeStock(50);
        assertEquals(50, stock.getStock());
    }
    @Test
    void testRemoveStockInsufficient() {
        Stock stock = new Stock(100);
        assertThrows(IllegalArgumentException.class, () -> stock.removeStock(150));
    }
}
