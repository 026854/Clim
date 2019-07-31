package com.playus.clim.dao;

import org.apache.ibatis.session.SqlSession;

public class PaymentsDAOImpl implements PaymentsDAO{
	
private SqlSession session;
	
	public void setSession(SqlSession session) {
		this.session = session;
	}

}
