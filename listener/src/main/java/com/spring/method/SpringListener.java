package com.spring.method;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * {@code @Description:}
 */
@Component
public class SpringListener {
    @EventListener
    public void handleEvent(ContextStartedEvent contextStartedEvent) {
        System.out.println("启动");
    }
}