package com.store.member;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
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
	
	@Test
	public void testBySelectMember() {
		
		MemberDTO member = memberService.getMember("admin");
		
		try {
			String memberJson = new ObjectMapper().writeValueAsString(member);

			System.out.println("=========================");
			System.out.println(memberJson);
			System.out.println("=========================");

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testBySelectMemberList() {
		
		List<MemberDTO> memberList = memberService.getMemberList();
		
		for(MemberDTO member : memberList) {
			try {
				String memberJson = new ObjectMapper().writeValueAsString(member);

				System.out.println("=========================");
				System.out.println(memberJson);
				System.out.println("=========================");

			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	@Test
	public void testByDeleteMember() {
		
		boolean result = memberService.deleteMember("admin");
		
		String message = result ? "성공" : "실패";
		
		System.out.println("=========================");
		System.out.println("삭제 " + message);
		System.out.println("=========================");
		
	}

}
