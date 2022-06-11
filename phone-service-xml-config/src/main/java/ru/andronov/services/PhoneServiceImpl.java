package ru.andronov.services;

import lombok.RequiredArgsConstructor;
import ru.andronov.model.Phone;

@RequiredArgsConstructor
public class PhoneServiceImpl implements PhoneService {

    @Override
    public Phone getPhoneByPrice(double price) {
        return new Phone("smartphone");
    }
}
