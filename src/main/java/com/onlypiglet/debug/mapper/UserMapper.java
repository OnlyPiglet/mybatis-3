package com.onlypiglet.debug.mapper;

import com.onlypiglet.debug.entity.User;

import java.util.List;

/**
 * @ProjectName: mybatis-3.5.0
 * @Package: com.onlypiglet.debug.mapper
 * @ClassName: UserMapper.xml
 * @Author: 吴成昊
 * @Description:
 * @Date: 2019/9/5 16:29
 * @Version: 0.1
 */
public interface UserMapper {

   List<User> selectUsers();

   int insertUser(User  user);

}
