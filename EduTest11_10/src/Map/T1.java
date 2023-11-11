package Map;

import java.util.HashMap;
import java.util.Map;


public class T1 {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();        // 创建Map对象

        map.put(1, "我");        // 添加键值对
        map.put(2, "爱");
        map.put(3, "学");
        map.put(4, "习");

        System.out.println("Map集合的内容为：" + map);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {      // 根据键从Map集合中取出值并输出
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println("键为 " + key + " 的值为：" + value);
        }
    }
}