package com.store.member.service;

import java.util.List;

import com.store.member.domain.MemberDTO;

public interface MemberService {

	/** 회원 정보 저장 */
	public boolean saveMember(MemberDTO params);
	
	/** 회원 정보 조회 */
	public MemberDTO getMember(String email);
	
	/** 회원 정보 삭제 */
	public boolean deleteMember(String email);
	
	/** 회원 리스트 조회 */
	public List<MemberDTO> getMemberList();
}
