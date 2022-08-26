package com.poc.messageinternationalization.configuration.message;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
@ConditionalOnProperty(value = "configuration.message.internationalization.enabled", havingValue = "false")
public class DefaultMessageConfiguration {

    @Bean
    public MessageSource messageSource() {
        ReloadableResourceBundleMessageSource messageSource =
                new ReloadableResourceBundleMessageSource();
        messageSource.addBasenames("classpath:i18n/message_kr");
        messageSource.setDefaultEncoding("UTF-8");
        return messageSource;
    }

}
