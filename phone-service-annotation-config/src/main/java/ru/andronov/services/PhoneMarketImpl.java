package ru.andronov.services;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.andronov.model.Phone;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

@Service("phoneMarket")
public class PhoneMarketImpl implements PhoneMarket {
    private final PhoneService phoneService;
    private final BufferedReader bufferedReader;

    public PhoneMarketImpl(PhoneService phoneService, @Value("#{T(java.lang.System).in}") InputStream inputStream) {
        this.phoneService = phoneService;
        this.bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
    }

    @SneakyThrows
    @Override
    public void greetAndSellPhone() {
        System.out.println("Hi there!");
        System.out.println("Say price of phone you want!");
        double price = Double.parseDouble(bufferedReader.readLine());
        Phone phone = phoneService.getPhoneByPrice(price);
        System.out.println("Here is your phone " +  phone + " Thanks for using our market!");
    }
}
