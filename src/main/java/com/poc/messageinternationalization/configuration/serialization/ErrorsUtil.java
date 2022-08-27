package com.poc.messageinternationalization.configuration.serialization;

import org.springframework.validation.Errors;

import java.util.HashMap;
import java.util.Map;

public class ErrorsUtil {

    public static Map<String, Errors> errorModel(Errors errors) {
        Map<String, Errors> errorModel = new HashMap<>();

        errorModel.put("errors", errors);
        return errorModel;
    }
}
