package com.example.samplekafkaproducer.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.lang.NonNull;

/**
 * @author ilterisdkc
 */
public class ApplicationContextHolder implements ApplicationContextAware {

    private static ApplicationContext appContext;

    @Override
    public void setApplicationContext(@NonNull ApplicationContext applicationContext) throws BeansException {
        appContext = applicationContext;
    }

    public static ApplicationContext getAppContext() {
        return appContext;
    }
}
