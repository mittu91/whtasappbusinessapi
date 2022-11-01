
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


public class Currency implements Serializable
{

    @JsonProperty("fallback_value")
    private String fallbackValue;
    @JsonProperty("code")
    private String code;
    @JsonProperty("amount_1000")
    private Integer amount1000;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8577862075568060499L;

    @JsonProperty("fallback_value")
    public String getFallbackValue() {
        return fallbackValue;
    }

    @JsonProperty("fallback_value")
    public void setFallbackValue(String fallbackValue) {
        this.fallbackValue = fallbackValue;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("amount_1000")
    public Integer getAmount1000() {
        return amount1000;
    }

    @JsonProperty("amount_1000")
    public void setAmount1000(Integer amount1000) {
        this.amount1000 = amount1000;
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
