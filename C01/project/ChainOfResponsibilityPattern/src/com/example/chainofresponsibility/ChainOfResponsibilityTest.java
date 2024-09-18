package com.example.chainofresponsibility;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ChainOfResponsibilityTest {
	@Test
    void testHandler1() {
        Handler handler1 = new ConcreteHandler1();
        String result = handler1.handle("Type1 Request");
        assertEquals("Handled by ConcreteHandler1", result);
    }
    @Test
    void testHandler2() {
        Handler handler2 = new ConcreteHandler2();
        String result = handler2.handle("Type2 Request");
        assertEquals("Handled by ConcreteHandler2", result);
    }
    @Test
    void testChainOfHandlers() {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);

        String result1 = handler1.handle("Type1 Request");
        assertEquals("Handled by ConcreteHandler1", result1);

        String result2 = handler1.handle("Type2 Request");
        assertEquals("Handled by ConcreteHandler2", result2);
    }
    @Test
    void testUnprocessableRequest() {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setNext(handler2);

        String result = handler1.handle("Type3 Request");
        assertEquals("Request not handled", result);
    }
}