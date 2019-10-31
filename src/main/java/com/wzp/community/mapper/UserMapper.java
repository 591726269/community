package com.wzp.community.mapper;

import com.wzp.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author wzp
 * @date 2019-10-30 11:37
 */
@Mapper
public interface UserMapper {
    @Insert("insert into user (name,account_id,token,gmtCreate,gmtModified) values (#{name},#{account_id},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);
    @Select("select * from user where token=#{token}")
    User findByToken(@Param("token") String token);
}
