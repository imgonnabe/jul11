package com.qorlwn.web;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/*
 * @Controller = Controller
 * @Service = Service
 * @Repository = DAO
 */
@Repository
public class BoardDAO {
	// DB랑 연결
	@Autowired
	private SqlSession sqlSession;
}
