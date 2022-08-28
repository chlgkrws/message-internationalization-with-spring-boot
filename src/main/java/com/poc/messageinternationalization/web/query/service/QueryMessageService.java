package com.poc.messageinternationalization.web.query.service;

import com.poc.messageinternationalization.web.query.dto.MessageValues;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

@Service
public class QueryMessageService {

    public MessageValues find(String code, boolean contains) throws IOException {
        MessageValues messageValues = new MessageValues();
        Map<String, String> messages = messageValues.getMessages();

        String messageFilePath = "";

        Properties messageProps = new Properties();

        // 프로퍼티 파일 스트림에 담기
        Resource resource = new ClassPathResource("i18n/message.properties");
        InputStream inputStream = resource.getInputStream();

        messageProps.load(inputStream);
        System.out.println("messageProps = " + messageProps);

        return null;
    }
}
