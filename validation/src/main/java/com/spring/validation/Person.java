package com.spring.validation;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * {@code @Description:}
 */
@Component
@Data
public class Person {
    private String name;
    private int age;
}