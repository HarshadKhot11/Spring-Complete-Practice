package com.example;
import org.springframework.stereotype.Component;

@Component
class WhatsappMsg implements Notifier
{
    WhatsappMsg()
    {
        System.out.println("Whatsapp class is created");
    }

    @Override 
    public void send(String to, String msg)
    {
        System.out.println(to + ":" +msg);
    }

}