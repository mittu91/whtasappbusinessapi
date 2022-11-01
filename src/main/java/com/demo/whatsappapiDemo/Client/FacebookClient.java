package com.demo.whatsappapiDemo.Client;

import com.demo.whatsappapiDemo.Request.ChatBotRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;

@FeignClient(value = "chat-application", url = "${app.host.chatApi}")
public interface FacebookClient {
    @PostMapping(value = "{version}/{Phone-Number-ID}/messages", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    Map<String,Object> sendMessage(
            @RequestBody ChatBotRequest request
    , @PathVariable("version") String version, @PathVariable("Phone-Number-ID") String phoneNumberId, @RequestHeader(HttpHeaders.AUTHORIZATION) String authorization);

}
