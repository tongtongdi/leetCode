package fast_list.want;

/**
 * @Description:
 * @Date: 2019/4/24
 * @Author 王通
 * @Version 1.0
 */

public class Bank {
    private static  Integer moneny = 500;

    public  Integer get(Integer number) {
        synchronized(Bank.class){
            return moneny = moneny - number;
        }

    }

    public  static Integer getMoneny() {
        synchronized(Bank.class){
            return moneny;
        }
    }

    public static void setMoneny(Integer moneny) {
        Bank.moneny = moneny;
    }
}
