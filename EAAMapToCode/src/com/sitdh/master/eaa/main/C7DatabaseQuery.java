package com.sitdh.master.eaa.main;

public class C7DatabaseQuery {
	
	protected B7ConnectionPool connectionPool;
	
	public C7DatabaseQuery(B7ConnectionPool connectionPool) {
		this.connectionPool = connectionPool;
	}
	
	public String query(String q) {
		return String.format("Query result with %s", this.connectionPool.getConnection());
	}
	
	public String update(String q) {
		return this.query(q);
	}

	public String delete(String q) {
		return this.query(q);
	}

}
