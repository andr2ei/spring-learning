package ru.andronov.services;

import ru.andronov.model.Phone;

public interface PhoneService {
    Phone getPhoneByPrice(double price);
}
