package com.store.member;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.store.member.domain.MemberDTO;
import com.store.member.service.MemberService;

@SpringBootTest
public class MemberTests {

	@Autowired
	private MemberService memberService;

	@Test
	public void testBySaveMember() {

		MemberDTO member = new MemberDTO();
		member.setId((long) 1);
		member.setEmail("admin");
		member.setPassword("123!@#");
		member.setNickname("매니저");
		member.setPhone("01011112222");
		assertTrue(memberService.saveMember(member));
	}

}
