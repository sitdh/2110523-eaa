package com.sitdh.master.eaa.main;

public class A7Connection {
	
	protected B7ConnectionPool connectionPool;
	
	public A7Connection(String username, String password, String host) {
		connectionPool = new B7ConnectionPool(username, password, host);
	}
	
	public void connect() {
		System.out.println("conn> Start connection");
		System.out.println(String.format("conn> connection with message \"%s\"", connectionPool.getConnection()));
		System.out.println("conn> Connected");
	}
	
	public String query(String query) {
		C7DatabaseQuery q = new C7DatabaseQuery(connectionPool);
		return q.query(query);
	}

}
