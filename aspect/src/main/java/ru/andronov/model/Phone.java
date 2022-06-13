package ru.andronov.model;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@ToString
@Component
public class Phone {
    private final String type;

    public Phone(@Value("${phone.type}") String type) {
        this.type = type;
    }
}
