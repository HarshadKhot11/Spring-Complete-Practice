package com.example;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Container is ready");

        OrderDelivery od = context.getBean(OrderDelivery.class);
        od.placeOrder("harshadkhot2003@gmail.com");
        context.close();
    }
}
