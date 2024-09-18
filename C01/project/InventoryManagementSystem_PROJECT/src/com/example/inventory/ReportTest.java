package com.example.inventory;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class ReportTest {
	@Test
    void testGenerateReport() {
        Stock stock = new Stock(100);
        Report report = new Report(stock);
        assertEquals("Current Stock: 100", report.generateReport());
    }
}