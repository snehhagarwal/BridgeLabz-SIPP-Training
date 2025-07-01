package Inheritance;

public class RetailApp {
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder(
            "ORD12345",
            "2025-07-01",
            "TRK987654",
            "2025-07-03"
        );

        order.displayOrderDetails();
    }
}

