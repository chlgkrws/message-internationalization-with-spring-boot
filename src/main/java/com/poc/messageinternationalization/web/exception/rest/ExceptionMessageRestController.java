package com.poc.messageinternationalization.web.exception.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exception")
public class ExceptionMessageRestController {

    /**
     * @DefaultExceptionHandler
     * @throws Exception
     */
    @GetMapping
    public void exception() throws Exception {
        if (true) {
            throw new Exception("exception.message");
        }
    }
}
