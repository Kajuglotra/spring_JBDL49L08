package org.gfg.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// service which will send some notifications
@Component  // annotation
public class NotificationService {
    @Autowired
    private SmsGateway gateway;

    public NotificationService(){
    }
    public void sendNotification(String msg){
        gateway.sendSms(msg);
    }
}


// class1 - class2
//1 advantage
// class 2 have 10 data members -> keep info about all 10 data members -> headache is gone
//2nd advantage
// transaction-> updation -> in object

//object has some properties container will keep the object properties to itself
// i am updating the object


//wheneenver i will fetch obj, updated object get fetched
// object -> createdat,  updatedat

//limited heap area
// for sure -> giving our headache to spring

// java archive // backend
//web archive -> all frontend backend all