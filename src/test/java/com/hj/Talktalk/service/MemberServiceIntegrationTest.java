package com.hj.Talktalk.service;

import com.hj.Talktalk.domain.Member;
import com.hj.Talktalk.repository.MemberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
//@Transactional
public class MemberServiceIntegrationTest {
    @Autowired MemberService memberService;
    @Autowired MemberRepository memberRepository;

    @Test
    public void 회원가입() throws Exception{
        // Given
        Member member = new Member();
        member.setId("h1");
        member.setName("hello");
        member.setPassword("1234");

        // When
        String saveId = memberService.join(member);

        // Then
        Member findMember = memberRepository.findById(saveId).get();
        assertEquals(member.getName(), findMember.getName());
    }

    @Test
    public void 중복_회원_예외() throws Exception{
        // Given
        Member member1 = new Member();
        member1.setId("s1");
        member1.setName("spring");
        member1.setPassword("1234");

        Member member2 = new Member();
        member2.setId("s1");
        member2.setName("spring");
        member2.setPassword("1234");

        // When
        memberService.join(member1);
        IllegalStateException e = assertThrows(IllegalStateException.class,
                () -> memberService.join(member2));
        assertThat(e.getMessage()).isEqualTo("이미 존재하는 회원입니다.");
    }
}
