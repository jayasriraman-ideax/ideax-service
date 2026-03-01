package com.ideax.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
public class HealthDto {
    String status;
    String timestamp;

    public HealthDto() {}
    public HealthDto(String status, String timestamp) {
    }
}