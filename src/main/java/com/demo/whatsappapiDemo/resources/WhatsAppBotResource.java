package com.demo.whatsappapiDemo.resources;

import com.demo.whatsappapiDemo.Request.ChatRequest;
import com.demo.whatsappapiDemo.service.BotServices;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class WhatsAppBotResource {

    private final BotServices botServices;

    public WhatsAppBotResource(BotServices botServices) {
        this.botServices = botServices;
    }

    @PostMapping(value = "send/message", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    Map<String, Object> genericChat(@RequestBody ChatRequest chatRequest) {
        return botServices.sendMessage(chatRequest);
    }
}
