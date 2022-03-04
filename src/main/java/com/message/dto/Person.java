package com.message.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Pattern;

@Getter
@Setter
public class Person {
    @Pattern( regexp = "^//d{10}$" , message = "mobile number should be 10 digit")
    private String phoneNum;

}
