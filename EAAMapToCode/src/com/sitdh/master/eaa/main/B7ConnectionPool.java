package com.sitdh.master.eaa.main;

public class B7ConnectionPool {
	
	protected static String connectionPool;
	
	public B7ConnectionPool(String username, String password, String host) {
		connectionPool = String.format("odbc://%s:%s@%s", username, password, host);
	}
	
	public String getConnection() {
		return connectionPool;
	}

}
