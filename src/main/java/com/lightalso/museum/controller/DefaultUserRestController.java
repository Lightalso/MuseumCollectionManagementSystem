package com.lightalso.museum.controller;

import com.google.gson.Gson;
import com.lightalso.museum.entity.DefaultUser;
import com.lightalso.museum.mapper.DefaultUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/default_user")
public class DefaultUserRestController {
    private Gson gson = new Gson();
    @Autowired
    private com.lightalso.museum.mapper.DefaultUserMapper DefaultUserMapper;
    @GetMapping("/selectAll")
    public String selectAllDefaultUser() {
        List<DefaultUser> defaultUserList = DefaultUserMapper.selectAllDefaultUsers();
        return gson.toJson(defaultUserList);
    }
    @PostMapping("/insertOne")
    public String insertOneDefaultUser(@RequestBody DefaultUser defaultUser) {
        if (DefaultUserMapper.insertDefaultUser(defaultUser) == 1) {
            return "{result:ok}";
        }
        return "{result:error}";
    }
}
