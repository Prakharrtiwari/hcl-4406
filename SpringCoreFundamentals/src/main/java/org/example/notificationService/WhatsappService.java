package org.example.notificationService;

public class WhatsappService implements  notificationService{

    @Override
    public void sendMsg(String msg) {
        System.out.println("Whatsapp Service"+msg);
    }
}
