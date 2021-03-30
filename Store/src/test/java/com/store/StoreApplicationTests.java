package com.store;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class StoreApplicationTests {

	@Autowired
	private ApplicationContext context;

	@Autowired
	private SqlSessionFactory sessionFactory;

	@Test
	public void testBySqlSessionFactory() {
		log.info("==================================================");
		log.info("1번 결과 : {}", context.getBean("sqlSessionFactory"));
		log.info("2번 결과 : {}", sessionFactory.toString());
		log.info("==================================================");
	}

}
