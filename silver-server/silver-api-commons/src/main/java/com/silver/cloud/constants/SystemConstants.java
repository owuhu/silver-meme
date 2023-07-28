package com.silver.cloud.constants;
/**
 * 系统常量
 */
public class SystemConstants {

    /**
     * 系统管理员
     */
    public static final int SYSTEM_ADMIN = 1;

    /**
     * 超级管理员
     */
    public static final int SUPER_ADMIN = 2;

    /**
     * 一般使用人员
     */
    public static final int GENERAL_USER = 4;

    /**
     * 启用状态
     */
    public static final int ENABLE = 1;

    /**
     * 禁用状态
     */
    public static final int NOT_ENABLE = 0;

    /**
     * 删除
     */
    public static final int DELETE = 1;

    /**
     * 未删除
     */
    public static final int NOT_DELETE = 0;

    /**
     * 登录过期时间(小时) redis
     */
    public static final Integer LOGIN_TIME_REDIS = 24;

    /**
     * 登录过期时间(小时) jwt
     * 60 * 60 *1000  一个小时
     */
    public static final Long LOGIN_TIME_JWT = 24 * 60 * 60 * 1000L;

    /**
     * 验证码过期时间(分钟) redis
     */
    public static final Integer CODE_TIME_REDIS = 5;

    /**
     * 登录前缀 redis
     */
    public static final String LOGIN_PREFIX_REDIS = "login:";

    /**
     * 注册前缀 redis
     */
    public static final String REGISTER_PREFIX_REDIS = "register:";
}
