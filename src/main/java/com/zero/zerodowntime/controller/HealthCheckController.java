package com.zero.zerodowntime.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthCheckController {

    @Value("${server.env}")
    private String env;

    @Value("${server.port}")
    private String port;

    @Value("${server.serverAddress}")
    private String address;

    @Value("${serverName}")
    private String serverName;

    @GetMapping("/hc")
    public ResponseEntity<?> healthCheck() {
        System.out.println("hc");

        return ResponseEntity.ok(Map.of(
                "env", env,
                "port", port,
                "address", address,
                "serverName", serverName
        ));
    }

    @GetMapping("/env")
    public ResponseEntity<?> envCheck() {
        return ResponseEntity.ok(env);
    }
}
