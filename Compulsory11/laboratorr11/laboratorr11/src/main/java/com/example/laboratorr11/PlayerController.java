package com.example.laboratorr11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class PlayerController {
    @GetMapping
    public String getPlayers() {
        return "Player";
    }
}
