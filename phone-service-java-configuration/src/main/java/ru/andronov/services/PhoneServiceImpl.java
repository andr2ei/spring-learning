package ru.andronov.services;

import lombok.RequiredArgsConstructor;
import ru.andronov.model.Phone;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

@RequiredArgsConstructor
public class PhoneServiceImpl implements PhoneService {
    private final Phone phone;

    @Override
    public Phone getPhoneByPrice(double price) {
        return phone;
    }
}
