package com.example.demo.member.repository;

import com.example.demo.member.repository.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class MemberRepositoryTest {
    // Test를 위해 빈 객체를 끌어오는 Annotation
    @Autowired private MemberRepository memberRepository;

    @Test
    public void crudTest(){
//        Member member = Member.builder()
//                .name("플레쳐")
//                .id("flature")
//                .phoneNumber("010-0000-0000")
//                .build();

        //create Test
//        memberRepository.save(member);

        //get Test
//        Member foundMember = memberRepository.findById(1L).get();



    }
}
