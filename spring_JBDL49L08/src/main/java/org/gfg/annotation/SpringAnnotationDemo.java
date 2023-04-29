package org.gfg.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotationDemo {
    public static void main(String[] args) {
        //  no xml, container still we are making beans
        // provided a path, spring will take the path and scan everything inside this package
        // annotations -> bean
        ApplicationContext context = new AnnotationConfigApplicationContext("org.gfg.annotation");
        //different id to bean name, by default it is something class name but in camel case
        NotificationService notificationService = (NotificationService) context.getBean("notificationService");
        notificationService.sendNotification("message body");
    }
}
