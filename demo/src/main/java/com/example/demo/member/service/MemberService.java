package com.example.demo.member.service;

import com.example.demo.member.controller.dto.JoinRequest;

public interface MemberService {
    // 이런 값들을 받겠다
//    String join(String id, String name,  String phoneNumber);
    String join(JoinRequest joinRequest);
}
