package com.poc.messageinternationalization.configuration.message;


import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "configuration.message.internationalization", ignoreUnknownFields = false)
@Getter
public class InternationalizationProperties {
    private String enabled;
    private String parameterName;
}



