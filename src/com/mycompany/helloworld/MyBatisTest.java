package com.mycompany.helloworld;

import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;

import com.mycompany.MyBatisUtils;

public class MyBatisTest {
	public static void main(String[] args){
		SqlSession sqlSession=null;
		try{
			sqlSession=MyBatisUtils.getSqlSessionFactory().openSession();
			StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
			Student student=studentMapper.getStudent("10001");
			System.out.println(student);
			Configuration config=MyBatisUtils.getSqlSessionFactory().getConfiguration();
			System.out.println(config.getDatabaseId());
		}finally{
			if(sqlSession!=null)
				sqlSession.close();
		}
	}
}
