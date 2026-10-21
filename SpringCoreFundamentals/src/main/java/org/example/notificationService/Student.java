package org.example.notificationService;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    private  notificationService NotificationService;
    @Autowired
    public  Student(notificationService NotificationService){
        this.NotificationService=NotificationService;
    }
    public void notifyStudent(){
        NotificationService.sendMsg("you are a great loser");
    }


    @PostConstruct
        public  void init(){
        System.out.println("object created");
    }

    @PreDestroy
        public void destroy(){
        System.out.println("object destroyed");
    }
}
