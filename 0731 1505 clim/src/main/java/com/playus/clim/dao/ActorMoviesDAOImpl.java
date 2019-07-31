package com.playus.clim.dao;

import org.apache.ibatis.session.SqlSession;

public class ActorMoviesDAOImpl implements ActorMoviesDAO{
	
	private SqlSession session;
	
	public void setSession(SqlSession session) {
		this.session = session;
	}
	
	
	
}
