package com.ideax.api;

import com.ideax.dto.HealthDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping(value = "/health", produces = {"application/json"})
    public ResponseEntity<HealthDto> healthCheck(){

        return buildHealthResponse("Healthy");
    }

    @GetMapping(value = "/liveness", produces = {"application/json"})
    public ResponseEntity<HealthDto> liveness(){
        return buildHealthResponse("Success");
    }

    @GetMapping(value = "/readiness", produces = {"application/json"})
    public ResponseEntity<HealthDto> readiness(){
        return buildHealthResponse("True");
    }

    private ResponseEntity<HealthDto> buildHealthResponse(String status){
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String timestamp = LocalDateTime.now().format(formatter);
        HealthDto healthDto = new HealthDto(status, timestamp);
        return ResponseEntity.ok(healthDto);
    }
}