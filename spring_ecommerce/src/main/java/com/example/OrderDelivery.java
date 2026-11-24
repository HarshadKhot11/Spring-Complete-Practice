package com.example;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;


@Component
public class OrderDelivery {
    private final Notifier notifier;

    public OrderDelivery(@Qualifier("whatsappMsg") Notifier notifier)
    {
        this.notifier = notifier;
    }

    public void placeOrder(String customer)
    {
        System.out.println("Order by : "+customer);
        notifier.send(customer," thanks for order");
    }
}
