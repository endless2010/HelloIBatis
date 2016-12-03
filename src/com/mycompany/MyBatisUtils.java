package com.mycompany;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtils {
	private static SqlSessionFactory sessionFactory=null;
	
	public static SqlSessionFactory getSqlSessionFactory(){
		if(sessionFactory==null){
			try{
				String resource="mybatis-config.xml";
				sessionFactory=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream(resource));
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		return sessionFactory;
	}
}
