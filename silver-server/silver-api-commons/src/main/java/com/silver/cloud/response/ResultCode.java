package com.silver.cloud.response;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
@Data
@Builder
public class ResultCode implements Serializable {

    private static final long serialVersionUID = 3713900832976127079L;

    /**
     * 状态码
     */
    private int code;

    /**
     * 是否成功
     */
    private boolean success;

    /**
     * 状态信息
     */
    private String msg;

    /**
     * 默认成功
     */
    public final static ResultCode SUCCESS = dispose(ResultCodeEnum.SUCCESS);

    /**
     * 添加成功
     */
    public final static ResultCode ADD_SUCCESS = dispose(ResultCodeEnum.ADD_SUCCESS);

    /**
     * 退出成功
     */
    public final static ResultCode EXIT_SUCCESS = dispose(ResultCodeEnum.EXIT_SUCCESS);

    /**
     * 修改成功
     */
    public final static ResultCode UPDATE_SUCCESS = dispose(ResultCodeEnum.UPDATE_SUCCESS);

    /**
     * 删除成功
     */
    public final static ResultCode DELETE_SUCCESS = dispose(ResultCodeEnum.DELETE_SUCCESS);

    /**
     * 发送成功
     */
    public final static ResultCode SEND_SUCCESS = dispose(ResultCodeEnum.SEND_SUCCESS);

    /**
     * 修改失败
     */
    public final static ResultCode UPDATE_ERROR = dispose(ResultCodeEnum.UPDATE_ERROR);

    /**
     * 需要登录后操作
     */
    public final static ResultCode NEED_LOGIN = dispose(ResultCodeEnum.NEED_LOGIN);

    /**
     * 无操作权限
     */
    public final static ResultCode NO_AUTH = dispose(ResultCodeEnum.NO_AUTH);

    /**
     * 用户名已存在
     */
    public final static ResultCode NAME_EXIST = dispose(ResultCodeEnum.NAME_EXIST);

    /**
     * 公司名已存在
     */
    public final static ResultCode COMPANY_EXIST = dispose(ResultCodeEnum.COMPANY_EXIST);

    /**
     * 用户名或密码错误
     */
    public final static ResultCode LOGIN_ERROR = dispose(ResultCodeEnum.LOGIN_ERROR);

    /**
     * 用户名或密码不能为空
     */
    public final static ResultCode NO_LOGIN_INFO = dispose(ResultCodeEnum.NO_LOGIN_INFO);

    /**
     * 手机号已存在
     */
    public final static ResultCode PHONE_EXIST = dispose(ResultCodeEnum.PHONE_EXIST);

    /**
     * 手机号不能为空
     */
    public final static ResultCode NO_PHONE = dispose(ResultCodeEnum.NO_PHONE);

    /**
     * 邀请码不能为空
     */
    public final static ResultCode NO_INVITATION = dispose(ResultCodeEnum.NO_INVITATION);

    /**
     * 用户已登录
     */
    public final static ResultCode USER_LOGIN = dispose(ResultCodeEnum.USER_LOGIN);

    /**
     * 账户被禁用
     */
    public final static ResultCode USER_NOT_ENABLE = dispose(ResultCodeEnum.USER_NOT_ENABLE);

    /**
     * 验证码有误
     */
    public final static ResultCode NO_AUTH_CODE = dispose(ResultCodeEnum.NO_AUTH_CODE);

    /**
     * 手机号格式错误
     */
    public final static ResultCode FORMAT_PHONE = dispose(ResultCodeEnum.FORMAT_PHONE);

    /**
     * 用户名格式错误
     */
    public final static ResultCode FORMAT_USERNAME = dispose(ResultCodeEnum.FORMAT_USERNAME);

    /**
     * 密码格式错误
     */
    public final static ResultCode FORMAT_PASSWORD = dispose(ResultCodeEnum.FORMAT_PASSWORD);

    /**
     * 邀请码有误
     */
    public final static ResultCode INVITATION_ERROR = dispose(ResultCodeEnum.INVITATION_ERROR);

    /**
     * 原密码错误
     */
    public final static ResultCode OLD_PSW_ERROR = dispose(ResultCodeEnum.OLD_PSW_ERROR);

    /**
     * 用户含有未完成的借用单
     */
    public final static ResultCode USER_USE_ERROR = dispose(ResultCodeEnum.USER_USE_ERROR);

    /**
     * 两次密码不一致
     */
    public final static ResultCode TWO_PSW_ERROR = dispose(ResultCodeEnum.TWO_PSW_ERROR);

    /**
     * 添加失败
     */
    public final static ResultCode ADD_ERROR = dispose(ResultCodeEnum.ADD_ERROR);

    /**
     * 删除失败
     */
    public final static ResultCode DELETE_ERROR = dispose(ResultCodeEnum.DELETE_ERROR);

    /**
     * 用户名未找到
     */
    public final static ResultCode NO_NAME = dispose(ResultCodeEnum.NO_NAME);

    /**
     * 注册失败
     */
    public final static ResultCode REGISTER_ERROR = dispose(ResultCodeEnum.REGISTER_ERROR);

    /**
     * 用户未登录
     */
    public final static ResultCode NO_USER = dispose(ResultCodeEnum.NO_USER);
    /**
     * 默认失败
     */
    public final static ResultCode ERROR = dispose(ResultCodeEnum.ERROR);
    /**
     * 文件超出最大限制
     */
    public final static ResultCode FILE_OUT_MAX = dispose(ResultCodeEnum.FILE_OUT_MAX);
    /**
     * 文件格式不正确
     */
    public final static ResultCode FILE_FORMAT_ERROR = dispose(ResultCodeEnum.FILE_FORMAT_ERROR);
    /**
     * 参数错误
     */
    public final static ResultCode PARAM_ERROR = dispose(ResultCodeEnum.PARAM_ERROR);
    /**
     * Json解析异常
     */
    public final static ResultCode JSON_FORMAT_ERROR = dispose(ResultCodeEnum.JSON_FORMAT_ERROR);
    /**
     * 未知的接口
     */
    public final static ResultCode UNKNOWN_INTERFACE = dispose(ResultCodeEnum.UNKNOWN_INTERFACE);
    /**
     * 请求方式不支持
     */
    public final static ResultCode REQ_MODE_NOT_SUPPORTED = dispose(ResultCodeEnum.REQ_MODE_NOT_SUPPORTED);
    /**
     * TOKEN非法
     */
    public final static ResultCode TOKEN_ERROR = dispose(ResultCodeEnum.TOKEN_ERROR);
    /**
     * 系统异常
     */
    public final static ResultCode SYS_ERROR = dispose(ResultCodeEnum.SYS_ERROR);

    private static ResultCode dispose(ResultCodeEnum codeEnum) {
        return ResultCode.builder().code(codeEnum.getCode()).success(codeEnum.getSuccess()).msg(codeEnum.getMsg()).build();
    }

    public ResultCode(int code, boolean success, String msg) {
        this.code = code;
        this.success = success;
        this.msg = msg;
    }
}
