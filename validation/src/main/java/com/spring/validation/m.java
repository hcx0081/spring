package com.spring.validation;

import org.springframework.validation.DirectFieldBindingResult;
import org.springframework.validation.Errors;

/**
 * {@code @Description:}
 */
public class m {
    public static void main(String[] args) {
        Person person = new Person();
        PersonValidator personValidator = new PersonValidator();
        Errors errors = new DirectFieldBindingResult(person, "abc");
        personValidator.validate(person, errors);
        System.out.println(errors);
    }
}