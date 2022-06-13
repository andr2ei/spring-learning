package ru.andronov.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.andronov.model.Phone;

@Service("phoneService")
@RequiredArgsConstructor
public class PhoneServiceImpl implements PhoneService {
    private final Phone phone;

    @Override
    public Phone getPhoneByPrice(double price) {
        return phone;
    }
}
