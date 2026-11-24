package com.example;
import org.springframework.stereotype.Component;


@Component
public class EmailNotifire implements Notifier{
    public EmailNotifire(){
        System.out.println("Spring created email notifire");
    }

    public void send(String to, String msg)
    {
        System.out.println(to+ ":"+msg);
    }
}
