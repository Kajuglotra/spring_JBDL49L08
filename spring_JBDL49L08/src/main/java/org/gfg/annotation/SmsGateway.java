package org.gfg.annotation;

import org.springframework.stereotype.Component;

//notification as sms :
@Component
public class SmsGateway {
    public SmsGateway(){
    }
    public void sendSms(String msg){
        System.out.println("Sending msg as: "+msg);
    }
}
