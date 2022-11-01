package com.demo.whatsappapiDemo.service;

import com.demo.whatsappapiDemo.Client.FacebookClient;
import com.demo.whatsappapiDemo.Request.ChatBotRequest;
import com.demo.whatsappapiDemo.Request.ChatRequest;
import com.demo.whatsappapiDemo.Request.Language;
import com.demo.whatsappapiDemo.Request.Template;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.Map;

@Service
public class BotServices {
    private final String token="Bearer EAAUk21Vgo2gBABpPZB24rtlgxh6C1fvXGUAlxfPwnW5t7ewY6JQqojrdpzVp7s4lXpLDZBx8rC3516jK5p1GeOWHG3t2HwMCsitsVPKdChAULw2QCfcUcmCdnHujjj12hHKZCIy2cxsREZBb5gyQrvFJLXuvLO0mp91BXDZAYaP7DgLDcjwTckDxS43oleIkkeH5OZCdKqx6yUDPZBlwZBHR5ZCHaB81lMlEZD";
    private final FacebookClient facebookClient;
    public BotServices(FacebookClient facebookClient) {
        this.facebookClient = facebookClient;
    }

    public Map<String, Object> sendMessage(ChatRequest chatRequest) {

        Template template=new Template();
        template.setName("welcone");
        Language language=new Language();
        language.setCode("en");
        template.setLanguage(language);
        ChatBotRequest request=new ChatBotRequest();
        request.setTo(chatRequest.getToNumber());
        request.setMessagingProduct("whatsapp");
/*
        request.setRecipientType("individual");
*/
        request.setType("template");
        request.setTemplate(template);
        return facebookClient.sendMessage(request,"v15.0","105520719022377",token);
    }
}
