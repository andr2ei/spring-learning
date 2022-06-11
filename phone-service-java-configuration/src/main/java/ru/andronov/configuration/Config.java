package ru.andronov.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.andronov.model.Phone;
import ru.andronov.services.PhoneMarket;
import ru.andronov.services.PhoneMarketImpl;
import ru.andronov.services.PhoneService;
import ru.andronov.services.PhoneServiceImpl;

import java.io.InputStream;

@Configuration
public class Config {

    @Value("${phone.type}")
    private String type;
    @Value("#{T(java.lang.System).in}")
    private InputStream inputStream;

    @Bean
    public Phone phone() {
        return new Phone(type);
    }

    @Bean
    public PhoneService phoneService(Phone phone) {
        return new PhoneServiceImpl(phone);
    }

    @Bean
    public PhoneMarket phoneMarket(PhoneService phoneService) {
        return new PhoneMarketImpl(phoneService, inputStream);
    }

}
