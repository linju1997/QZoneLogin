# QZoneLogin
java实现，模拟QQ空间登录，获取QQCookie
主要获取skey cookie，如需获取其他cookie，请自行修改
````java
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
````