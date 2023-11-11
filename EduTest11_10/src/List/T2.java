package List;

import java.util.ArrayList;
import java.util.List;


public class T2 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 0, 6, 0, 9, 7, 0, 0, 3};
        List<Integer> nonZeroList = new ArrayList<>();

        for(int value: arr) {
            if(value != 0) {
                nonZeroList.add(value);

            }
        }

        if(nonZeroList.isEmpty()) {
            System.out.println("数组中没有非零元素");
        } else {
            System.out.println("集合中不能为0的数据如下：");
            for(int value: nonZeroList) {
                System.out.print(value + "");
            }
        }
    }
}
