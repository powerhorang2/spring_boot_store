package com.store.member.domain;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDTO {

	/** 번호 (PK) */
	private Long id;

	/** 아이디 */
	private String email;

	/** 비밀번호 */
	private String password;

	/** 닉네임 */
	private String nickname;

	/** 연락처 */
	private String phone;

	/** 삭제 여부 */
	private String deleteYn;

	/** 등록일 */
	private LocalDateTime insertTime;

	/** 수정일 */
	private LocalDateTime updateTime;

	/** 마지막 로그인 시간 */
	private LocalDateTime lastLoginTime;

}