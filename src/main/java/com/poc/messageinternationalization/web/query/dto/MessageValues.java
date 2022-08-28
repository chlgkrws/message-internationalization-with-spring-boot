package com.poc.messageinternationalization.web.query.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

@Setter
@Getter
public class MessageValues {

    private Map<String, String> messages = new HashMap<>();
}
