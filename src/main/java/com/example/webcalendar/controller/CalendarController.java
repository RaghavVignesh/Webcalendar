package com.example.webcalendar.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalendarController {

    @GetMapping("/event/today")
    public ResponseEntity<Object> endPointController() {
        return ResponseEntity.ok().build();
    }
}
