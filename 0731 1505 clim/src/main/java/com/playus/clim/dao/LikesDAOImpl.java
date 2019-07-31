package com.playus.clim.dao;

import org.apache.ibatis.session.SqlSession;

public class LikesDAOImpl implements LikesDAO{

private SqlSession session;
	
	public void setSession(SqlSession session) {
		this.session = session;
	}
	
}
