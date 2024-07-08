package com.example.simpledockerapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequiredArgsConstructor
public class SimpleController {

    @GetMapping(path = "/app", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> endpoint() throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        return ResponseEntity.ok(localHost.getHostAddress());
    }
}
