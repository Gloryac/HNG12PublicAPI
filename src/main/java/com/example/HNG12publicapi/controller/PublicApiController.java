package com.example.HNG12publicapi.controller;

import com.example.HNG12publicapi.model.MyInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;


@RestController
@RequestMapping
public class PublicApiController {

    @GetMapping("/")
    public ResponseEntity<MyInfo> getInfo(){
        MyInfo info = new MyInfo(
                "chebetgloria18@gmail.com",
                Instant.now().toString(),
                "https://github.com/Gloryac/HNG12PublicAPI.git"
        );
        return ResponseEntity.ok(info);
    }
}
