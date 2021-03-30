use store;

create table tb_member (
	id bigint not null auto_increment comment 'PK',
    email varchar(50) not null comment '아이디',
    password varchar(60) not null comment '비밀번호',
    nickname varchar(30) not null comment '닉네임',
    phone varchar(11) not null comment '연락처',
    delete_yn enum('Y', 'N') not null default 'N' comment '삭제 여부',
    insert_time datetime not null default now() comment '등록일',
    update_time datetime null comment '수정일',
	last_login_time datetime null comment '마지막 로그인 시간',
	primary key(id),
	unique key uk_member_email (email)
) comment '회원';