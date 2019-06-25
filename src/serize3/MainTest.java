package serize3;

import java.util.*;

/**
 * @Description:
 * @Date: 2019/3/12
 * @Author 王通
 * @Version 1.0
 */

public class MainTest {
    public static void main(String[] args){
        HashMap<String, String> hashMap = new HashMap<>();
        Set<Integer> hashSet = new HashSet<>();
        List<Integer> list = new LinkedList<>();
        List<Integer> list1 = new ArrayList<>();
        Map<String, String> map = new Hashtable<>();
        map.put("wangtong","zhaotianqi");

        Book book1 = new Book("军人！");
        Book book2 = new Book("学生！");
        Book book3 = new Book("老人！");
        Book book4 = new Book("上班族！");
        book1.buyTick();
        book2.buyTick();
        book3.buyTick();
        book4.buyTick();
    }
}
