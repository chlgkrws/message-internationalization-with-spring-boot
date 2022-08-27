package com.poc.messageinternationalization.configuration.exception;

import lombok.RequiredArgsConstructor;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Locale;

@ControllerAdvice
@RequiredArgsConstructor
public class DefaultExceptionHandler {

    private final MessageSource messageSource;

    @ExceptionHandler(Exception.class)
    public ResponseEntity handle(Exception e) {

        Locale locale = LocaleContextHolder.getLocale();
        String message = messageSource.getMessage(e.getMessage(), null, locale);

        return ResponseEntity.ok().body(message);
    }
}
