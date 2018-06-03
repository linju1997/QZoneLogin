package QQClient;

/**
 * @author Administrator
 */
public class Main {

    public static void main(String[] args) throws Exception {
        String qqNumber = "";
        String password = "";
        QQClient qq = new QQClient(qqNumber,password);
        boolean login = qq.loginQQ();
        if (login) {
            System.out.println("登陆成功");
            qq.getCookie().forEach((x, y) -> System.out.println(x + ":" + y));
        } else {
            System.out.println("登陆失败");
        }
    }
}
