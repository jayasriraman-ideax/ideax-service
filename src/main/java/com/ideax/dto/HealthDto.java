package com.ideax.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.validation.annotation.Validated;

import java.util.Map;

//@Validated
@Data
//@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
public class HealthDto {

//    @JsonProperty("message")
    private Map<String, String> message;

}
