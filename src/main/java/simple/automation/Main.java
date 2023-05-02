package simple.automation;

import java.util.Objects;

public class Main {

    private static final String EXISTED_USER = "existed";
    private static final String NOT_EXISTED_USER = "notExisted";

    public static void main(String[] args) {
        new AuthorizationTests().testLogin();

        OrderTests orderTests = new OrderTests();
        orderTests.testCreateOrder();
        orderTests.testListOrders();
    }
}