package com.kodilla.patterns_2.facade.api;

import com.kodilla.patterns_2.facade.Order;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderWatcher {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderWatcher.class);

    @Before("execution(* com.kodilla.patterns_2.facade.api.OrderFacade.processOrder(..)) && args(order) && target(object)")
    public void logEvent(Order order, Object object) {
        LOGGER.info("Class: " + object.getClass().getName() + "  proceed order with id: " + order.getOrderId());
    }
}
