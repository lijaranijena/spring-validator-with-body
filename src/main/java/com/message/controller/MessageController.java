package com.message.controller;

import com.message.dto.Person;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
public class MessageController {

    @GetMapping("/message")
    public String getMessage(@RequestBody @Valid Person person){
        return "otp sent successfully";
    }

}
