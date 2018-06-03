package QQClient;

/**
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) throws Exception {
        QQClient qq = new QQClient("2558807914", "QIAO520...");
        boolean b = qq.loginQQ();
        if (b) {
            System.out.println("登陆成功");
            qq.getCookie().forEach((x, y) -> {
                System.out.println(x + ":" + y);
            });
        } else {
            System.out.println("登陆失败");
        }
    }
}
