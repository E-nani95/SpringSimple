package com.example.demo.member.service;


import com.example.demo.member.controller.dto.JoinRequest;
import com.example.demo.member.repository.MemberRepository;
import com.example.demo.member.repository.entity.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberSeviceImpl implements MemberService{

    //무조건 해야함
    private final MemberRepository memberRepository;

//    @Override
//    public String join(String name, String id, String phoneNumber) {
//    Member member = Member.builder()
//            .id(id)
//            .name(name)
//            .phoneNumber(phoneNumber)
//            .build();
//        memberRepository.save(member);
//
//        return "success";
//}

    @Override
    public String join(JoinRequest joinRequest) {
        Member member = Member.builder()
                .id(joinRequest.getId())
                .name(joinRequest.getName())
                .phoneNumber(joinRequest.getPhoneNumber())
                .build();
        memberRepository.save(member);

        return "success";
    }
}
