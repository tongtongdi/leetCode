package fast_list;

import java.util.Arrays;

/**
 * @Description:
 * @Date: 2019/3/11
 * @Author 王通
 * @Version 1.0
 */

public class Solution {
    public static void main(String[] args) {
        int[] nums = new int[]{5, 6546, 87, 232, 6, 7, 23, 23, 565, 6, 5656};
        indexIt(nums, 0, 10);
        System.out.println(Arrays.toString(nums));
    }

    /**
     * 快速排序
     * 时间复杂度( N*log(N) )
     * @param arr
     * @param i
     * @param j
     * @return
     */
    private static int indexIt(int[] arr, int i, int j) {
        int mid = arr[i];
        int qian = i, hou = j;
        while (qian < hou) {
            while (qian < hou && arr[hou] >= mid) {
                hou--;
            }
            if (arr[hou] < mid) {
                arr[qian++] = arr[hou];
            }
            while (qian < hou && arr[qian] <= mid) {
                qian++;
            }
            if (arr[qian] > mid) {
                arr[hou--] = arr[qian];
            }
        }
        arr[qian] = mid;
        if(qian>i) indexIt(arr, i, qian - 1);
        if(hou<j) indexIt(arr, hou + 1, j);
        return mid;
    }


}









    /**
     * @冒泡排序
     */

   /* private static void quickSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int a = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = a;
                }
            }
        }
    }*/

    /**
     * @Author 王通
     * 快速排序
     */
    /*private static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            // 找寻基准数据的正确索引
            int index = getIndex(arr, low, high);

            // 进行迭代对index之前和之后的数组进行相同的操作使整个数组变成有序
            quickSort(arr, 0, index - 1);
            quickSort(arr, index + 1, high);
        }

    }

    private static int getIndex(int[] arr, int low, int high) {
        // 基准数据
        int tmp = arr[low];
        while (low < high) {
            // 当队尾的元素大于等于基准数据时,向前挪动high指针
            while (low < high && arr[high] >= tmp) {
                high--;
            }
            // 如果队尾元素小于tmp了,需要将其赋值给low
            arr[low] = arr[high];
            // 当队首元素小于等于tmp时,向前挪动low指针
            while (low < high && arr[low] <= tmp) {
                low++;
            }
            // 当队首元素大于tmp时,需要将其赋值给high
            arr[high] = arr[low];

        }
        // 跳出循环时low和high相等,此时的low或high就是tmp的正确索引位置
        // 由原理部分可以很清楚的知道low位置的值并不是tmp,所以需要将tmp赋值给arr[low]
        arr[low] = tmp;
        return low;
        // 返回tmp的正确位置
    }*/

