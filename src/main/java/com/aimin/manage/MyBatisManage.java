package com.aimin.manage;

import com.aimin.main.LogUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;

import java.io.InputStream;

public class MyBatisManage {
    private static final Logger logger = LogManage.getLogger(MyBatisManage.class);
    public static final SqlSession getSession() {
        SqlSession session = null;
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            session = sessionFactory.openSession();
        }catch (Exception e){
            logger.error(e);
            e.printStackTrace();
        }
        return session;
    }
}
