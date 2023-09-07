package com.amigoes.fullstack;

import org.springframework.web.bind.annotation.GetMapping;

public class PingPongController {

    public record PingPong (String result){}

    @GetMapping("/ping")
    public PingPong getPingPong(){
        return new PingPong("Pong");
    }
}
