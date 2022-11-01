
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

public class DateTime implements Serializable
{

    @JsonProperty("fallback_value")
    private String fallbackValue;
    @JsonProperty("day_of_week")
    private Integer dayOfWeek;
    @JsonProperty("year")
    private Integer year;
    @JsonProperty("month")
    private Integer month;
    @JsonProperty("day_of_month")
    private Integer dayOfMonth;
    @JsonProperty("hour")
    private Integer hour;
    @JsonProperty("minute")
    private Integer minute;
    @JsonProperty("calendar")
    private String calendar;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6056738747614078332L;

    @JsonProperty("fallback_value")
    public String getFallbackValue() {
        return fallbackValue;
    }

    @JsonProperty("fallback_value")
    public void setFallbackValue(String fallbackValue) {
        this.fallbackValue = fallbackValue;
    }

    @JsonProperty("day_of_week")
    public Integer getDayOfWeek() {
        return dayOfWeek;
    }

    @JsonProperty("day_of_week")
    public void setDayOfWeek(Integer dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @JsonProperty("year")
    public Integer getYear() {
        return year;
    }

    @JsonProperty("year")
    public void setYear(Integer year) {
        this.year = year;
    }

    @JsonProperty("month")
    public Integer getMonth() {
        return month;
    }

    @JsonProperty("month")
    public void setMonth(Integer month) {
        this.month = month;
    }

    @JsonProperty("day_of_month")
    public Integer getDayOfMonth() {
        return dayOfMonth;
    }

    @JsonProperty("day_of_month")
    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = dayOfMonth;
    }

    @JsonProperty("hour")
    public Integer getHour() {
        return hour;
    }

    @JsonProperty("hour")
    public void setHour(Integer hour) {
        this.hour = hour;
    }

    @JsonProperty("minute")
    public Integer getMinute() {
        return minute;
    }

    @JsonProperty("minute")
    public void setMinute(Integer minute) {
        this.minute = minute;
    }

    @JsonProperty("calendar")
    public String getCalendar() {
        return calendar;
    }

    @JsonProperty("calendar")
    public void setCalendar(String calendar) {
        this.calendar = calendar;
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
