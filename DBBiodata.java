package com.d3ti.PboLanjut20.jdbc;

import java.sql.*;
import java.util.Vector;
import com.mysql.jdbc.*; 

public class DBBiodata {
	Statement st;
	ResultSet rs;
	Connection con;
	public DBBiodata(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ooplan?user=root&password=");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
	}
	public Vector data() {
		try {
			st = (Statement) con.createStatement();
			rs = (ResultSet) ((java.sql.Statement) st).executeQuery("SELECT * FROM datadiri");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Vector dBdata = new Vector(1);

		try {
			while(rs.next()){
				Vector rows = new Vector();
				rows.add(rs.getString(1));
				rows.add(rs.getString(2));
				rows.add(rs.getString(3));
				rows.add(rs.getString(4));
				rows.add(rs.getString(5));
				rows.add(rs.getString(6));
				rows.add(rs.getString(7));
				dBdata.addElement(rows);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dBdata;
	}
		
	

}
