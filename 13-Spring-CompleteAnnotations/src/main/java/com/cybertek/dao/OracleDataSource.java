package com.cybertek.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.cybertek.interfaces.DataSource;

@Repository
@Primary
@Qualifier("orclDataSource")
public class OracleDataSource implements DataSource{

	public void getConnection() {
		System.out.println("Oracle Database Connection Succesfull");
		
	}

}
