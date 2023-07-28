package com.silver.cloud.response;

public enum ResultCodeEnum {
    SUCCESS(200, true, "操作成功"),
    ADD_SUCCESS(200, true, "添加成功"),
    EXIT_SUCCESS(200, true, "退出成功"),
    UPDATE_SUCCESS(200, true, "修改成功"),
    DELETE_SUCCESS(200, true, "删除成功"),
    SEND_SUCCESS(200, true, "发送成功"),
    NEED_LOGIN(401, false, "需要登录后操作"),
    NO_AUTH(402, false, "无操作权限"),
    NAME_EXIST(403, false, "用户名已存在"),
    NO_NAME(404, false, "用户名不存在"),
    NO_USER(405, false, "用户未登录"),
    LOGIN_ERROR(406, false, "用户名或密码错误"),
    NO_LOGIN_INFO(407, false, "用户名或密码不能为空"),
    PHONE_EXIST(408, false, "手机号已存在"),
    NO_PHONE(409, false, "手机号不能为空"),
    NO_INVITATION(410, false, "邀请码不能为空"),
    NO_AUTH_CODE(411, false, "验证码有误"),
    FORMAT_PHONE(412, false, "手机号格式错误"),
    FORMAT_USERNAME(413, false, "用户名格式错误"),
    FORMAT_PASSWORD(414, false, "密码格式错误"),
    INVITATION_ERROR(415, false, "邀请码有误"),
    REGISTER_ERROR(416, false, "注册失败"),
    OLD_PSW_ERROR(417, false, "原密码错误"),
    TWO_PSW_ERROR(418, false, "两次密码不一致"),
    ADD_ERROR(419, false, "添加失败"),
    UPDATE_ERROR(420, false, "修改失败"),
    USER_LOGIN(421, false, "用户已登录,请先退出后再重试"),
    USER_NOT_ENABLE(422, false, "账户被禁用，请联系管理员"),
    DELETE_ERROR(423, false, "删除失败"),
    USER_USE_ERROR(424, false, "此用户有未完成的借用单"),
    COMPANY_EXIST(425, false, "公司名已存在"),
    SYS_ERROR(500, false, "系统异常"),
    ERROR(501, false, "操作失败"),
    FILE_OUT_MAX(502, false, "文件超出最大限制"),
    FILE_FORMAT_ERROR(503, false, "文件格式不正确"),
    PARAM_ERROR(504, false, "参数异常"),
    TOKEN_ERROR(505, false, "token非法"),
    JSON_FORMAT_ERROR(506, false, "Json解析异常"),
    UNKNOWN_INTERFACE(507, false, "未知的接口"),
    REQ_MODE_NOT_SUPPORTED(508, false, "请求方式不支持");

    /**
     * 状态码
     */
    private final int code;

    /**
     * 是否成功
     */
    private final boolean success;

    /**
     * 状态信息
     */
    private final String msg;

    public int getCode() {
        return code;
    }

    public boolean getSuccess() {
        return success;
    }

    public String getMsg() {
        return msg;
    }

    ResultCodeEnum(int code, boolean success, String msg) {
        this.code = code;
        this.success = success;
        this.msg = msg;
    }
}
