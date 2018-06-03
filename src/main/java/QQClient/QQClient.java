package QQClient;


import config.BaseConfig;
import service.LoginService;
import service.impl.LoginServiceImpl;

import java.util.Map;

/**
 * 封装后的QQ客户端
 * @author Administrator
 */
class QQClient {
    /**
     * 登陆业务
     */
    private LoginService loginService = new LoginServiceImpl();

    QQClient(String qqNumber, String password) {
        BaseConfig.qqNum = qqNumber;
        BaseConfig.qqPwd = password;
    }

    /**
     * desc: 登陆QQ
     * @throws Exception 异常
     */
    boolean loginQQ() throws Exception {
        boolean checkQQ = loginService.checkQQ();
        if (checkQQ) {
            return loginService.loginQQ();
        }
        return false;
    }

    Map<String, String> getCookie() {
        return BaseConfig.cookies;
    }
}
