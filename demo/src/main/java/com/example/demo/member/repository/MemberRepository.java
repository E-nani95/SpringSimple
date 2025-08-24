package com.example.demo.member.repository;

import com.example.demo.member.repository.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
//<entity안에 table명 & 데이터 타입>
public interface MemberRepository extends JpaRepository<Member,Long> {
//    테스트 코드작성
//    src/test/java/com/example/demo 안에 member.repository 패키지생성
//    MemberRepositoryTest 클래스 생성
}
