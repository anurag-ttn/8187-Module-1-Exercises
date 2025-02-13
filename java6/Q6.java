
enum OrderStatus {
    PENDING("Order is awaiting confirmation."),
    PROCESSING("Order is being prepared."),
    SHIPPED("Order has been dispatched."),
    DELIVERED("Order has been successfully delivered."),
    CANCELLED("Order has been canceled."),
    REFUNDED("Refund has been issued for the order.");

    String val;
    OrderStatus(String s) {
        val = s;
    }

}


public class Q6 {
    static String processOrderStatus(OrderStatus o){
        return switch(o){
            case PENDING, REFUNDED, SHIPPED ,CANCELLED,DELIVERED,PROCESSING -> o.val;
            default -> "Invalid";
        };
    }
    public static void main(String[] args) {
        OrderStatus os = OrderStatus.PENDING;
        System.out.println(Q6.processOrderStatus(os));
        os = OrderStatus.PROCESSING;
        System.out.println(Q6.processOrderStatus(os));
        os = OrderStatus.REFUNDED;
        System.out.println(Q6.processOrderStatus(os));
        os = OrderStatus.DELIVERED;
        System.out.println(Q6.processOrderStatus(os));
        os = OrderStatus.CANCELLED;
        System.out.println(Q6.processOrderStatus(os));
        os = OrderStatus.SHIPPED;
        System.out.println(Q6.processOrderStatus(os));
    }
}
