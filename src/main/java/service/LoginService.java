package service;

/**
 *
 * @author Administrator
 */
public interface LoginService {

	/**
	 * desc: 检查QQ状态(检查是否需要验证码)
	 * @throws Exception 异常
     * @return 是否需要手工验证
	 */
	boolean checkQQ() throws Exception;
	
	/**
	 * desc: 提交登陆QQ
	 * @throws Exception 异常
	 * @return 是否登录成功
	 */
	boolean loginQQ() throws Exception;

}
