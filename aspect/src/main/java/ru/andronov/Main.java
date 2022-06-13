package ru.andronov;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import ru.andronov.services.PhoneMarket;

@EnableAspectJAutoProxy
@ComponentScan(basePackages = "ru.andronov")
@PropertySource("classpath:app.properties")
public class Main {

    public static void main(String[] args) {
        ApplicationContext appCtx = new AnnotationConfigApplicationContext(Main.class);
        PhoneMarket phoneMarket = appCtx.getBean("phoneMarket", PhoneMarket.class);
        phoneMarket.greetAndSellPhone();
    }

}
