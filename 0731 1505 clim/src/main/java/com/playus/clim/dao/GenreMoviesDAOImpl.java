package com.playus.clim.dao;

import org.apache.ibatis.session.SqlSession;

public class GenreMoviesDAOImpl implements GenreMoviesDAO{
	
private SqlSession session;
	
	public void setSession(SqlSession session) {
		this.session = session;
	}

}
