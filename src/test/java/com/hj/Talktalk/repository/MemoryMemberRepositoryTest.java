//package com.hj.Talktalk.repository;
//
//import com.hj.Talktalk.domain.Member;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.*;
//
//public class MemoryMemberRepositoryTest {
//    MemoryMemberRepository repository = new MemoryMemberRepository();
//    @AfterEach
//    public void afterEach() {
//        repository.clearStore();
//    }
//    @Test
//    public void save() {
//        //given
//        Member member = new Member();
//        member.setEmail("m1");
//        member.setName("spring");
//        member.setPassword("1234");
//        //when
//        repository.save(member);
//        //then
//        Member result = repository.findById(member.getId()).get();
//        assertThat(result).isEqualTo(member);
//    }
//    @Test
//    public void findByName() {
//        //given
//        Member member1 = new Member();
//        member1.setEmail("s1");
//        member1.setName("spring1");
//        member1.setPassword("1234");
//        repository.save(member1);
//        Member member2 = new Member();
//        member2.setEmail("s1");
//        member2.setName("spring2");
//        member2.setPassword("1234");
//        repository.save(member2);
//        //when
//        Member result = repository.findByName("spring1").get();
//        //then
//        assertThat(result).isEqualTo(member1);
//    }
//    @Test
//    public void findAll() {
//        //given
//        Member member1 = new Member();
//        member1.setEmail("s1");
//        member1.setName("spring1");
//        member1.setPassword("1234");
//        repository.save(member1);
//        Member member2 = new Member();
//        member2.setEmail("s1");
//        member2.setName("spring2");
//        member2.setPassword("1234");
//        repository.save(member2);
//        //when
//        List<Member> result = repository.findAll();
//        //then
//        assertThat(result.size()).isEqualTo(2);
//    }
//}