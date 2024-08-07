package com.lightalso.museum.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lightalso.museum.entity.DefaultUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DefaultUserMapper extends BaseMapper<DefaultUser> {
    @Select("select * from default_user")
    List<DefaultUser> selectAllDefaultUsers();
    @Insert("insert into default_user(id, username) values (#{id}, #{username})")
    int insertDefaultUser(DefaultUser defaultUser);
}
