package com.poc.messageinternationalization.web.validation.rest;

import com.poc.messageinternationalization.configuration.serialization.ErrorsUtil;
import com.poc.messageinternationalization.web.validation.dto.ValidationDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/valid")
@Slf4j
public class ValidationMessageRestController {

    @PostMapping
    public ResponseEntity validationMessage(@Valid ValidationDto validationDto, Errors errors) {
        if (errors.hasErrors()) {
            log.info("errors ::: "+errors);
        }

        return ResponseEntity
                .ok()
                .body(ErrorsUtil.errorModel(errors));
    }
}
