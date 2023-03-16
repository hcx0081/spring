package com.spring.config;

import com.spring.entity.Person;
import org.springframework.context.annotation.Import;

/**
 * {@code @Description:}
 */
@Import({Person.class})
public class SpringConfig {
}