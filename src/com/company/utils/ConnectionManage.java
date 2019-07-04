package com.company.utils;

import java.sql.*;

import com.company.factory.ConnectionFactory;


public class ConnectionManage {
	
	public Connection conn = null;
    public PreparedStatement ps = null;
    public ResultSet rs = null;
    public CallableStatement cs = null;
    
	public Connection init(int i) throws Exception {
		ConnectionFactory zf = new ConnectionFactory();
    	conn = zf.getConnection(i);
        return conn;
    }
	
	public void destory() throws SQLException {
        if (rs != null) {
            rs.close();
        }
        if (ps != null) {
            ps.close();
        }
        if (conn != null) {
            conn.close();
        }
    }
}
