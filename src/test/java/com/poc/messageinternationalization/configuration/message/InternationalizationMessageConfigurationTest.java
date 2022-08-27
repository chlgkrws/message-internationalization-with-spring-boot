package com.poc.messageinternationalization.configuration.message;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;

import java.util.Locale;


@SpringBootTest
class InternationalizationMessageConfigurationTest {

    @Autowired
    MessageSource messageSource;

    @Test
    void messageSourceCookieTest() {
        String hello = messageSource.getMessage("hello", null, Locale.KOREAN);
        String hello1 = messageSource.getMessage("hello", null, Locale.ENGLISH);

        Assertions.assertThat(hello).isEqualTo("kr_헬로우");
        Assertions.assertThat(hello1).isEqualTo("en_hello");
    }

}