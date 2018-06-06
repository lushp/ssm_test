package com.lsp.dao;

import com.lsp.model.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;

@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IUserDaoTest {

    @Autowired
    private IUserDao dao;


    private static String xmlePath = "/spring-mybatis.xml";
    @Test
    public void testSelectUser() throws Exception {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlePath);
        dao = applicationContext.getBean(IUserDao.class);
        long id = 1;
        User user = dao.selectUser(id);
        System.out.println(user.getUsername());
    }

}