package com.mycompany.type;

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
			Student student1=studentMapper.getStudent("10006");
			System.out.println(student1);
		}finally{
			if(sqlSession!=null)
				sqlSession.close();
		}
	}
}
