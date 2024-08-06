package com.lightalso.museum.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class DefaultUser {
    private long id;
    private String username;
    private String password;
    private String avatar;
    private int gender;
    private String email;
    private String phone;
    private Timestamp create_time;
    private Timestamp update_time;
    private int status;
    private String nickname;
}
