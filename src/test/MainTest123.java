package test;

/**
*狗屁菲，我爱你呦，么么哒！
**/

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Date: 2019/5/14
 * @Author 王通
 * @Version 1.0
 */

public class MainTest123 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("admin", "wangtong");
        System.out.println(map.containsValue("wangtong"));
    }
}
