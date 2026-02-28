package com.ideax.dto;

import java.util.Map;

public class HealthDto {

    private Map<String, String> message;

    public HealthDto() {
    }

    public HealthDto(Map<String, String> message) {
        this.message = message;
    }

    public Map<String, String> getMessage() {
        return message;
    }

    public void setMessage(Map<String, String> message) {
        this.message = message;
    }
}