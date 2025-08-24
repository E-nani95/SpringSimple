package com.example.demo.member.controller;


import com.example.demo.member.controller.dto.JoinRequest;
import com.example.demo.member.controller.dto.JoinResponse;
import com.example.demo.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

// 여기로 요청이 들어오면 service로 serivce에서 repo로
// controller 할때 적어줘야함
@RestController
@RequiredArgsConstructor
public class MemberController {
//    총 4가지로 구성되어 있음
//    @PostMapping
//    @GetMapping
//    @PutMapping
//    @DeleteMapping
    private final MemberService memberService;


    //HTML Get 신호 받는 Annotation
    // Get은 주로 자원을 가져오는 역할
    @GetMapping("/")
    public String getHello(){
        return "Hello Test";
    }
    @GetMapping("/testT")
    public String testT(){
        return "Test1";
    }


    //Post는 자원을 보내주는 역할
    @PostMapping("/join")
    public JoinResponse join(@RequestBody JoinRequest joinRequest){
//        String id = joinRequest.getId();
//        String name = joinRequest.getName();
//        String phoneNumber = joinRequest.getPhoneNumber();
//
//        String result = memberService.join(id, name, phoneNumber);
        String result = memberService.join(joinRequest);

        if("success".equalsIgnoreCase(result)){
            return new JoinResponse(200,"success", joinRequest.getId());

        }else{
            return  new JoinResponse(400,"fail", null);
        }

        // entity -> 어떤값들을 받을것인가(저장할것인가)
    }

}




//Model -> DAO ==DB연동을 위한 // DO == 데이터의 구조를 표현
