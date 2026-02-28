package com.ideax.api;

import com.ideax.dto.HealthDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HealthController {

    @GetMapping(value = "/health", produces = {"application/json"})
    public ResponseEntity<HealthDto> healthCheck(){

        return buildHealthResponse("Health", "Healthy");
    }

    @GetMapping(value = "/liveness", produces = {"application/json"})
    public ResponseEntity<HealthDto> liveness(){
        return buildHealthResponse("Liveness", "Success");
    }

    @GetMapping(value = "/readiness", produces = {"application/json"})
    public ResponseEntity<HealthDto> readiness(){
        return buildHealthResponse("Readiness", "True");
    }

    private ResponseEntity<HealthDto> buildHealthResponse(String key, String value){
        return ResponseEntity.ok(
                new HealthDto(Map.of(key, value))
        );
    }
}
