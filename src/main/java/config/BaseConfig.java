package config;

import java.util.Map;

/**
 * 一些配置参数
 * @author Administrator
 */
public class BaseConfig {
    /**
     * QQ账号
     */
    public static String qqNum;
    /**
     * QQ密码
     */
    public static String qqPwd;
    /**
     * QQ状态:(0:不需要验证码,其他需要验证码)
     */
    public static String vCode;
    /**
     * 登录QQ的验证码
     */
    public static String verifycode;
    /**
     * QQ账号16进制字符
     */
    public static String hexQQ;
    /**
     * QQ的验证码session
     */
    public static String verifysession;
    /**
     * QQ的安全加密字符
     */
    public static String loginP;
    /**
     * 登陆后的Cookie
     */
    public static Map<String, String> cookies;
}

