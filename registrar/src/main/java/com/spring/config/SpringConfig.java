package com.spring.config;

import com.spring.registrar.MyFactoryBean;
import org.springframework.context.annotation.Import;

/**
 * {@code @Description:}
 */
// @Import({Person.class})
@Import({MyFactoryBean.class})
public class SpringConfig {
}