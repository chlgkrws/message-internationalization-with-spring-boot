package com.poc.messageinternationalization.configuration.message;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "configuration.message.internationalization", ignoreUnknownFields = false)
@Setter
@Getter
public class InternationalizationProperties {
    private String enabled;
    private String parameterName = "lang";
}



