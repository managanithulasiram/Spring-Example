package com.creativelearn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestConection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String URL="jdbc:h2:tcp://localhost/~/shopping";
		String UseName="sa";
		String Password="";
		try {
			System.out.println("Start Connection");
			Connection mycon=
					DriverManager.getConnection(URL,UseName,Password);
			System.out.println("Connection Success");
		}
catch(Exception e){
	e.printStackTrace();
	
}
	}

}
