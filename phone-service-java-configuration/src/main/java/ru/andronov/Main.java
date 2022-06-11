package ru.andronov;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.andronov.services.PhoneMarket;

@ComponentScan("ru.andronov.configuration")
@PropertySource("classpath:app.properties")
public class Main {

    public static void main(String[] args) {
        ApplicationContext appCtx = new AnnotationConfigApplicationContext(Main.class);
        PhoneMarket phoneMarket = appCtx.getBean(PhoneMarket.class);
        phoneMarket.greetAndSellPhone();
    }

}
