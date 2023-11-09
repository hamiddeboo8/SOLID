import PaymentServices.OnSiteOrderService;
import PaymentServices.OnlineOrderService;
import PaymentServices.OrderService;
import PaymentServices.PhoneOrderService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String customerName = getCustomerName(scanner);
        Order order = new Order(customerName);

        selectOrderItems(scanner, order);

        OrderService orderService = getOrderSvc(scanner, customerName);

        payPrice(orderService, order);

        printBill(order);
    }

    private static void printBill(Order order) {
        System.out.println(order);
    }

    private static String getCustomerName(Scanner scanner) {
        String customerName;
        System.out.println("Enter Customer Name : ");
        customerName = scanner.nextLine();
        return customerName;
    }

    private static void selectOrderItems(Scanner scanner, Order order) {
        int customerAnswerForOrder=0;
        while (customerAnswerForOrder!=3){
            System.out.println("For Ordering Sandwich enter 1.");
            System.out.println("For Ordering Pizza enter 2.");
            System.out.println("For submit your order enter 3");
            customerAnswerForOrder = scanner.nextInt();

            if(customerAnswerForOrder==1){
                order.addItem(new Food("sandwich",1000));
            } else if(customerAnswerForOrder==2){
                order.addItem(new Food("pizza",2000));
            }
        }
    }

    private static OrderService getOrderSvc(Scanner scanner, String customerName) {
        OrderService orderService = null;
        int customerAnswerForPaymentMethod;
        System.out.println("Enter Your Payment Method (1 for online and 2 for on-site and 3 for phone):");
        customerAnswerForPaymentMethod = scanner.nextInt();
        if(customerAnswerForPaymentMethod==1){
            orderService = new OnlineOrderService();
            orderService.orderRegister(customerName);
        } else if(customerAnswerForPaymentMethod==2){
            orderService = new OnSiteOrderService();
            orderService.orderRegister(customerName);
        } else if(customerAnswerForPaymentMethod==3){
            orderService = new PhoneOrderService();
            orderService.orderRegister(customerName);
        }
        return orderService;
    }

    private static void payPrice(OrderService orderService, Order order) {
        System.out.println("Pay Price:");
        if(orderService instanceof OnlineOrderService){
            orderService.orderPayment(order.getTotalPrice());
        } else if(orderService instanceof OnSiteOrderService){
            orderService.orderPayment(order.getTotalPrice());
        } else if(orderService instanceof PhoneOrderService){
            orderService.orderPayment(order.getTotalPrice());
        }
    }

}
