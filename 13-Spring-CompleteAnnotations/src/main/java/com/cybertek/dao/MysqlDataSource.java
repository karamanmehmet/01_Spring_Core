package com.cybertek.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.cybertek.interfaces.DataSource;

@Repository
@Qualifier("myDataSource")
public class MysqlDataSource implements DataSource {

	public void getConnection() {
		System.out.println("MySQL Database Connection Succesfull");

	}

}
