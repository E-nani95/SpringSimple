package com.example.demo.member.repository.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

//Entity 역할
//table 설계
//class안에 설정된 값으로 필드 구성을 해줌
//http://localhost:8080/h2-console 에서 확인 -> contect 누르고 show tables입력 -> select * from Member 하고 아래 필드 생성확인

@Entity //DB 테이블과 매핑합니다.
@NoArgsConstructor //PA의 요구사항을 만족시키기 위해 추가합니다.
//@Builder&@AllArgsConstructo는 한 쌍으로, 개발자가 new 키워드로 객체를 무분별하게 생성하는 것을 막고, 오직 Builder 패턴을 통해서만 안전하게 객체를 생성하도록 강제합니다.
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@Getter //생성된 객체의 데이터를 외부에서 읽을 수 있도록 허용합니다.
public class Member {

    @Id
    //auto_increment // DB에 그 순서대로 번호 매겨주는거 ex)idx에
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long index;

    private String id;

    private String name;

    private String phoneNumber;

}
