package list;

/*
 * @Date: 2021-06-28 13:08:38
 * @Author: winterchen
 * @Description: 数组排序
 * @Version: 1.0
 * @LastEditTime: 2021-06-28 15:27:00
 */
public class ArraySort {
    

    /**
     * 冒泡排序
     * 最佳情况：t[n] = O[n], 最差情况：t[n] = O[n²], 平均：t[n] = O[n²]
     * @param array
     * @return
     */
    public static int[] bubbleSort(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    /**
     * 选择排序(非常稳定)
     * 最佳情况：T(n) = O(n2)  最差情况：T(n) = O(n2)  平均情况：T(n) = O(n2)
     * @param array
     * @return
     */
    public static int[] selectionSort(int[] array) {
        if(array == null || array.length == 0) {
            return array;
        }
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }

    /**
     * 插入排序
     * 最佳情况：T(n) = O(n)   最坏情况：T(n) = O(n2)   平均情况：T(n) = O(n2)
     * @param array
     * @return
     */
    public static int[] insertionSort(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;
            while(preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex --;
            }
            array[preIndex + 1] = current;
        }
        return array;
    }
    

    public static void print(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("array is null");
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}

