create table MUSEUMUSERINFO
(
    user_id          INTEGER     not null,
    user_account     VARCHAR(32) not null,
    user_password    VARCHAR(32) not null,
    user_type        INTEGER     not null,
    user_status      INTEGER     not null,
    user_nickname    VARCHAR(32),
    user_avatar      BLOB,
    user_gender      INTEGER,
    user_age         INTEGER,
    user_email       VARCHAR(64),
    user_phone       VARCHAR(32),
    user_create_time DATE        not null,
    user_modify_time DATE
)
    /

comment on table MUSEUMUSERINFO is '用户信息表'
/

comment on column MUSEUMUSERINFO.user_id is '用户ID'
/

comment on column MUSEUMUSERINFO.user_account is '用户账户'
/

comment on column MUSEUMUSERINFO.user_password is '账户密码'
/

comment on column MUSEUMUSERINFO.user_type is '用户类型'
/

comment on column MUSEUMUSERINFO.user_status is '账号状态'
/

comment on column MUSEUMUSERINFO.user_nickname is '用户昵称'
/

comment on column MUSEUMUSERINFO.user_avatar is '用户头像'
/

comment on column MUSEUMUSERINFO.user_gender is '用户性别'
/

comment on column MUSEUMUSERINFO.user_age is '用户年龄'
/

comment on column MUSEUMUSERINFO.user_email is '用户电子邮件地址'
/

comment on column MUSEUMUSERINFO.user_phone is '用户手机号码'
/

comment on column MUSEUMUSERINFO.user_create_time is '账号创建时间'
/

comment on column MUSEUMUSERINFO.user_modify_time is '账户修改时间'
/

alter table MUSEUMUSERINFO
    add constraint MUSEUMUSERINFO_PK
        primary key (USER_ID)
/

alter table MUSEUMUSERINFO
    add constraint MUSEUMUSERINFO_UNIQUE
        unique (USER_ID, USER_ACCOUNT, USER_EMAIL, USER_PHONE)
/

