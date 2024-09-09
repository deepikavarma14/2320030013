package com.example.inventory;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class OrderTest {
	@Test
    void testProcessOrder() {
        Stock stock = new Stock(100);
        Order order = new Order(stock);
        order.processOrder(30);
        assertEquals(70, stock.getStock());
    }
}