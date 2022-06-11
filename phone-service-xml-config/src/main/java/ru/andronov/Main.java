package ru.andronov;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.andronov.services.PhoneMarket;

public class Main {

    public static void main(String[] args) {
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("context.xml");
        PhoneMarket phoneMarket = appCtx.getBean(PhoneMarket.class);
        phoneMarket.greetAndSellPhone();
    }

}
