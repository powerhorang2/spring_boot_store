package com.store.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.store.member.domain.MemberDTO;

@Mapper
public interface MemberMapper {

	/** 회원 정보 저장 */
	public int saveMember(MemberDTO params);

	/** 회원 정보 조회 */
	public MemberDTO selectMember(String email);

	/** 회원 정보 삭제 */
	public int deleteMember(String email);

	/** 회원 리스트 조회 */
	public List<MemberDTO> selectMemberList();

	/** 전체 회원 수 조회 */
	public int selectMemberTotalCount();
	
}
