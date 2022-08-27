package com.poc.messageinternationalization.web.validation.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Setter
@Getter
public class ValidationDto {

    @NotEmpty(message = "{validation.name.not-empty}")          // 메시지코드 명시
    private String name;

    @Min(value = 0)                                             // 기본 메시지코드 사용
    private int age;
}
