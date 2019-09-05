package com.onlypiglet.test.FirstTest;


import com.onlypiglet.debug.entity.User;
import com.onlypiglet.debug.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ProjectName: mybatis-3.5.0
 * @Package: com.onlypiglet.test.FirstTest
 * @ClassName: Test
 * @Author: 吴成昊
 * @Description:
 * @Date: 2019/9/5 16:40
 * @Version: 0.1
 */
public class MyTest {

  @Test
  public void FirstTest() throws IOException {

    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory =
      new SqlSessionFactoryBuilder().build(inputStream);
    SqlSession sqlsession = sqlSessionFactory.openSession();
    List<User> users = sqlsession.getMapper(UserMapper.class).selectUsers();
    users.stream().forEach(System.out::println);

  }


}
