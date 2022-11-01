
package com.demo.whatsappapiDemo.Request;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


public class ChatBotRequest implements Serializable
{

    @JsonProperty("messaging_product")
    private String messagingProduct;
    @JsonProperty("recipient_type")
    private String recipientType;
    @JsonProperty("to")
    private String to;
    @JsonProperty("type")
    private String type;
    @JsonProperty("template")
    private Template template;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7851921641470449327L;

    @JsonProperty("messaging_product")
    public String getMessagingProduct() {
        return messagingProduct;
    }

    @JsonProperty("messaging_product")
    public void setMessagingProduct(String messagingProduct) {
        this.messagingProduct = messagingProduct;
    }

    @JsonProperty("recipient_type")
    public String getRecipientType() {
        return recipientType;
    }

    @JsonProperty("recipient_type")
    public void setRecipientType(String recipientType) {
        this.recipientType = recipientType;
    }

    @JsonProperty("to")
    public String getTo() {
        return to;
    }

    @JsonProperty("to")
    public void setTo(String to) {
        this.to = to;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("template")
    public Template getTemplate() {
        return template;
    }

    @JsonProperty("template")
    public void setTemplate(Template template) {
        this.template = template;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
