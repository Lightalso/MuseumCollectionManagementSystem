package com.lightalso.museum;

import com.lightalso.museum.entity.DefaultUser;
import com.lightalso.museum.mapper.DefaultUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MuseumApplicationTests {
    @Autowired
    private DefaultUserMapper DefaultUserMapper;
    @Test
    public void contextLoads() {
        System.out.println("----------Test Output Start----------");
        List<DefaultUser> defaultUserList = DefaultUserMapper.selectList(null);
        defaultUserList.forEach(System.out::println);
    }
}
