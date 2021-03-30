package com.store.member.service;

import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.store.member.domain.MemberDTO;
import com.store.member.mapper.MemberMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
	
	private final MemberMapper memberMapper;
	private final PasswordEncoder passwordEncoder;

	@Override
	public boolean saveMember(MemberDTO params) {
		if (StringUtils.isNotBlank(params.getPassword())) {
			String encodedPassword = passwordEncoder.encode(params.getPassword());
			params.setPassword(encodedPassword);
		}
		return memberMapper.saveMember(params) > 0;
	}

	@Override
	public MemberDTO getMember(String email) {
		return memberMapper.selectMember(email);
	}

	@Override
	public boolean deleteMember(String email) {
		return memberMapper.deleteMember(email) > 0;
	}

	@Override
	public List<MemberDTO> getMemberList() {
		int totalCount = memberMapper.selectMemberTotalCount();
		if (totalCount < 1) {
			return Collections.emptyList();
		}
		return memberMapper.selectMemberList();
	}

	
}
