package com.example.demo.member.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JoinResponse {
    private int status;
    private String message;
    private Object data;
}
