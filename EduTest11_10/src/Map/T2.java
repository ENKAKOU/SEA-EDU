package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class T2 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("1", "小利");
        map.put("2", "小君");
        map.put("3", "小兰");
        map.put("4", "小鑫");;

        List<String> list = new ArrayList<>();            // 创建List对象

        for (String value : map.values()) {               // 将map集合中的值添加到list集合中
            list.add(value);
        }

        System.out.println("List集合中的数据为：" + list);
    }
}
