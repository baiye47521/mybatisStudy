package com.hand.dao;

import com.hand.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author ludongpeng
 * @Date 2020/11/30 21:09
 * @Description:
 */
public interface UserMapper {
    //查询
    User queryUserById(@Param("id") int id);

    int updateUser(User user);
}
