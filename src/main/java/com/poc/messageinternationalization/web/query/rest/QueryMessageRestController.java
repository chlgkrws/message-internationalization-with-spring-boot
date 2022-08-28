package com.poc.messageinternationalization.web.query.rest;

import com.poc.messageinternationalization.web.query.dto.MessageValues;
import com.poc.messageinternationalization.web.query.service.QueryMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/query")
@RequiredArgsConstructor
public class QueryMessageRestController {

    private final QueryMessageService queryMessageService;

    /**
     *
     * @param code : Message code
     * @param contains : true - Message code(param)가 Message code(properties)의 문자열에 포함되어있으면 반환, false - Message code(param)가 Message code(properties)와 정확히 일치하면 반환
     * @return
     */
    @GetMapping
    public ResponseEntity query(@RequestParam String code, @RequestParam boolean contains) throws IOException {
        MessageValues messageValues = this.queryMessageService.find(code, contains);
        return ResponseEntity.ok().body(messageValues);
    }
}
